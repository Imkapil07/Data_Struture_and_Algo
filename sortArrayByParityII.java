import java.util.Arrays;

public class sortArrayByParityII {
      public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;
        while(even < n && odd < n){
            if(nums[even] % 2 == 1 && nums[odd] % 2 == 0){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            } 
            if(nums[even] % 2 == 0){
                even+=2;
            } 
            if(nums[odd] % 2 == 1){
                odd+=2;
            }
        } 
        return nums;
    } 

    public static void main(String[] args) {
        int[] nums ={4,2,5,7}; 
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
}
