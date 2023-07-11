/*Ques: Print the number of 7's that are in the 2d array 
 * Example: 
 * Input- int[][] array = {{4,7,8},{8,8,7}}; 
 * Output- 2
*/
public class array_Q1 {
     public static void arr(int[][] a){ 
        int count = 0;
        for(int i=0 ; i<a.length ;i++){
            for(int j=0 ; j<a[i].length ;j++){
                if(a[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println(count);    }
    public static void main(String[] args) {
      int a[][] ={{4,7,8},{8,8,7}}; 
      arr(a);

    } 
}
