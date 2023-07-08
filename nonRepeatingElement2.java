public class nonRepeatingElement2 {
     public static int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get the XOR of the two non-repeating numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        // Step 2: Find the rightmost set bit in the XOR result
        int rightmostSetBit = xor & -xor;
        
        // Step 3: Divide the numbers into two groups based on the rightmost set bit
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,4,3,5,1,2};
        int[] singles = singleNumber(nums);
        System.out.println("The single numbers are: " + singles[0] + ", " + singles[1]);
    }
}
