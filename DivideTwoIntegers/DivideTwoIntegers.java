package DivideTwoIntegers;

public class DivideTwoIntegers {


    public static void main(String[] args) {

        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divideNew(-2147483648
                , 2));
    }


    public int divideNew(int dividend, int divisor) {
        int result = 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (divisor == 1) {
            return dividend;
        }
        int resultChar = 2;
        if (dividend < 0) {
            resultChar--;
        } else {
            dividend = 0 - dividend;
        }
        if (divisor < 0) {
            resultChar--;
        } else {
            divisor = 0 - divisor;
        }

        while (dividend <= divisor) {
            int value = divisor;
            int n = 1;
            while (value >= Integer.MIN_VALUE - value  && dividend <= value + value ) {
                value += value;
                n += n;
            }
            dividend = dividend - value;
            result += n;
        }
        result = resultChar == 1 ? 0 - result : result;
        return result;

    }

    public int divide(int dividend, int divisor) {
        int dividendSign = 1;
        int divisorSign = 1;
        long dividendL = dividend;
        long divisorL = divisor;
        if (dividend < 0) {
            dividendSign = -1;
            dividendL = 0 - dividendL;
        }
        if (divisor < 0) {
            divisorSign = -1;
            divisorL = 0 - divisorL;
        }
        long result = 0;
        if (divisorL == 1) {
            result = dividendL;
        } else {
            while (dividendL >= divisorL) {
                dividendL = dividendL - divisorL;
                result++;
            }
        }

        if ((divisorSign + dividendSign) == 0) {
            result = 0 - result;
        }
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
