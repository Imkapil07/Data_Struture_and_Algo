public class arrJaggedArray {
    public static void main(String[] args) {
        int[][] a = {{10,20,30,40},{50,60},{70,80,90}};

      /* System.out.print(a);
        Output = [[I@5acf9800 where [[ sqr brsh represent 2d array and I integer
     
        System.out.print(a[0]);
        Output = [I@5acf9800 */ 

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            } 
            System.err.println();
        }

    }
}
