package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int foot = 0;
        for (int i = 0; i + foot < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1 + foot]) {
                nums[i + 1] = nums[i + 1 + foot];
            } else {
                foot++;
                i--;
            }
        }
        for (int i : nums) {
            System.out.println(i);

        }
        return nums.length - foot;
    }
}
