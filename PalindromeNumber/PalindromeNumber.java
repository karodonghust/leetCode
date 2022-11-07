package PalindromeNumber;

public class PalindromeNumber {


    public static void main(String[] args) {

    }


    public boolean isPalindrome(int x) {
        Boolean result = false;
        if (x < 0) {
            result = false;
        } else if (x == 0) {
            result = true;
        } else {
            int temp = x;
            int reverse = 0;
            while (temp != 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            if (reverse == x) {
                return true;
            }
        }
        return result;
    }
}
