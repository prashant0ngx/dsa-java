package LinkedList;

/**
 *
 * @author Prashant
 */
//Doubly Linked List
public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    Node head=null;
    Node tail=null;
    //addFirst
    public void addFirst(int data){
        Node n1 =new Node(data);
        if(head==null){
            head=n1;
            tail = n1;
        }
        else{
            n1.next=head;
            head.prev=n1;
            head=n1;
        }
    }
    //addLast
    public void addLast(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
            n1.prev=tail;
            tail=n1;
        }
    }
    //addAtSpecificPosition
    public void addAtSpecificPosition(int data,int pos){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            n1.next=temp.next;
            temp.next.prev=n1;
            temp.next=n1;
            n1.prev=temp;
        }
    }
    //deleteFirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    //deleteAtSpecificPosition
    public void deleteAtSpecificPosition(int pos){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
    }
    //display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //SearchItem
    public void searchItem(int data){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Item found at position "+(count+1));
                break;
            }
            count++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Item not found");
        }
    }

    public static void main(String[] args) {
        DLL d1=new DLL();
        d1.addFirst(10);
        d1.addFirst(20);
        d1.addFirst(30);
        d1.addFirst(40);
        d1.addFirst(50);
        d1.addFirst(60);
        d1.addFirst(70);
        d1.addFirst(80);
        d1.addFirst(90);
        d1.addFirst(100);
        d1.display();
        d1.addLast(110);
        d1.display();
        d1.addAtSpecificPosition(120, 3);
        d1.display();
        d1.deleteFirst();
        d1.display();
        d1.deleteLast();
        d1.display();
        d1.deleteAtSpecificPosition(3);
        d1.display();
        d1.searchItem(120);
        d1.searchItem(130);
    }

}
