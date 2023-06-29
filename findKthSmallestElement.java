import java.util.Comparator;
import java.util.PriorityQueue;

public class findKthSmallestElement {
     public static int KthElement(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        } 

        for(int i=k; i<arr.length; i++){
           if(pq.peek() > arr[i]){
            pq.poll();
            pq.add(arr[i]);
           }
        }
    return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr ={10,15,23,56,2,3,2};
        int k = 2;
        System.out.println(KthElement(arr, k));     
    }
}
