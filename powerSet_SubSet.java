import java.util.ArrayList;
import java.util.List;

public class powerSet_SubSet {
        public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int total = 1 << n;

        List<List<Integer>> powerSet = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            List<Integer> subSet = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subSet.add(nums[j]);
                }
            }
            powerSet.add(subSet);
        }
        return powerSet;
    }

    public static void main(String[] args) {
        powerSet_SubSet solution = new powerSet_SubSet();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        System.out.println(subsets);
    }
}
