package LinkedList;

/**
 *
 * @author Prashant
 */

class SLL{
    class Node{
        int info;
        Node next;
        public Node(int data){
            info=data;
            next=null;

        }
    }
    public Node head=null;
    public Node tail=null;
    //addFirst
    public void addFirst(int data){
        Node n1 =new Node(data);
        if(head==null){
            head=n1;
            tail = n1;
        }
        else{
            n1.next=head;
            head=n1;
        }
    }
    //addLast
    public void addLast(int data){
        Node n1= new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
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
        }
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=null;
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
        if(head==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.info+"=>");
            temp=temp.next;
        }
        System.out.println();
    }
    //searchItem
    public void searchItem(int data){
        Node temp=head;
        int count=0;
        int d=0;
        while(temp!=null){
            if(temp.info==data){
                count++;
                d=temp.info;
                break;
            }
            temp=temp.next;
        }
        if(count==0){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found : "+ d);
        }
    }

    public static void main(String[] args) {
        SLL s1=new SLL();
        s1.addFirst(10);
        s1.addFirst(20);
        s1.addFirst(25);
        
        s1.addLast(30);
        s1.addLast(40);

        s1.addAtSpecificPosition(50, 2);
        s1.addAtSpecificPosition(60, 4);
        s1.deleteFirst();
        s1.deleteLast();
        s1.deleteAtSpecificPosition(3);

        s1.display();
        s1.searchItem(30);


    }

}
