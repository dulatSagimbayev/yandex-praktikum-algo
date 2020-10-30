package w1.basicDataStructures;

public class reversedList {
    public static Node<String> solution(Node<String> head){
        Node p = head;
        Node newHead = null;
        while (p.next!=null){
            p=p.next;
        }
        Node tmp;
        newHead=p;
        while(p!=null){
            tmp = p.next;
            p.next=p.prev;
            p.prev=tmp;
            p=p.next;
        }

        return newHead;
    }
    class Node<V> {
        public V value;
        public Node<V> next;
        public Node<V> prev;

        public Node(V value, Node<V> next, Node<V> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
