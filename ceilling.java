public class ceilling {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 14;
        int[] ans = ceillnf(arr,target);
        System.out.println(ans[0]);
       
    } 

    static int[] ceillnf(int arr[],int target){
        int s = 0;
        int e = arr.length-1;

        if(target > arr[arr.length-1]){
            return new int[]{-1};
        }
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return new int[]{mid};
            } 
            if(arr[mid] < target){
                s = mid + 1;
            } else{
                e = mid - 1;
            }
         } 
         return new int[]{s};
        }
    }

