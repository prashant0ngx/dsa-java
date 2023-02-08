package Recursion;

/**
 *
 * @author Prashant
 */

//Tower of Honnoi

public class TowerOfHonnoi {
    public static void towerOfHonnoi(int n,char from,char to,char aux){
        if(n==1){
            System.out.println("Move disk 1 from "+from+" to "+to);
            return;
        }
        towerOfHonnoi(n-1,from,aux,to);
        System.out.println("Move disk "+n+" from "+from+" to "+to);
        towerOfHonnoi(n-1,aux,to,from);
    }
    public static void main(String[] args){
        int n=3;
        towerOfHonnoi(n,'A','C','B');
    }
    
}
