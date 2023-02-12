package Recursion;

/**
 *
 * @author Prashant
 */

//Print Prime using Recursion
public class PrintPrime {
    public static boolean isPrime(int n, int i){
        if(i==1){
            return true;
        }
        else{
            if(n%i==0){
                return false;
            }
            else{
                return isPrime(n,i-1);
            }
        }
    }
    public static void printPrime(int n){
        if(n==1){
            return;
        }
        else{
            printPrime(n-1);
            if(isPrime(n,n/2)){
                System.out.print(n+" ");
            }
        }
    }
    public static void main(String[] args){
        printPrime(10);
    }
    
}
