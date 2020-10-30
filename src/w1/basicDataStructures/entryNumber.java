package w1.basicDataStructures;

public class entryNumber {
    public static int solution(Node<String> head, String elem){
        Node p = head;
        int indx=-1;
        int current=0;

        while(p!=null){
            if(p.value.equals(elem)){
                indx=current;
                break;
            }
            current=current+1;
            p=p.next;
        }
        return indx;
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
