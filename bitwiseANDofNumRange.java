public class bitwiseANDofNumRange {

    public static int range(int left,int right){
        while(right>left){
            right = right & (right -1);
        }
        return right;
    }
    public static void main(String[] args) {
        int left = 20;
        int right = 24;
        System.out.println(range(left, right));
    }
}
