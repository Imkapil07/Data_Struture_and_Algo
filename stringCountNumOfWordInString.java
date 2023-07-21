import java.util.*;
public class stringCountNumOfWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        int count = 1 ; 
        for(int i = 0 ; i < str.length() ; i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1) !=' ')){
                count++;
            }
        }
    System.out.println(count);
    }
}
