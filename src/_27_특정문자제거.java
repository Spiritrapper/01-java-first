import java.util.Arrays;

class Solution27 {
    public String solution(String my_string, String letter) {
        String[] words = my_string.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.contains(letter)) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();
        String my_string1 = "love life long thought";
        String letter1 = "l";
        String result1 = s.solution(my_string1, letter1);
        System.out.println(result1);
    }
}




public class _27_특정문자제거 {
}







