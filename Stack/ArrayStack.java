package Stack;
/**
 *
 * @author Prashant
 */
/*
 * Stack Defination: A stack is a linear data structure which follows a particular order in which the operations are performed.
 * The order may be LIFO(Last In First Out) .
 * Mainly the following three basic operations are performed in the stack:
 * Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
 * Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
 * Peek or Top: Returns top element of stack.
 * isEmpty: Returns true if stack is empty, else false.
 * 
 */
public class ArrayStack {
    int size;
    int tos;
    int arr[];
    public ArrayStack(int size){
        this.size=size;
        this.tos=-1;
        this.arr=new int[size];
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
