public class GCDofArray { 
    public static int GCF(int[] nums){
        int minNum =Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
       
        int rev = minNum;
        
        while(rev > 0){
            if(minNum%rev == 0 && maxNum%rev == 0){
                break;
            }
            rev--;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] nums = {4,8,5,2,10};
        System.out.println(GCF(nums));
    }
}
