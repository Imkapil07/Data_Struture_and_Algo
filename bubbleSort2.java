//Sort a String Element Using Bubble Sort
public class bubbleSort2 {
     public static void bubbleSrt(String arr[]){
        for(int turn=0 ; turn < arr.length ;turn++){ 
            int flag = 0;
            for(int j=0 ; j <arr.length-1-turn ; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    flag = 1;
                }
            } 

            if(flag == 0){
                break;
            }
        }
    }

    public static void PrintArray(String arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args) {
       
        String[] arr = {"manu","kapil","harsh","ajay"}; 

        bubbleSrt(arr);
        PrintArray(arr);
      
    }
}
