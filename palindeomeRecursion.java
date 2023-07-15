package Recursion;

public class palindeomeRecursion { 

    public static boolean check(String str, int start, int end){ 
        
        while(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && check(str,start+1,end-1));
    }
    public static void main(String[] args) {
        String str = "abcba";
        int start = 0;
        int end = str.length() - 1;
        System.out.println(check(str, start, end));
    }
}
