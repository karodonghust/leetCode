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

    public int[] getNext(String pattern) {
        char[] p = pattern.toCharArray();
        int[] next = new int[p.length];
        int i = 0;
        int k = -1;
        next[0] = k;
        while (i < p.length - 1) {
            /** 如果k等于-1，则表示 j = 0 此时next[1】 = 0.
             如果k不等于-1，p[j] == p[k]  表示j与j-1相比公共子串长度加一

             else 时
             如果
             */
            if (k == -1 || p[k] == p[i]) {
                next[++i] = ++k;
            } else {
                /**
                 * 此时表示由于p[j] != p[k] 则p[j-1]的公共子串失去作用，此时p[j-1]的最长公共子串的最长公共子串依然是重合的
                 * ，因此将k回退到next[k] 然后去判断第k个与j个是否相等，相等则表示最长公共子串加一，不想等，则继续找它的最长公共子串
                 */
                k = next[k];
            }
        }

        return next;
    }

    public int solution(String haystack, String needle) {
        int index = -1;
        char[] p = needle.toCharArray();
        char[] s = haystack.toCharArray();
        int i = 0;
        int j = 0;
        int[] next = new FindTheIndexOfTheFirstOccurrenceAnAString().getNext(needle);
        while (j < p.length && i < s.length) {

            if (j == -1 || p[j] == s[i]) {
                j++;
                i++;
            } else {
                //表示将模式串，向前拖动j的最长公共子串个长度
                j = next[j];
            }
        }
        if (j == p.length) {
            index = i - j;
        }
        return index;
    }
}
