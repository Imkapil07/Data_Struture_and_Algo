package Recursion;

public class towerOfHanoi {
    //O(2^n)
    public static void tower(int n,char A,char B,char C){
        if(n == 1){
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        tower(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        tower(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n = 2;
        tower(n,'A','B','C');
    }
}
