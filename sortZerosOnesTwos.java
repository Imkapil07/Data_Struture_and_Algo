import java.util.Arrays;

public class sortZerosOnesTwos { 

    public static void ZerosOnesTwos(int[] arr){
        int left=0;
        int right = arr.length -1;
        int current = 0;
        while(current<=right){
            if(arr[current] == 0){
                int temp = arr[current];
                arr[current] = arr[left];
                arr[left] = temp;
                left++;
                current++;
            } else if(arr[current] == 2){
                int temp = arr[current];
                arr[current] = arr[right];
                arr[right] = temp; 
                right--;
            } else {
                current++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,0,1,1,2,1,2};
        ZerosOnesTwos(arr);
        System.out.println(Arrays.toString(arr));
    }
}
