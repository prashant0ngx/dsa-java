package LinkedList;

/**
 *
 * @author Prashant
 */
//Doubly Circular Linked List
public class CLLD {
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
            tail.next=head;
            head.prev=tail;
        }
        else{
            n1.next=head;
            head.prev=n1;
            head=n1;
            tail.next=head;
            head.prev=tail;
        }
    }
    //addLast
    public void addLast(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
            tail.next=head;
            head.prev=tail;
        }
        else{
            tail.next=n1;
            n1.prev=tail;
            tail=n1;
            tail.next=head;
            head.prev=tail;
        }
    }
    //addAtSpecificPosition
    public void addAtSpecificPosition(int data,int pos){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
            tail.next=head;
            head.prev=tail;
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
            head.prev=tail;
            tail.next=head;
        }
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
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
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

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
        CLLD c=new CLLD();
        c.addFirst(10);
        c.addFirst(20);
        c.addFirst(30);
        c.addFirst(40);
        c.addFirst(50);
        c.addLast(60);
        c.addLast(70);
        c.addLast(80);
        c.addLast(90);
        c.addLast(100);
        c.addAtSpecificPosition(200, 3);
        c.addAtSpecificPosition(300, 5);
        c.addAtSpecificPosition(400, 7);
        c.addAtSpecificPosition(500, 9);
        c.addAtSpecificPosition(600, 11);
        c.display();
        System.out.println();
        c.deleteFirst();
        c.deleteFirst();
        c.deleteFirst();
        c.deleteFirst();
        c.deleteFirst();
        c.deleteLast();
        c.deleteLast();
        c.deleteLast();
        c.deleteLast();
        c.deleteLast();
        c.deleteAtSpecificPosition(3);
        c.deleteAtSpecificPosition(5);
        c.deleteAtSpecificPosition(7);
        c.deleteAtSpecificPosition(9);
        c.deleteAtSpecificPosition(11);
        c.display();
        System.out.println();
        c.searchItem(10);
        c.searchItem(20);
        c.searchItem(30);
        c.searchItem(40);
        c.searchItem(50);
        c.searchItem(60);
        c.searchItem(70);
        c.searchItem(80);
        c.searchItem(90);
        c.searchItem(100);
        c.searchItem(200);
        c.searchItem(300);
        c.searchItem(400);
        c.searchItem(500);
        c.searchItem(600);
    }

    
}
