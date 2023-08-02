package ArrayList;

import java.util.ArrayList;

public class containerWithMostWater01 {
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

        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int h = Math.min(height.get(i),height.get(j));
                int w = j - i;
                int currWater = h * w;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
}
