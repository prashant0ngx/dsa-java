package Queue;
/**
 *
 * @author Prashant
 */
//Linear Queue
/*
Queue is a linear data structure which follows a particular order in which the operations are performed.
The order is First In First Out (FIFO). A good example of queue is any queue of consumers for a resource 
where the consumer that came first is served first. The difference between stacks and queues is in removing.
In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.

*/ 
public class LinearQueue {
    int front;
    int rear;
    int size;
    int[] arr;
    public LinearQueue(int size){
        this.size=size;
        this.front=0;
        this.rear=-1;
        this.arr=new int[size];
    }
    boolean isFull(){
        return rear ==size-1;
    }
    boolean isEmpty(){
        return front>rear;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            front++;
        }
    }
    //priority dequeue
    public void pdequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            int max=arr[front];
            int index=front;
            for(int i=front+1;i<=rear;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
                }
            }
            for(int i=index;i<rear;i++){
                arr[i]=arr[i+ 1];
            }
            rear--;
        }
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        LinearQueue lq=new LinearQueue(5);
        lq.enqueue(10);
        lq.enqueue(20);
        lq.display();
        lq.dequeue();
        lq.display();
        lq.enqueue(60);
        lq.display();
      
    }
    
    
}
