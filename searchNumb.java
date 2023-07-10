/* WAP to to check if an array contains
 * a number in java (Searching)
 */
public class searchNumb {
  public static void main(String[] args) { 
    searchNumb sc = new searchNumb();
    int[] arr = {20 , 10 , 30 , 50 , 40 , 60};
    int target = 30; 
    sc.linearSearch(arr, target);
  }    
  public void linearSearch(int[] intArray, int value){
        for(int i = 0 ; i < intArray.length ;i++){
            if(intArray[i]==value){
                System.out.println("Value is found at the index of "+i);
            }
        } 
        System.out.println("Value is not found");
  }
}
