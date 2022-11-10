package LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
        List<String> list = letterCombinationsOfAPhoneNumber.letterCombinations("92");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] keyboard = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        String[] tail = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            int key = Integer.parseInt(String.valueOf(digits.charAt(i)));
            tail[i] = keyboard[key];
        }
        build("", tail, result);
        return result;
    }

    public void build(String head, String[] tail, List result) {
        if (tail.length == 0) {
            result.add(head);
            return;
        }
        String current = tail[0];
        String[] currentTail = new String[tail.length - 1];
        for (int i = 0; i < tail.length - 1; i++) {
            currentTail[i] = tail[i + 1];
        }
        for (int i = 0; i < current.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(head).append(current.charAt(i));
            build(sb.toString(), currentTail, result);
        }
    }


}
