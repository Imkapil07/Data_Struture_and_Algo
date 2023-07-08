public class nonRepeatingElement {
    //Work fine in case single non repeating present-->
    //LeetCode Single Number I 
    public static int nonRep(int[] arr){
        int result = 0;
        for(int num : arr){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(nonRep(arr));
    }
}
