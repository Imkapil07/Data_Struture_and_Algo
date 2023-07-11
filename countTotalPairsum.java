public class countTotalPairsum {
    
    //Better Solution using single Loop-->
    public static int betterpairSum(int[] arr, int target){
        int count =0;
        int sum;
        int start=0, end = arr.length-1;
        while(start < end){
            sum = arr[start]+arr[end];
            if(sum == target){
                count++;
                start++;
                end--;
            } else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
      return count;
    }

  public static void twoSum(int arr[] , int target){
    int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }
            }          
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8}; 
        int target = 10;  
        twoSum(arr, target);
        System.out.println(betterpairSum( arr,target));

    } 

}