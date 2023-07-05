import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals {
     public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            if (list.size() == 0) {
                list.add(interval);
            } else {
                int[] preinterval = list.get(list.size() - 1);
                if (interval[0] <= preinterval[1]) {
                    preinterval[1] = Math.max(preinterval[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    } 

    public static void main(String[] args) {
        int[][] arr = {{1,3},{8,10},{2,6},{9,9},{15,18}};
        int[][] ans = merge(arr); 
        for(int[] interval : ans){
         System.out.print(Arrays.toString(interval));
        }
       
    }
}
