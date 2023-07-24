import java.util.*;
public class swapwithoutusing3variable {
     public static void main(String[] args) {
       
        System.out.print("Enter a Value of a and b :");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt();  
        System.out.println(" Value of a and b before swap : a = " + a + " b = " + b);

          a = a + b ;
          b = a - b ;
          a = a - b ;
       System.out.println(" Value of a and b before swap : a = " + a + " b = " + b );
        
    }
}