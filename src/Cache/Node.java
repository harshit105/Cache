package Cache;

class Node {
    private final String key;
    private String value;
    private Node next;
    private Node prev;

    Node(String k, String v){
        this.key = k;
        this.value = v;
        this.next = null;
        this.prev = null;
    }

    String getKey() {
        return key;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    public String toString() {
        return "{"+key+","+value+"}";
    }
}
