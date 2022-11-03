package MedianOfTwoSort;

public class MedianOfTwoSort {

    public static void main(String[] args) {
        int[] nums1 = new int[2];
        int[] nums2 = new int[1];
        nums1[0] = 1;
        nums1[1] = 3;
        nums2[0] = 2;
        MedianOfTwoSort medianOfTwoSort = new MedianOfTwoSort();
        System.out.println(medianOfTwoSort.findMedianSortedArrays(nums1, nums2));
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int medianIndex = ((nums1.length + nums2.length) / 2);
        boolean s1OutOfBound = false;
        boolean s2OutOfBound = false;
        boolean isOdd = (nums1.length + nums2.length) % 2 != 0;
        double median = 0;
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            int temp1;
            int temp2;
            if (s1OutOfBound || index1 >= nums1.length) {
                s1OutOfBound = true;
                temp1 = nums2[index2];
            } else {
                temp1 = nums1[index1];
            }
            if (s2OutOfBound || index2 >= nums2.length) {
                s2OutOfBound = true;
                temp2 = nums1[index1];
            } else {
                temp2 = nums2[index2];
            }
            if (temp1 < temp2) {
                if (s1OutOfBound) {
                    index2++;
                } else {
                    index1++;
                }
            } else {
                temp1 = temp2;
                if (s2OutOfBound) {
                    index1++;
                } else {
                    index2++;
                }
            }
            if (isOdd) {
                if (i == medianIndex) {
                    median = temp1;
                    break;
                }
            } else {
                if (i == medianIndex -1) {
                    median = temp1;
                } else if (i == medianIndex) {
                    median = (median + temp1) / 2.0;
                }
            }

        }
        return median;
    }
}
