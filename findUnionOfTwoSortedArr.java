import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findUnionOfTwoSortedArr {

     public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        
        for (int num : arr1) {
            unionSet.add(num);
        }
        
        for (int num : arr2) {
            unionSet.add(num);
        }
        
        return new ArrayList<>(unionSet);
    }   
  
    public static void findUnion1(int[] arr1 , int[] arr2){
           Set<Integer> unionSet = new HashSet<>();
        
        for (int num : arr1) {
            unionSet.add(num);
        }
        
        for (int num : arr2) {
            unionSet.add(num);
        } 

        for(int elem : unionSet){
            System.out.print(elem +" ");
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,4,5,6};
        System.out.println(findUnion(arr1, arr2)); 
        findUnion1(arr1, arr2);
    }
}
