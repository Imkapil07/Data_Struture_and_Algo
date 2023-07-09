public class reverseBits {
    public static int revbit(int n){
        int result = 0;
        for(int i=0; i<32; i++){
            result = result | (n & 1) << (31 - i);
            n = n >>> 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(revbit(n));
    }
}

