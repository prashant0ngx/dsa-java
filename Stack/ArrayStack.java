package Stack;
/**
 *
 * @author Prashant
 */
public class ArrayStack {
    int size;
    int tos;
    int arr[];
    public ArrayStack(int size){
        this.size=size;
        this.tos=-1;
        this.arr[]=new int[size];
    }
    boolean isFull(){
        return tos == size-1;
    }
    boolean isEmpty(){
        return tos==-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Is full.");
        }
        else{
            tos++;
            arr[tos]=data;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }
        else{
            int el= arr[tos];
            tos--;
            System.out.println("Popped element= "+el);

        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }
        else{
            for(int i=0;i<=tos;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayStack s=new ArrayStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}
