package w4;

import java.io.IOException;

public class maxTreeValue {
    static int max  = Integer.MIN_VALUE;
//    public static void main(String [] args) throws IOException {
//
//            Node root = new Node(1);
//            Node l1=new Node(3);
//            Node r1=new Node(5);
//            Node l2=new Node(8);
//            Node r2=new Node(10);
//            Node l3=new Node(-2);
//            Node r3=new Node(6);
//            root.left=l1;
//            root.right=r1;
//            root.left.left=l2;
//            root.left.right=r2;
//            root.right.left=l3;
//            root.right.right=r3;
//            System.out.println(treeSolution(root));
//
//
//
//
//
//        }

    public static String treeSolution(Node head){
        if(head.value>max){
            max=head.value;
        }
        if(head.right!=null){
            if(max<head.right.value){
                max=head.right.value;
            }
            treeSolution(head.right);
        }
        if(head.left!=null){
            if(max<head.left.value){
                max=head.left.value;
            }
            treeSolution(head.left);
        }
        return Integer.toString(max);
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
