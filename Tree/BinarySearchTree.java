package Tree;
/**
 * @author Prashant
 */
//Binary Search Tree

public class BinarySearchTree {
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
    //search
    public boolean search(int data){
        Node temp=root;
        while(temp!=null){
            if(data==temp.data){
                return true;
            }
            else if(data<temp.data){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        return false;
    }
    //delete
    public void delete(int data){
        Node temp=root;
        Node parent=null;
        while(temp!=null){
            if(data==temp.data){
                break;
            }
            else if(data<temp.data){
                parent=temp;
                temp=temp.left;
            }
            else{
                parent=temp;
                temp=temp.right;
            }
        }
        if(temp==null){
            System.out.println("Not Found");
        }
        else{
            //case 1 : no child
            if(temp.left==null && temp.right==null){
                if(parent.left==temp){
                    parent.left=null;
                }
                else{
                    parent.right=null;
                }
            }
            //case 2 : one child
            else if(temp.left==null || temp.right==null){
                if(temp.left==null){
                    if(parent.left==temp){
                        parent.left=temp.right;
                    }
                    else{
                        parent.right=temp.right;
                    }
                }
                else{
                    if(parent.left==temp){
                        parent.left=temp.left;
                    }
                    else{
                        parent.right=temp.left;
                    }
                }
            }
            //case 3 : two child
            else{
                Node successor=getSuccessor(temp);
                if(parent.left==temp){
                    parent.left=successor;
                }
                else{
                    parent.right=successor;
                }
                successor.left=temp.left;
            }
        }
    }
    //getSuccessor
    public Node getSuccessor(Node delNode){
        Node successor=null;
        Node successorParent=null;
        Node current=delNode.right;
        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.left;
        }
        if(successor!=delNode.right){
            successorParent.left=successor.right;
            successor.right=delNode.right;
        }
        return successor;
    }
    //main
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(3);
        bst.add(7);
        bst.add(12);
        bst.add(18);
        bst.add(1);
        bst.add(4);
        bst.add(6);
        bst.add(8);
        bst.add(11);
        bst.add(13);
        bst.add(16);
        bst.add(19);
        bst.add(2);
        bst.add(9);
        bst.add(14);
        bst.add(17);
        bst.add(20);
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
        System.out.println(bst.search(20));
        System.out.println(bst.search(21));
        bst.delete(20);
        bst.delete(21);
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
    }
    
}
