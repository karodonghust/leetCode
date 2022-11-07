package LongestPalindromicSubstring;


public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String str = "xaacbaxabcaax";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int step = 1;
            StringBuilder obbSb = new StringBuilder();
            while ((i + step) < s.length() && (i - step) >= 0) {
                if (s.charAt(i + step) == s.charAt(i - step)) {
                    obbSb.append(s.charAt(i + step));
                    if ((obbSb.length() * 2) + 1 > result.length()) {
                        String temp = obbSb.toString();
                        StringBuilder resultBuild = new StringBuilder();
                        resultBuild.append(temp);
                        result = resultBuild.reverse().toString() + s.charAt(i) + temp;
                    }
                    step++;
                } else {
                    break;
                }
            }
            step = 1;
            StringBuilder sb = new StringBuilder();
            while ((i + step - 1) < s.length() && (i - step) >= 0) {
                if (s.charAt(i + step - 1) == s.charAt(i - step)) {
                    sb.append(s.charAt(i + step - 1));
                    if ((sb.length() * 2) > result.length()) {
                        String temp = sb.toString();
                        StringBuilder resultBuild = new StringBuilder();
                        resultBuild.append(temp);
                        result = resultBuild.reverse() + temp;
                    }
                    step++;
                } else {
                    break;
                }
            }
        }
        if(result.length() == 0){
            result = s.substring(0,1);
        }
        return result;
    }
}
