
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch<T>{
    public List<InDegreeNode<T>> sort(DirectedGraph<T> graph, InDegreeNode<T> startNode){
        ArrayQueue<InDegreeNode<T>> queue = new ArrayQueue<>();
        List<InDegreeNode<T>> result = new ArrayList<InDegreeNode<T>>();
        
        queue.enqueue(startNode);
        
        while(!queue.isEmpty()){
            InDegreeNode<T> currentNode = queue.dequeue();
            result.add(currentNode);
            
            Set<InDegreeNode<T>> outgoingNodeSet = graph.edgesFrom(currentNode);
            Iterator<InDegreeNode<T>> iterator = outgoingNodeSet.iterator();
            while(iterator.hasNext()){
                InDegreeNode<T> inDegreeNode = iterator.next();
                if(inDegreeNode != null){
                    inDegreeNode.decreaseInDegree();
                
                    if(inDegreeNode.getInDegree() == 0){
                        queue.enqueue(inDegreeNode);
                    }
                }
                else break;
            }
        }
        return result;
        
    }
}