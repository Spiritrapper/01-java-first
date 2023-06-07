import java.util.Arrays;
class Solution27 {
    public String solution(String my_string, String letter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == letter.charAt(0)) {
                continue;
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();
        String my_string1 = "abcdef";
        String letter1 = "f";
        String result1 = s.solution(my_string1, letter1);
        System.out.println(result1);  // 출력: "abcde"

        String my_string2 = "BCBdbe";
        String letter2 = "B";
        String result2 = s.solution(my_string2, letter2);
        System.out.println(result2);  // 출력: "Cdbe"
    }
}

public class _27_특정문자제거 {
}







