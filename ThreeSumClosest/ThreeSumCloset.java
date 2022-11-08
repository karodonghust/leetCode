package ThreeSumClosest;


import java.util.Arrays;

public class ThreeSumCloset {


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[1] + nums[2] + nums[0];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = a + nums[j] + nums[k];
                if (sum == target) {
                    result = target;
                    return result;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
