public class findNosWithEvenNosOfDigits {
        public static int findNumbers(int[] nums) {
       int ans=0;
       for(int i=0; i<nums.length; i++){
           int digits=0;
           while(nums[i]>0){
               digits++;
               nums[i] /= 10;
           } 
           if(digits % 2 == 0){
               ans++;
           }
       }  
       return ans;
    } 
   //Method 2..
//    public static int findNumbers1(int[] nums) {
//         int count = 0;
//         for (int num : nums) {
//             if (String.valueOf(num).length() % 2 == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums)); //Output: 1
        // System.out.println(findNumbers1(nums));  // Output: 2
    }
}
