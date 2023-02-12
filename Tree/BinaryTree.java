package Tree;
/**
 * @author Prashant
 */
//Binary Tree

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root=null;
    //add
    public void add(int data){
        Node n1=new Node(data);
        if(root==null){
            root=n1;
        }
        else{
            Node temp=root;
            while(true){
                if(data<temp.data){
                    if(temp.left==null){
                        temp.left=n1;
                        break;
                    }
                    else{
                        temp=temp.left;
                    }
                }
                else{
                    if(temp.right==null){
                        temp.right=n1;
                        break;
                    }
                    else{
                        temp=temp.right;
                    }
                }
            }
        }
    }
    //preOrder
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //inOrder
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        else{
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    //postOrder
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    //main
    public static void main(String[] args){
        BinaryTree bt=new BinaryTree();
        bt.add(10);
        bt.add(5);
        bt.add(15);
        bt.add(3);
        bt.add(7);
        bt.add(12);
        bt.add(18);
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
    
}
