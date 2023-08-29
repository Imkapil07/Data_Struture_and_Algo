/* Ques
 *  Write a program that takes the height and width of a square and print the box of that height and width with alphabet ‘B’. E.g. 
 * if user presses 5 for height and 8 for width, your program should print the following. 
 * (Restrict the user such that height or width should not be equal to zero).

B B B B B B B B
B B B B B B B B
B B B B B B B B
B B B B B B B B
B B B B B B B B

 */

import java.util.*;
public class cpq06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int row = sc.nextInt(); 

        System.out.print("Col: ");
        int col = sc.nextInt(); 

        if(row <= 0 || col <= 0){
            //print error
            System.out.print("Error");
        } 
        else {
            for(int i = 1 ; i <=row ; i++){
                for(int j = 1 ; j <= col ; j++){
                    System.out.print("B");
                } 
                System.out.println();
            }
        }
    }   
}
