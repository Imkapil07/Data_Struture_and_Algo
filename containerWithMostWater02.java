package ArrayList;

import java.util.ArrayList;

public class containerWithMostWater02 {
    public static void main(String[] args) {
     ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7); 

        System.out.println(maxWater(h));
    } 
    static int maxWater(ArrayList<Integer> height){
     int maxWtr = 0;
     int lp = 0;
     int rp = height.size()-1;
     while(lp<rp){
        int h = Math.min(height.get(lp), height.get(rp));
        int w = rp - lp;
        int currWater = h * w;
        maxWtr = Math.max(maxWtr, currWater);

        if(height.get(lp)<height.get(rp)){
          lp++;
        }else{
            rp--;
        }
     }
     return maxWtr;
    }
}
