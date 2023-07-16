package Recursion;

public class numOfStepToReduceNumToZero {

    public static int stepCount(int n){
        return helper(n,0);
    } 
    public static int helper(int n, int step){
        if(n == 0){
             return step; 
        }
        if(n % 2 == 0){
            return helper(n/2, step+1);
        } 
        return helper(n-1, step+1);
    }
    public static void main(String[] args) {
       int n = 14;
       System.out.println(stepCount(n)); 
    }
}
