package Cache;

public class DoubleLinkedList {
    Node head;
    Node tail;
    DoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }
    boolean nodeExists(Node node){
        Node current = head;
        while(current!=null){
            if(current==node){
                return true;
            }
            current=current.getNext();
        }
        return false;
    }
    void deleteFromList(Node node){
        if(node==null || !nodeExists(node)){
            return;
        }
        Node prev = node.getPrev();
        Node next = node.getNext();
        if (prev == null && next == null) {
            head = null;
            tail = null;
            return;
        }
        if (prev == null) {
            next.setPrev(null);
            head = next;
            return;
        }
        if (next == null) {
            prev.setNext(null);
            tail = prev;
            return;
        }
        prev.setNext(next);
        next.setPrev(prev);
    }
    void setListHead(Node node){
        if(head==null){
            head = node;
            tail= node;
            return;
        }
        Node currentHead = head;
        node.setNext(currentHead);
        currentHead.setPrev(node);
        head = node;
    }

    void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.toString()+"<-->");
            current = current.getNext();
        }
        System.out.println();
    }
}