import java.util.HashSet;
import java.util.Set;

public class findIntersectionOfTwoSortedArr { 

    public static void findIntersection(int[] arr1, int[] arr2){

        int i=0,j=0;
        int n = arr1.length;
        int m = arr2.length; 

        Set<Integer> hs = new HashSet<>();
         while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i] > arr2[j]){
                j++;
            } else{
                hs.add(arr1[i]);
                i++;
                j++;
            }
         } 
         for(int elem : hs){
            System.out.print(elem+" ");
         }

    }
    public static void main(String[] args) {
         int[] arr1 = {1,2,3,3,4,5};
         int[] arr2 = {3,4,5,6,7};  
         findIntersection(arr1, arr2);

    }
}
