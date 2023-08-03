package ArrayList;

import java.util.ArrayList;

public class pairSumInSrtdandRotateAryLst {
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(11);
        h.add(15);
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(10);
        
        int target = 16;
        System.out.println(psum(h, target));
    } 

    static boolean psum(ArrayList<Integer> h,int target){
      int bp = -1;
      int n = h.size();
      for(int i=0; i<h.size(); i++){
        if(h.get(i) > h.get(i+1)){
            bp = i;
            break;
        }
      }  
      int lp = bp+1;
      int rp = bp; 

      while(lp != rp){
        if(h.get(lp) + h.get(rp) == target){
            return true;
        } 
        if(h.get(lp) + h.get(rp) < target){
            lp = (lp + 1) % 2;
        } else{
            rp =(n+rp-1) % n;
        }
      } 
      return false;
    } 
}
