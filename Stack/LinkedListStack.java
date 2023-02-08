package Stack;
/**
 *
 * @author Prashant
 */


public class LinkedListStack {
    class Node {

        public int info;
        public Node next;
    
        public Node() {
            info = 0;
            next = null;
        }
    }

    Node tos = new Node();

    public LinkedListStack() {
        tos = null;
    }

    boolean isEmpty() {
        return tos == null;
    }

    public void push(int data) {
        Node n1 = new Node();
        n1.info = data;
        if (tos == null) {
            n1.next = null;
            tos = n1;
        } else {
            n1.next = tos;
            tos = n1;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
        } else {
            Node t = new Node();
            t = tos;
            tos = tos.next;
            System.out.println("Pooped Item: " + t.info);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty Stack.");
        } else {
            Node t = new Node();
            t = tos;
            while (t != null) {
                System.out.println(t.info);
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.pop();
       
        s.display();
    }
}

