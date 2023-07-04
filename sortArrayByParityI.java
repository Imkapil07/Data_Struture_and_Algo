import java.util.Arrays;

public class sortArrayByParityI {
      public static int[] sortArrayByParity(int[] nums) {
       int j=0,temp;
       for(int i=0; i<nums.length; i++){
           if(nums[i] % 2 == 0){
               temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp; 
               j++;
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
