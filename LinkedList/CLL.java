package LinkedList;
/**
 *
 * @author Prashant
 */

//Circular Linked List
public class CLL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
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
            tail.next=head;
        }
        else{
            n1.next=head;
            head=n1;
            tail.next=head;
        }
    }
    //addLast
    public void addLast(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
            tail.next=head;

        }
        else{
            tail.next=n1;
            tail=n1;
            tail.next=head;
        }
    }
    //addAtSpecificPosition
    public void addAtSpecificPosition(int data,int pos){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
            tail.next=head;
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            n1.next=temp.next;
            temp.next=n1;
        }
    }
    //deleteFirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
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
        }
    }
    //display
    public void display(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" ");
    }
    //SearchItem
    public void searchItem(int data){
        Node temp=head;
        int count=0;
        while(temp.next!=head){
            if(temp.data==data){
                count++;
                break;
            }
            temp=temp.next;
        }
        if(temp.data==data){
            count++;
        }
        if(count==0){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found");
        }
    }

    public static void main(String[] args) {
        CLL cll=new CLL();
        cll.addFirst(10);
        cll.addFirst(20);
        cll.addFirst(30);
        cll.addFirst(40);
        cll.addFirst(50);
        cll.addLast(60);
        cll.addLast(70);
        cll.addLast(80);
        cll.addLast(90);
        cll.addLast(100);
        cll.addAtSpecificPosition(200, 3);
        cll.addAtSpecificPosition(300, 5);
        cll.addAtSpecificPosition(400, 7);
        cll.addAtSpecificPosition(500, 9);
        cll.addAtSpecificPosition(600, 11);
        cll.display();
        System.out.println();
        cll.deleteFirst();
        cll.deleteFirst();
        cll.deleteFirst();
        cll.deleteFirst();
        cll.deleteFirst();
        cll.deleteLast();
        cll.deleteLast();
        cll.deleteLast();
        cll.deleteLast();
        cll.deleteLast();
        cll.deleteLast();
        cll.display();
        System.out.println();
        cll.addFirst(10);
        cll.addFirst(20);
        cll.addFirst(30);
        cll.addFirst(40);
        cll.addFirst(50);
        cll.addLast(60);
        cll.addLast(70);
        cll.addLast(80);
        cll.addLast(90);
        cll.addLast(100);
        cll.addAtSpecificPosition(200, 3);
        cll.addAtSpecificPosition(300, 5);
        cll.addAtSpecificPosition(400, 7);
        cll.addAtSpecificPosition(500, 9);
        cll.addAtSpecificPosition(600, 11);
        cll.display();
        System.out.println();
        cll.deleteAtSpecificPosition(3);
        cll.deleteAtSpecificPosition(5);
        cll.deleteAtSpecificPosition(7);
        cll.deleteAtSpecificPosition(9);
        cll.deleteAtSpecificPosition(11);
        cll.display();
        System.out.println();
        cll.searchItem(10);
        cll.searchItem(20);
        cll.searchItem(30);
        cll.searchItem(40);
        cll.searchItem(50);
        cll.searchItem(60);
    }
    
}
