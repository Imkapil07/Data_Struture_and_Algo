public class insertionSort {

    //Sorted in Acsending oder
    public static void insertionS(int[] a){
        int temp;
        int j; 
        for(int i=1; i<a.length;i++){
              temp = a[i];
              j = i; //Value of i is not distrubed in for loop-->
              while(j>0 && a[j-1]>temp){
                a[j] = a[j-1];
                j=j-1;
              }
              a[j] = temp;
        } 
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {5,1,6,2,4,3}; 
        insertionS(a);
    }
}
 