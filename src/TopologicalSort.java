import java.util.*;

public class TopologicalSort{
    /**
     * Given directed acyclic graph, return a topological sorting of the nodes in the graph
     * @param <T> generic type
     * @param graph A directed Acycle graph.
     * @return A topological sort of that graph
     * @throws IllegalArgumentException if the graph is not a Directed Acyclic Graph
     */
    public static <T> List<InDegreeNode<T>> sort(DirectedGraph<T> graph){
        // create a reverse graph from the input graph
        DirectedGraph<T> reverseGraph = reverseGraph(graph);
        
        /**
         * Maintain two structures: a set of visited nodes, and a list of nodes that 
         * holds the topological sorting
         */
        List<InDegreeNode<T>> result = new ArrayList<InDegreeNode<T>>();
        Set<InDegreeNode<T>> visited = new HashSet<InDegreeNode<T>>();
        
        /**
         * Maintain a set consisting of all nodes that have been fully expanded. If the graph contains a cycle
         * then we can detect this by noting that a node has been explored but not fully expanded
         */
        Set<InDegreeNode<T>> expanded = new HashSet<InDegreeNode<T>>();
        
        //Fire off a DFS from each node in the graph
        for(InDegreeNode<T> node: reverseGraph){
            explore(node, reverseGraph, result, visited, expanded);
        }
        
        return result;
    }
    
    /**
     * Recursively perform a DFS from the specified node, marking all nodes encountered by the search
     * @param <T> genetic type
     * @param node the node to begin the search
     * @param graph the graph in which to perform the search
     * @param order a list holding the topological sort of the graph
     * @param visited a set of nodes that already been visited
     * @param expanded a set of nodes that have been fully expanded.
     */
    private static <T> void explore(InDegreeNode<T> node, DirectedGraph<T> graph, List<InDegreeNode<T>> order, Set<InDegreeNode<T>> visited, Set<InDegreeNode<T>> expanded){
        // Check if node is visited
        if(visited.contains(node)){
            if(expanded.contains(node)) return;
            throw new IllegalArgumentException("graph contains a acycle");
        }
        
        // Mark node visited
        visited.add(node);
        
        // Recursively explore all of the node's predecessors
        for(InDegreeNode<T> predecessor: graph.edgesFrom(node)){
            explore(predecessor, graph, order, visited, expanded);
        }
        
        // Having explored all the node's predecessors, add node to the sorted ordering
        order.add(node);
        
        // Mark the node is done being expanded
        expanded.add(node);
    }
    
    /**
     * Return reverse of the input graph
     * @param graph the graph to reverse
     * @return Reversed Graph
     */
    private static <T> DirectedGraph<T> reverseGraph(DirectedGraph<T> graph){
        DirectedGraph<T> result = new DirectedGraph<T>();
        
        // Add all the nodes from the original graph
        for(InDegreeNode<T> node: graph){
            result.addNode(node);
        }
        
        // Scan over all the edges in the graph, adding their reverse to the reverse graph.
        for(InDegreeNode<T> node: graph){
            for(InDegreeNode<T> endPoint: graph.edgesFrom(node)){
                result.addEdge(endPoint, node);
            }
        }
        
        return result;
    }
}