
package Sorting;

/**
 *
 * @author Prashant
 */
public class Selection {
    public static void main(String[] args) {
        int a[]={25,57,48,37,12,92,86,33};
        for(int i=0;i<a.length;i++){
            //set first element as minimum
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp; 
        }
        
        for (int v: a){
            System.out.println(v);
        }
    }
}
