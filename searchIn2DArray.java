public class searchIn2DArray { 

    public static boolean searchIn2D(int[][] arr , int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                 if(arr[i][j] == target){
                    System.out.println("Found at index : ("+i+","+j+")");
                    return true;
                 }
            } 
        } 
        System.out.println("Not found");
        return false;
    }
    public static void main(String[] args) {
          int[][] arr = {
            {1,2,3},
            {4,5,6},
            {6,7,8}
        }; 
        int target = 0;  
        searchIn2D(arr, target);
    }
}
