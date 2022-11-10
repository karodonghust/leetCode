package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {


    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        FourSum fourSum = new FourSum();
        List<List<Integer>> list = fourSum.fourSum(nums, target);
        for (int i = 0; i < list.size(); i++) {
            List some = list.get(i);
            for (int j = 0; j < some.size(); j++) {
                System.out.println(some.get(j));
            }
        }

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int twoSum = nums[i] + nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = twoSum + nums[left] + nums[right];
                    long sumL = (long)twoSum + nums[left] + nums[right];
                    if (sum != sumL) {
                        left++;
                        right--;
                        continue;
                    }
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }


}
