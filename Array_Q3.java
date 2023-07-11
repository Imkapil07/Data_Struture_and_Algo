/*Ques: Uou have to need swap every pair of alternate elements in the array 
 * you dont need to print or return anything, just chnage in the input array itself.
 * Ex :
 * Input : 9,3,6,12,4,32
 * Output : 3,9,12,6,32,4
 * 
 * Input : 8,3,4,9,2,5,6,7,9
 * Output : 3,8,9,4,5,2,7,6,9
 * 
 */
public class Array_Q3 { 
   public static void main(String[] args) {
    int[] arr ={9,3,6,12,4,32};
   int tem =0;
    for(int i=0 ; i<arr.length-1; i+=2){
         tem = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tem;
        
      }
     for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
}
