/*Print pattern  
 * 12345&
 * 1234&&
 * 123&&&
 * 12&&&&
 * 1&&&&&
 * &&&&&&       
 */
public class cpq03 {
    public static void main(String[] args) {
        for(int i = 6 ; i >= 1 ; i--){
            for(int j = 1 ; j < i ; j++){
                System.out.print(j);
            }  
        for(int k = 6 ; k >= i ; k--){
            System.out.print("&");
           } 
           System.out.println();
        }
    }
}
