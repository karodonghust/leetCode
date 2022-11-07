package ReverseInteger;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(-2147483648));
    }


    public static int reverse(int x) {
        int isNegative = x >= 0 ? 1 : -1;
        int result = 0;
        while (x != 0) {
            if (result > 0 && result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (result < 0 && result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
