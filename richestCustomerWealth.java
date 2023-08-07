class richestCustomerWealth{
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {3,2,1}
        }; 
        System.out.println(richest(arr));
    } 

    static int richest(int ar[][]){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            int sum = 0;
            for(int j=0; j<ar[i].length; j++){
                 sum = sum + ar[i][j];
            } 
           ans = Math.max(ans, sum);
        }
        return ans;
    }
}