public class SumOfUniqueEle {
    public static int SumUnique(int[] nums){
 
     int sum = 0;

        for (int i : nums) {
            int count = 0;
            for (int a : nums) {
                if (a == i) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(SumUnique(nums));
    }
}
