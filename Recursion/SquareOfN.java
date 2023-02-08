package Recursion;

/**
 *
 * @author Prashant
 */

//Square of N

public class SquareOfN {
    public static int square(int n, int i){
        if(i==0){
            return 1;
        }
        else{
            return n*square(n,i-1);
        }
    }
    public static void main(String[] args){
        System.out.println(square(2,6));
    }
    
}
