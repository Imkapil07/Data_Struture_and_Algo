//import java.util.*;
public class missingNum {
    public static void main(String[] args) { 
        missingNum ms = new missingNum();
        int[] ar= {1,2,3,4,6,7,8,9,10}; 

        ms.missingNumb(ar);

    }
    public void missingNumb(int[] ar) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i : ar){
            sum1 += i;
        } 
        sum2 = 10*(10+1)/2; 
        int difference = sum2 - sum1;
        System.out.println("Missing number is "+difference);
    }
}
