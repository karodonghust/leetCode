package ContainerWithMostWater;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[3];
        height[0] = 1;
        height[1] = 2;
        height[2] = 6;
    }


    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = height[left] < height[right] ? height[left] : height[right];
            area = h * (right - left) > area? h * (right - left) : area;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
