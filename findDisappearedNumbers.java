import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappeared(nums));
    }
      public static List<Integer> findDisappeared(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
      while(i < nums.length){
         int correct = nums[i]-1;
         if(nums[i] != nums[correct]){
             int temp =  nums[i];
             nums[i] = nums[correct];
             nums[correct] = temp;
         }else{
             i++;
         }
       } 
         for(int j=0; j < nums.length; j++){
             if(nums[j] != j+1){
                  list.add(j+1);
             }
         } 
         return list;
    }
}
