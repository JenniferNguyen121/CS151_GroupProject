public class InDegreeNode<T>{
    int inDegree;
    T node;
    
    public InDegreeNode(T node){
        this.inDegree = 0;
        this.node = node;
    }
    public int getInDegree(){
        return this.inDegree;
    }
    public void increaseInDegree(){
        this.inDegree++;
    }
    public void decreaseInDegree(){
        this.inDegree--;
    }
    
    public T getNode(){
        return this.node;
    }
}