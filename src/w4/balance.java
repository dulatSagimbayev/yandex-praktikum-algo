package w4;
import java.io.IOException;

public class balance {
    private static <T> int checkBalance(Node node){
        if(node == null) return 0;
        int left = checkBalance(node.left);

        if(left == -1) return -1;

        int right = checkBalance(node.right);

        if(right == -1) return -1;

        if(Math.abs(left - right) > 1){
            return -1;
        }else{
            return 1 + Math.max(left, right);
        }
    }

//    public static void main(String [] args) throws IOException {
//
//            Node root1 = new Node(0);
//            Node root2 = new Node(1);
//            Node l1=new Node(2);
//            Node r1=new Node(4);
//            Node l2=new Node(8);
//            Node r2=new Node(10);
//            Node l3=new Node(12);
//            Node r3=new Node(8);
//            Node r4=new Node(7);
//            root1.left=l1;
//
//            root1.right=r4;
//            root1.right.right=r3;
//            root1.right.left=r1;
//
//            root1.right.left.left=l3;
//
//
//
//
//            System.out.println(treeSolution(root1));
//
//        }

    public static String treeSolution(Node head) {
        if(checkBalance(head)!=-1){
            return "True";
        }
        else{
            return "False";
        }
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
