import java.util.Arrays;

public class maxProductOfThreeNum {
       public static int maximumProduct(int[] nums) {
     int n=nums.length;
     Arrays.sort(nums);
     return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);   
    }
   public static void main(String[] args) {
    int[] ar = {2,3,-2,4};
    System.out.println(maximumProduct(ar));
   }
}
