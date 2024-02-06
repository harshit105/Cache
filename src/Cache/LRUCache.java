package Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Node head;
    private Node tail;
    private final int capacity;
    private final Map<String, Node> map;
    private DoubleLinkedList list;

    public LRUCache(int capacity){
        this.capacity= capacity;
        this.map = new HashMap<String,Node>();
        this.list = new DoubleLinkedList();
        this.head = list.head;
        this.tail = list.tail;
    }
    public String get(String key){
        if(!map.containsKey(key)){
            return null;
        }
        Node node = map.get(key);
        list.deleteFromList(node);
        list.setListHead(node);
        return node.getValue();
    }
    public void put(String key, String value){
        if(key==null || value==null){
            return;
        }
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.setValue(value);
            list.deleteFromList(node);
            list.setListHead(node);
        }
        else{
            if(map.size()>capacity){
                map.remove(tail.getKey());
                list.deleteFromList(tail);
            }
            Node node = new Node(key, value);
            map.put(key,node);
            list.setListHead(node);
        }
    }

}
