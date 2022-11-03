package LongString;

public class LongString {


    public static void main(String[] args) {
        String str = "abcabcbb";
        char a = 'a';
        char b = 'a';
        System.out.println(a == b);
        LongString longString = new LongString();
        System.out.println(longString.lengthOfLongestSubstring(str));
    }


    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            for (int j = 0; j < sb.length() - 1; j++) {
                if (sb.charAt(j) == c) {
                    sb.delete(0, j + 1);
                }
            }
            int temp = sb.length();
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
