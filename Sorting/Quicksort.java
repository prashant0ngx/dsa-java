package Sorting;
/**
 *
 * @author Prashant
 */
public class Quicksort {
    int partition(int a[],int left,int right) {
        int pivot = a[left];
        int i=left,j=right,temp;
        while(i<j) {
            while(a[i]<pivot) {
                i++;
            }
            while(a[j]>pivot) {
                j--;
            }
            if(i<j){
                temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp =pivot;
        pivot =a[j];
        a[j]=temp ;
        return j;
    }

    void QuickSort(int a[],int start,int end) {
        if(start<end) {
            int p = partition(a,start,end);
            QuickSort(a,start,p-1);
            QuickSort(a,p+1,end);
        }
    }
    public static void main(String[] args) {
        Quicksort s=new Quicksort();
        int a[]= {4,9,2,88,21,35,24,36,1};
        int n=a.length;
        s.QuickSort(a,0,n-1);

        for(int v:a) {
            System.out.println(v);
        }


    }
}