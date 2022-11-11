package GenerateParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {


    public static void main(String[] args) {
        List<String> result = new GenerateParentheses().generateParenthesis(3);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();
        build("", n, n, set);
        return new ArrayList<>(set);

    }

    public void build(String body, int left, int right, Set<String> set) {
        if (left == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(body);
            for (int i = 0; i < right; i++) {
                sb.append(")");
            }
            set.add(sb.toString());
        } else if (right <= left) {
            build(body + "(", left - 1, right, set);
        } else {
            build(body + "(", left - 1, right, set);
            build(body + ")", left, right - 1, set);
        }
    }
}
