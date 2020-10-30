package w1.basicDataStructures;

public class list {
    public static void solution(Node<String> head){
        Node current = head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }
    class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V value, Node<V> next) {
            this.value = value;
            this.next = next;
        }
    }
}
