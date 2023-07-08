public class bitChnageAtoB_Or_hammingDistnc {
    
    public static int hammingDist(int a, int b){
        int xor = a ^ b;
        int distance=0;
        
        while(xor != 0){
            xor = xor & (xor - 1);
            distance++;
        }
        return distance;
    } 

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println(hammingDist(a, b));
    }
}
