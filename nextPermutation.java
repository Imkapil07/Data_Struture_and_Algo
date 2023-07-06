import java.util.Arrays;

public class nextPermutation {
    public void nextPermut(int[] nums) {
       int n = nums.length;
       int k = n-2;

        //null check
        if(n==0 || nums==null){
            return;
        }
        //find k
        for(int i = n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                k--;
            }else{
                break;
            }
        }
        //if k == -1 reverse
        if(k==-1){
            reverse(nums,0,n-1);
            return;
        }
        //else replace k with next greater element reverse
            for(int i = n-1;i>0;i--){
                if(nums[i]>nums[k]){
                    int temp = nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                    break;
                }
            }
             reverse(nums,k+1,n-1);
    }
     void reverse(int[] nums, int start, int end){
         while(start<end){
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start++;
             end--;
         }
     } 

     public static void main(String[] args) {
        nextPermutation np = new nextPermutation();
        int[] nums = {1,2,4,1};
        np.nextPermut(nums);
        System.out.println(Arrays.toString(nums));
     }
} 

