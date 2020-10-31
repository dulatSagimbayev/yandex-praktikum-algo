package w4;
import java.util.Queue;
import java.io.IOException;
import java.util.LinkedList;

public class anagramTree {
    //    public static void main(String [] args) throws IOException {
//
//            Node root1 = new Node(1);
//            Node root2 = new Node(1);
//            Node l1=new Node(2);
//            Node r1=new Node(4);
//            Node l2=new Node(8);
//            Node r2=new Node(10);
//            Node l3=new Node(3);
//            Node r3=new Node(6);
//            Node r4=new Node(17);
//            root1.left = l1;
//            root1.right=l1;
//
//            root1.left.left=l3;
//            root1.right.right=r1;
//
//            root1.left.right=r1;
//            root1.right.left=l3;
////            root1.right=r1;
////            root2.left=l1;
////            root2.right=r1;
////            root.left.left=l2;
////            root.left.right=r2;
////            root.right.left=l3;
////            root.right.right=r3;
//
//            System.out.println(treeSolution(root1));
//
//        }

    public static String treeSolution(Node head) {

        boolean result = false;

        if (head == null) {
            return "True";
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(head.left);
        queue.offer(head.right);

        while (!queue.isEmpty()) {
            Node left = queue.poll();
            Node right = queue.poll();

            if (left == null && right == null) {

                result = true;

            } else if (left == null ||
                    right == null ||
                    left.value != right.value) {
                // It is required to set result = false here
                result = false;
                break;
            } else if (left != null && right != null) {
                queue.offer(left.left);
                queue.offer(right.right);

                queue.offer(left.right);
                queue.offer(right.left);
            }

        }
        return result? "True" :"False";
    }
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
}
