import java.util.*;
public class arrayFindFirstReapeating {

    static int findRepeat(int[] arr){
        int n = arr.length ;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        
        System.out.print("Enter array Element : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.print(findRepeat(arr));
    }
}
