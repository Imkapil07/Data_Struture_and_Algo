import java.util.*;;
public class numOfDigitsInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();
        int t1 = num ;
        int lenght = 0 ;
        while(t1 != 0){
            lenght = lenght + 1 ;
            t1 = t1 / 10;
        }
        System.out.print(" "+lenght);
    }
}
