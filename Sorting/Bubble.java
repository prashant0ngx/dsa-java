
package Sorting;
/**
 *
 * @author Prashant
 */
class Bubble_Sort {

    int A[];
    int n;

    public Bubble_Sort(int A[]) {
        this.A = A;
     
    }

    public void Sort() {
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

    }
    public void display(){
        Sort();
        for(int v:A){
            System.out.println(v);
        }
    }
}

public class Bubble {
    public static void main(String[] args) {
        int a[]= {25,57,48,37,12,92,86,33};
        Bubble_Sort b =new Bubble_Sort(a);
        b.display();
  
    }

}
