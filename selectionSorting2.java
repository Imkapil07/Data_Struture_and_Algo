public class selectionSorting2 {
      public static void SelectionSort2(String arr[]){

        int min;
        String temp="";

        for(int i=0 ; i<arr.length; i++){
            min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[i])<0){
                    min = j;
                }
            }
            
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
       
       } 
    }  

    public static void PrintArr(String[] arr){

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"manu","kapil","harsh","ajay"}; 
        SelectionSort2(arr);
        PrintArr(arr);
    }
}
