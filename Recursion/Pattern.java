package Recursion;
/**
 * author Prashant
 
*
**
***
****
*****

 */
//Recursion Pattern

public class Pattern {
    public static void pattern(int n){
        if(n==0){
            return;
        }
        else{
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);
    }
    
}
