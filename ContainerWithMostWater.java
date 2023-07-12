public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
    int n = height.length;
    int maxArea = 0;
    int left = 0;
    int right = n - 1;

    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int w = right - left;

        int area = h * w;
        maxArea = Math.max(maxArea, area);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
} 

 public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(height));
     
 }
}

