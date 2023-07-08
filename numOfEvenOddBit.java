import java.util.Arrays;

public class numOfEvenOddBit {
        public static int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int index = 0;
        while(n > 0){
            if((n & 1) == 1){
                if((index % 2) == 0){
                    even++;
                } else{
                    odd++;
                }
            } 
            n >>=1;
            index++;
        } 
        return new int[] {even,odd};
    } 
    public static void main(String[] args) {
        int n = 17; 
       int[] ans = evenOddBit(n);
        System.out.println(Arrays.toString(ans));
    }
}
