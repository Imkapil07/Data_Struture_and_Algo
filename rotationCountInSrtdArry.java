public class rotationCountInSrtdArry {
     public static int findRotationCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum element is in the right half
                left = mid + 1;
            } else {
                // Minimum element is in the left half or is mid itself
                right = mid;
            }
        }

        return left; // Index of the minimum element is the rotation count
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 1, 2, 3};
        int rotationCount = findRotationCount(rotatedArray);
        System.out.println("Rotation Count: " + rotationCount);
    }
}
