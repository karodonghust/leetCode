package RemoveElement;

public class RemoveElement {


    public static void main(String[] args) {

    }


    public int removeElement(int[] nums, int val) {
        int foot = 0;
        for (int i = 0; i + foot < nums.length; i++) {
            if (nums[i + foot] != val) {
                nums[i] = nums[i + foot];
            } else {
                foot++;
                i--;
            }
        }
        return nums.length - foot;
    }
}
