public class powerOfFour {
     public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    } 
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}
