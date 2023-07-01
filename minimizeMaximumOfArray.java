public class minimizeMaximumOfArray {
    
     public static int minimizeArrayValue(int[] nums) {
        int max = 0;
        double cur = 0;
        for (int i = 0; i < nums.length; i++)
        {
            cur += nums[i];
            max = Math.max(max, (int)Math.ceil(cur / (i + 1)));
        }
        return max;
    } 

    public static void main(String[] args) {
        int[] nums ={10,1};
        System.out.println(minimizeArrayValue(nums));
    }
}
