import java.util.*;
public class stringPalindroneOrNot { 
    public static void main(String[] args){
    Scanner sc =new  Scanner(System.in);
    String name = sc.nextLine();
    int length = name.length();
    String rev = "";
    for(int i = length-1 ; i >= 0 ; i-- ){
       rev = rev + name.charAt(i);
    } 
   // System.out.print(rev);
 
     if(name.equals(rev)){
        System.out.print("It is palindrone");
     }
     else {
        System.out.print("It is not palindrone");
     }
   }
}
