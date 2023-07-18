public class clear_Ith_Bit {

    public static int clearIth(int n,int i){
        
        int bitMask = ~(1<<i);
        return n & bitMask;
    } 
    public static void main(String[] args) {
        System.out.println(clearIth(10, 1));
    }
}
