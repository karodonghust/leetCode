package FindTheIndexOfTheFirstOccurrenceAnAString;

public class FindTheIndexOfTheFirstOccurrenceAnAString {


    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        int index = 0 - needle.length();
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == haystack.length()) {
            if (needle.equals(haystack)) {
                return 0;
            }
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    index = 0 - needle.length();
                    break;
                } else {
                    index++;
                }
            }
            if (index == 0) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            index = -1;
        }
        return index;
    }
}
