
// CONCPT 153 = 1^3+5^3+3^3; IS A ARMSTRONG NUMBER 
// EX: OF ARMSTRONG NUMBERS ARE 0 , 1 , 153 , 370 , 371 , 1634 --->

// TAKE INPUT FROM THE USER ---
import java.util.*;;
public class armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = sc.nextInt();
        int t1= num;
        int lenght = 0 ;
        while(t1 != 0){
            lenght = lenght + 1 ;
            t1 = t1 / 10 ;
        }

        int t2 = num; 
        int rem , arm = 0 ;
        while(t2 != 0){ 
            int mult = 1 ;
            rem = t2 % 10 ;
            for(int i=1 ; i<=lenght ; i++){
                mult = mult * rem ;
            }
           arm = arm + mult ; 
           t2 = t2 / 10 ;
        }
        if(arm == num){
            System.out.print(num+" Is a armstrong number");
        }
        else{
            System.out.print(num+" Is not a armstrong number");
        }
    }
}

/*public class armstrongNo {
    public static void main(String[] args) {
        int num = 153 ;
        int t1= num;
        int lenght = 0 ;
        while(t1 != 0){
            lenght = lenght + 1 ;
            t1 = t1 / 10 ;
        }

        int t2 = num; 
        int rem , arm = 0 ;
        while(t2 != 0){ 
            int mult = 1 ;
            rem = t2 % 10 ;
            for(int i=1 ; i<=lenght ; i++){
                mult = mult * rem ;
            }
           arm = arm + mult ; 
           t2 = t2 / 10 ;
        }
        if(arm == num){
            System.out.print(num+" Is a armstrong number");
        }
        else{
            System.out.print(num+" Is no a armstrong number");
        }
    }
}*/
