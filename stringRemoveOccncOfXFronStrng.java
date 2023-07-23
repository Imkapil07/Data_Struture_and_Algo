public class stringRemoveOccncOfXFronStrng {
    public static void main(String[] args) {
        String str = "SPIDERSLIES";
        char y[] = str.toCharArray();
        int size = str.length();
        char key = 'S';
        String res = "";
        for(int i = 0 ; i < size ; i++){
            if(y[i] != key){
                res = res + y[i];
            }
        }
        System.out.print(res);
    }
}
