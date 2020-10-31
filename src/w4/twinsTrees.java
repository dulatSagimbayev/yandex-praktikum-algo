package w4;

public class twinsTrees {
    static String some= "True";
//    public static void main(String [] args) throws IOException {
//
//            Node root1 = new Node(1);
//            Node root2 = new Node(1);
//            Node l1=new Node(3);
//            Node r1=new Node(5);
//            Node l2=new Node(8);
//            Node r2=new Node(10);
//            Node l3=new Node(-2);
//            Node r3=new Node(6);
//            Node r4=new Node(17);
//            root1.left=l1;
//            root1.right=r1;
//            root2.left=l1;
//            root2.right=r1;
////            root.left.left=l2;
////            root.left.right=r2;
////            root.right.left=l3;
////            root.right.right=r3;
//            Node [ ] arr = new Node[2];
//            arr[0] =root1;
//            arr[1]=root2;
//            System.out.println(treeSolution(arr));
//
//        }

    public static String treeSolution(Node[] heads){

        if(heads[0].value!=heads[1].value){
            some="False";
        }
        if(heads[0].right!=null && heads[1].right!=null){
            if(heads[0].right.value!=heads[1].right.value){
                some="False";
            }
            heads[0]= heads[0].right;
            heads[1]=heads[1].right;
            treeSolution(heads);
        }
        if(heads[0].left!=null && heads[1].left!=null){
            if(heads[0].left.value!=heads[1].left.value){
                some="False";
            }
            heads[0]= heads[0].left;
            heads[1]=heads[1].left;
            treeSolution(heads);
        }
        if ((heads[0].right!=null && heads[1].right==null) ||(heads[0].right==null && heads[1].right!=null)){
            some="False";
        }
        if ((heads[0].left!=null && heads[1].left==null) ||(heads[0].left==null && heads[1].left!=null)){
            some="False";
        }



        return some;
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
