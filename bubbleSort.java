public class bubbleSort {  

    //Simple Logic For Bubble Sorting
    // public static void bubbleSrt(int arr[]){
    //     for(int turn=0 ; turn < arr.length-1 ;turn++){
    //         for(int j=0 ; j <arr.length-1-turn ; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    // public static void PrintArray(int arr[]){
    //     for(int i=0 ; i<arr.length ; i++){
    //         System.out.print(arr[i]+" ");
    //     } 
    //     System.out.println();
    // }   


    //Descending oder 
    //  public static void bubbleSrt(int arr[]){
    //     for(int turn=0 ; turn < arr.length ;turn++){ 
    //         int flag = 0;
    //         for(int j=0 ; j <arr.length-1-turn ; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp; 
    //                 flag = 1;
    //             }
    //         } 

    //         if(flag == 0){
    //             break;
    //         }
    //     }
    // }

 
    //Condition If array element sorted before complete n-1 rounds/turns 
     public static void bubbleSrt(int arr[]){
        for(int turn=0 ; turn < arr.length ;turn++){ 
            int flag = 0;
            for(int j=0 ; j <arr.length-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
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

    public static void PrintArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,6,4,9};
       
        bubbleSrt(arr);
        PrintArray(arr);
    }
}
