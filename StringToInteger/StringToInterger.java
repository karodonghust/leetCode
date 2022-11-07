package StringToInteger;

public class StringToInterger {

    public static void main(String[] args) {
        System.out.println(StringToInterger.myAtoi("2147483648"));
    }

    public static int myAtoi(String s) {
        int result = 0;
        int negative = 0;
        for (int i = 0; i < s.length(); i++) {
            char numStr = s.charAt(i);
            if (numStr == ' ' && negative == 0) {
                continue;
            } else if (numStr == '-' && negative == 0) {
                negative = -1;
                continue;
            } else if (numStr == '+' && negative == 0) {
                negative = 1;
                continue;
            } else if (negative == 0 && numStr !=' ') {
                negative = 1;
            }
            if (numStr < '0' || numStr > '9') {
                break;
            }
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE/10 && numStr - '0' >7)) {
                if (negative > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            result = result * 10 + (numStr - '0');

        }
        return result * negative;
    }
}
