import java.util.*;
public class cyclicallyRotationAnArray {
     public static void rotateArrayByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }

        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        } 
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}


