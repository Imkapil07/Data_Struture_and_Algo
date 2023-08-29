/*Write a program that asks the base and exponent (power) from user and 
  print the result using do while loop.
  e.g.  If base is 2 and exponent is 3, so 2*2*2 is 8.
*/
import java.util.*;;
public class cpq08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter base :");
            int b = sc.nextInt();

            System.out.print("Enter Ex(Power) : ");
            int p = sc.nextInt();
              
           int result = 1 , i = 1 ; 
           do {
              result = result * b ;
            i++;
           } while(i <= p); 
           System.out.print(result);
        }
    }

