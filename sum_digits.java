/*Questions : How to find the sum of digits of a positive integer number using recursion ?  
 * logic :    123 = 6 ------ 1+2+3=6 ;
*/


public class sum_digits {
    public static void main(String[] args) {
        sum_digits sc = new sum_digits();
        int rec = sc.sumOfDigits(345);
        System.out.println(rec);
    } 
    public int sumOfDigits(int n){ 
        if(n == 0 || n<0 ){
            return 0;
        }
      return n%10 + sumOfDigits(n/10);
    }
}
