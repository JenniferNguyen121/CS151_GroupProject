/*
* Linh Phan
*/
import java.util.*;
/**
 * A class representing a directed graph. 
 * The class is represented by an adjacency list.
 */
public class DirectedGraph<T> implements Iterable<InDegreeNode<T>>{
    /**
     * A map from nodes in the graph -> to sets of outgoing edges.
     * Each set of edges is represented by a map from edges to doubles.
     */
    private Map<InDegreeNode<T>, Set<InDegreeNode<T>>> graph = new HashMap<InDegreeNode<T>,Set<InDegreeNode<T>>>();
    
    /**
     * Add a new node to the graph. If the node already exists, return false.
     * @param node the Node to add
     * @return boolean. If the non-existing node are added or not
     */
    public boolean addNode(InDegreeNode<T> node){
        // check if the node is already in the graph
        if(graph.containsKey(node)){
            return false;
        }
        // Add node with empty set of outgoing edges
        graph.put(node, new HashSet<InDegreeNode<T>>());
        return true;
    }
    
    /**
     * Add an arc from source -> destination node
     * @param source the source node
     * @param destination the destination node
     * @throws NoSuchElementException if the start or destination node do not exist
     */
    public void addEdge(InDegreeNode<T> source, InDegreeNode<T> destination){
        if(!graph.containsKey(source) || !graph.containsKey(destination)){
            throw new NoSuchElementException("One of the nodes is not in the graph");
        }
        
        graph.get(source).add(destination); // Add the edge source -> destination
        destination.increaseInDegree();
    }
    
    /**
     * Remove the arc between source -> destination node
     * @param source the source node
     * @param destination the destination node
     * @throws NoSuchElementException if the start or destination node do not exist
     */
    public void removeEdge(InDegreeNode<T> source, InDegreeNode<T> destination){
        if(!graph.containsKey(source) || !graph.containsKey(destination)){
            throw new NoSuchElementException("One of the nodes is not in the graph");
        }
        
        graph.get(source).remove(destination); // remove the edge
        destination.decreaseInDegree();
    }
    
    /**
     * Check if there's an edge between two node
     * @param source the source node
     * @param destination the destination node
     * @return if the edge does exist or not
     */
    public boolean isEdgeExist(InDegreeNode<T> source, InDegreeNode<T> destination){
        if(!graph.containsKey(source) || !graph.containsKey(destination)){
            throw new NoSuchElementException("One of the nodes is not in the graph");
        }
        
        return graph.get(source).contains(destination);
    }
    
    /**
     * Given a node in the graph, returns an immutable view of the edges LEAVING
     * that node as a set of endpoints
     * @param node the node whose edges should be queried
     * @return an immutable view of the edges leaving that node
     * @throws NoSuchElementException if the node does not exist
     */
    public Set<InDegreeNode<T>> edgesFrom(InDegreeNode<T> node){
        Set<InDegreeNode<T>> outgoingSet = graph.get(node);
        
        
        return outgoingSet;
    }
    
    /**
     * Return an iterator that can traverse the nodes in the graph
     * @return iterator that can traverse the nodes in the graph
     */
    public Iterator<InDegreeNode<T>> iterator(){
        return graph.keySet().iterator();
    }
    
    /**
     * Number of nodes in the graph
     * @return Number of nodes in the graph
     */
    public int size(){
        return graph.size();
    }
    
    /**
     * Check if the graph is empty
     * @return if the graph is empty or not.
     */
    public boolean isEmpty(){
        return graph.isEmpty();
    }
}