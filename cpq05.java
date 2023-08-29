 
/*
   1 10 11 20 21 30
   2 9 12 19 22 29
   3 8 13 18 23 28
   4 7 14 17 24 27
   5 6 15 16 25 26
   6 5 16 15 26 25
   7 4 17 14 27 24
   8 3 18 13 28 23
   9 2 19 12 29 22
  10 1 20 11 30 21  
 */
public class cpq05 {
    public static void main(String[] args) {
        for(int a = 1 , b = 10 , c = 11 , d = 20 , e = 21 , f = 30 ; a <= 10 ; a++ ,  b-- , c++ , d-- , e++ , f--){
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        }
    }
}
