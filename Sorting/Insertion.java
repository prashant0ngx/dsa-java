
package Sorting;

/**
 *
 * @author Prashant
 */
public class Insertion {
    public static void insertionSort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(int v:a){
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        int a[]={2,10,3,1,55,5};
        insertionSort(a);
       
    }
}
