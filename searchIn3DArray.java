public class searchIn3DArray {
       public static void main(String[] args) {
        int arr[][][] ={{{1,2,4},{4,7,5}},{{2,3,5},{6,7,8}}};
        int target =8;
      for(int i=0 ; i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
           for(int k=0;k<arr[i][j].length;k++){
                 if(arr[i][j][k] == target){
                    System.out.print("Found at index : ("+i+","+j+","+k+")");
                 }
           }
         
        }
      }
        // System.out.println("Not Found");
    }
}
