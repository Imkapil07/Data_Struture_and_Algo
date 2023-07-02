//Minimum no. of Jumps to reach end of Array. or Jump Game II.
public class minimumJumptoEnd {
    public static int jump(int[] nums) {
        int n = nums.length; 
        if(n<=1) return 0;
        if(nums[0]==0) return -1;

        int maxReach = nums[0];
        int step = nums[0];
        int jump = 1;

        for(int i=1; i<n; i++){
            if(i==n-1) return jump;
            maxReach = Math.max(maxReach,i+nums[i]);
            step--;

            if(step==0){
                jump++;
              if(maxReach <= i){
                  return -1;
              } 

              step = maxReach - i;
            }
        } 
        return -1;
    } 

    public static void main(String[] args) {
        int[] arr ={2,3,1,1,4};
        System.out.println(jump(arr));
    }
}
