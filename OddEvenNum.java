public class OddEvenNum {
    
    public static void OdEv(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    } 

    public static void main(String[] args) {
        OdEv(10);
        OdEv(9);
    }
}
