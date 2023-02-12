package Sorting;
/**
 *
 * @author Prashant
 */
//Radix Sort


public class RadixSort {
    public static void radixSort(int[] a, int n){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int exp=1;max/exp>0;exp*=10){
            countSort(a,n,exp);
        }
    }
    public static void countSort(int[] a, int n, int exp){
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            count[(a[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(a[i]/exp)%10]-1]=a[i];
            count[(a[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            a[i]=output[i];
        }
    }
    public static void main(String[] args){
        int[] a={170,45,75,90,802,24,2,66};
        radixSort(a,a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
