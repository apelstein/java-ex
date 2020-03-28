public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){

    }

    public int getSize(){
        return this.size;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public Node get(int index){
        Node ptr = head;
        int i = 0;
        while(i<index && ptr != null){
            i++;
            ptr = ptr.getNext();
        }

        return ptr;
    }

    public void insertAt(Node node, int index){
        Node ptr = head;
        int i = 0;
        size++;
        if(index > size){
            tail = node;
        }
        if(head == null || index == 0){
            node.setNext(head);
            head = node;
            return;
        }
        while(ptr.getNext() != null && i < index-1){
            i++;
            ptr = ptr.getNext();
        }
        node.setNext(ptr.getNext());
        ptr.setNext(node);

    }

    public Node removeAtIdex(int index){
        if(size == 0){
            return null;
        }
        size--;
        Node ptr = head;
        if(index == 0){
            head = head.getNext();
            ptr.setNext(null);
            if(size == 0){
                tail = null;
            }
            return ptr;
        }
        int i = 0;
        while(i <= size && i < index - 1){
            ptr = ptr.getNext();
            i++;
        }
        if(ptr == null){
            size++;
            return null;
        }
        Node toRet = ptr.getNext();
        if(toRet!=null){
            ptr.setNext(ptr.getNext().getNext());
            toRet.setNext(null);
        } else {
            size++;
        }
        if(index == size){
            tail = ptr;
        }
        return toRet;
    }

    public String toString(){
        Node ptr = head;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size: ");
        stringBuilder.append(size);
        stringBuilder.append("\n");
        while(ptr != null){
            stringBuilder.append(ptr + " -> ");
            ptr = ptr.getNext();
        }
        stringBuilder.append("[X]\n");
        return stringBuilder.toString();
    }
}
