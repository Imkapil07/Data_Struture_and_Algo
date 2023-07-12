/*WAP to find maximum product of two integer in the array where
 *  all elements are positive
 */
public class maxProductOfTwoNum {
    public static void main(String[] args) { 
        maxProductOfTwoNum mn = new maxProductOfTwoNum();
        int[] arr = {20 , 10 , 30 , 50 , 40 , 60}; 
        String pairs = mn.maxProduct(arr);
        System.out.println(pairs);
    } 
    public String maxProduct(int[] intArray){
        int maxProduct = 0;
        String pairs = "";
        for(int i=0; i < intArray.length ; i++){
            for(int j = i+1 ; j<intArray.length ; j++){
                if(intArray[i]*intArray[j]>maxProduct){
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]); 
                }
            }
        } 
        return pairs ;
    } 
}
