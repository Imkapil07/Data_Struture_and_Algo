public class kadanesAlgo { 

    public static void kadanesAl(int arr[]){
        int ms = Integer.MIN_VALUE;   
       
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            ms=Math.max(cs,ms);
            
        } 
        System.out.println(ms);
    }
    // Use when final ans should not be negative like Input arr = {-1};
     public static void kadanesAl1(int arr[]){
        int ms = Integer.MIN_VALUE;   
       
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs =0;
            }
            ms=Math.max(cs,ms);
            
        } 
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-1};
         kadanesAl(arr);
         kadanesAl1(arr);
    }
}
