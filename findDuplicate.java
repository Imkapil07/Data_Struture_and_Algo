public class findDuplicate { 

    public static void Duplicate(int[] arr){

        for(int i=0; i<arr.length; i++){
            int x = arr[i] % arr.length;
            arr[x] = arr[x] + arr.length;
        } 

        for(int i=0; i<arr.length; i++){
            if(arr[i]/arr.length >=2){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {2,1,0,3,1,4,3,0};
        Duplicate(arr);

    }
}
