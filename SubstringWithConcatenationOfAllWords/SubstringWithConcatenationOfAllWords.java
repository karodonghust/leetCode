package SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {


    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a.substring(0,3));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLength = words[0].length();
        int wordsLength = words.length;
        for (int i = 0; i < s.length() - wordsLength * wordLength; i++) {
            String targetString = s.substring(i,i + wordLength * wordsLength);

        }

        return null;
    }

    public void solutin(String s, String[] words, List<Integer> list) {
        if (s.length() == 0) {
            return;
        }

    }


}
