package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 2, 6};
        a = Arrays.stream(a).sorted().distinct().toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a > 0) {
                break;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum + a == 0) {
                    set.add(Arrays.asList(a,nums[j],nums[k]));
                    j++;
                    k--;
                } else if (sum + a < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
