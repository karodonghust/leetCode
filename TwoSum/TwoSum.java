package TwoSum;


public class TwoSum {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = (new TwoSum()).twoSum(nums, target);
        int[] a = {1, 2};
        int[] b = {1, 2};
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int num1;
        int num2;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = i+1; j < nums.length - (i + 1); j++) {
                num2 = nums[j];
                if((num1 + num2) == target){
                    result[0] = num1;
                    result[1] = num2;
                    break;
                }
            }
        }
        return nums;
    }
}