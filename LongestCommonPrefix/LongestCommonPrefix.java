package LongestCommonPrefix;

public class LongestCommonPrefix {


    public static void main(String[] args) {

    }


    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String letter = strs[0];
        for (int i = 0; i < letter.length(); i++) {
            char current = letter.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != current) {
                    return sb.toString();
                }
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
