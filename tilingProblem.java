package Recursion;

public class tilingProblem { 

    static int tilingPro(int n){ 
        
        if(n == 0 || n == 1) return 1; //Base Case
       
        int vertical = tilingPro(n-1); // vertical Choice 
        
        int horizontal = tilingPro(n-2); // horizontal choice 

        int totalWays = vertical + horizontal;

        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingPro(n));
    }
}
