import java.util.*;
public class arrayAddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
      
        int i , j ;
        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
                first[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Elements of first Matrix are :");
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
             System.out.print(first[i][j] + " ");
            } 
            System.out.println();
        }   

        System.out.println("Enter the elements of Second matrix");
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
                second[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Elements of Second Matrix are :");
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
             System.out.print(first[i][j] + " ");
            } 
            System.out.println();
        }   
         // loop for sum 
         for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
              sum[i][j] =  first[i][j] +  second[i][j];
            } 
        }

        System.out.println("Sum of entered matrix :-");
          for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++){
             System.out.print(sum[i][j] + " ");
            } 
            System.out.println();
        }   
    }
}
