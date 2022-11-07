package RegularExpressionMatching;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";

        System.out.println(RegularExpressionMatching.isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        boolean result = false;
        if (s.equals(p)) {
            result = true;
        }
        return false;
    }
}
