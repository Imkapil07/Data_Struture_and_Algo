import java.util.Arrays;

public class mergeTwoSortdArrayWithUsingExtraSpace { 

    public static void merge(int[] arr1, int[] arr2 ,int n, int m){
        int len = n + m;
        int gap = (len/2)+(len%2);

        while(gap>0){
            int left =0;
            int rigth = left + gap;
            
            while(rigth<len){ 
                // arr1 and arr1
                if(left<n && rigth >=n){
                     swap(arr1, arr2, left, rigth-n);
                } 
                // arr2 and arr2 
                else if(left>=n){
                    swap(arr2, arr2, left-n, rigth-n);
                }
                //arr1 an arr2
                else{
                    swap(arr1, arr1, left, rigth);
                } 
                left++;
                rigth++;
            } 
            if(gap==1) break;
    
            gap = (gap/2)+(gap%2);
        
        } 
    } 

    public static void swap(int[] arr1, int[] arr2 ,int i, int j){
        if(arr1[i]>arr2[j]){
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,8,10};
        int[] arr2 = {2,3,9}; 
        int n = 4;
        int m = 3; 
        merge(arr1, arr2, n, m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        
    }
}
