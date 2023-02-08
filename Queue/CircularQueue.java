package Queue;
/**
 *
 * @author Prashant
 */

//Circular Queue
public class CircularQueue {
    int front;
    int rear;
    int size;
    int[] arr;
    public CircularQueue(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.arr=new int[size];
    }
    
    
    public void enqueue(int data){
        if((rear+1)%size==front ){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
    }
    public void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%size;
            }
        }
    }
    public void display(){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            int i=front;
            while(i!=rear){
                System.out.print(arr[i]+" ");
                i=(i+1)%size;
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        System.out.println();
        cq.dequeue();
        cq.display();

        System.out.println();
        cq.enqueue(60);
        cq.display();
        cq.enqueue(21);
    }
    


}
