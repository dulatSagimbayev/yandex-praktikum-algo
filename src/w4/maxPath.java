package w4;

public class maxPath {
    public static class Container {
        public int value;
    }
//    public static void main (String [] args){
//        Node root1 = new Node(-9);
//        Node l1 = new Node(2);
//        Node r1 = new Node(3);
//        Node r1r = new Node(0);
//        Node r1l = new Node(4);
//        Node l1r1 = new Node(3);
//        Node l1l1 = new Node(-7);
//        Node l1l1l = new Node(-1);
//        Node l1r1r = new Node(-6);
//        Node l1r1l = new Node(9);
//
//        Node root2 = new Node(-1);
//
//
//
//        root1.left = l1;
//        root1.right=r1;
//
//        root1.right.right=r1r;
//        root1.right.left=r1l;
//
//        root1.left.left=l1l1;
//        root1.left.left.left=l1l1l;
//
//        root1.left.right=l1r1;
//
//        root1.left.right.left=l1r1l;
//        root1.left.right.right=l1r1r;
//        System.out.println(treeSolution(root1));
//
//    }

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
    static int maxSum(Node node, Container container) {

        if (node == null)
            return 0;

        int left = maxSum(node.left, container );
        int right = maxSum(node.right, container);

        int max_single = Math.max(Math.max(left, right) + node.value,
                node.value);

        int max_top = Math.max(max_single, left + right + node.value);


        container.value= Math.max(container.value, max_top);

        return max_single;
    }

    public static String treeSolution(Node node)
    {
        Container container = new Container();
        container.value=Integer.MIN_VALUE;
        maxSum(node, container);
        return Integer.toString(container.value);
    }
}
