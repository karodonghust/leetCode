package ZigZag;

public class ZigZag {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(str);
        System.out.println(ZigZag.convert(str, numRows));
    }


    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int segment = (2 * numRows) - 2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += segment) {
            sb.append(s.charAt(i));
        }

        for (int i = 1; i < numRows - 1; i++) {
            for (int j = i; j < s.length(); j += segment) {
                sb.append(s.charAt(j));
                if ((j + segment - (2 * i)) < s.length()) {
                    sb.append(s.charAt((j + segment - (2 * i))));
                }
            }
        }


        for (int i = numRows - 1; i < s.length(); i += segment) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
