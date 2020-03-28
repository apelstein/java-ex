
public class Node<T> {

    private T data;
    private Node next;

    public T getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "{data:"+data.toString()+"} ";
    }

}
