package Recursion;

//Recursive function to check if a number is prime or not

public class Prime {

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);

    }

    public static void main(String[] args) {
        int n = 17;
        if (isPrime(n,2)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
    
}
