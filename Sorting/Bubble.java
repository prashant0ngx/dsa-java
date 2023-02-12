
package Sorting;
/**
 *
 * @author Prashant
 */


public class Bubble {
    public static void bubbleSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int v:a){
            System.out.println(v);
        }
    }
    
    public static void main(String[] args) {
        int a[]={2,10,3,1,55,5};
        bubbleSort(a);
    }
    

}
