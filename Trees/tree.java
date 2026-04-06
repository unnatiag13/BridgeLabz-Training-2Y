class Node{
    char data;
    Node left;
    Node right;

    Node(char data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree{
    public static void main(String[] args) {
        //level1
        Node root = new Node('A');
        // level2
        root.left = new Node('B');
        root.right = new Node('C');
        //level3
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.left = new Node('G');
        root.right.right = new Node('H');
        //level4
        root.left.right.left=new Node('I');
        root.left.right.right=new Node('J');
        root.right.left.left=new Node('K');

        // preorder (root,left,right) : A B D E I J C G K H
        // inorder (left,root,right) : D B I E J A K G C
        // postorder (left,right,root) : D I J E B K G H C A

        public static void preOrder(Node root){
            if(root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null) return;
            System.out.print(root.data+" ");
            postOrder(root.left);
            postOrder(root.right);
        }
    }
}