package w1.basicDataStructures;

public class removeElement {
    public static Node<String> solution(Node<String> head, int idx){
        Node p = head;
        Node q= head.next;
        int current = 1;
        if(idx==0){
            return q;
        }
        while(q!=null){
            if(current==idx){
                p.next=q.next;
                break;
            }
            current=current+1;
            p=p.next;
            q=q.next;
        }
        return head;
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
