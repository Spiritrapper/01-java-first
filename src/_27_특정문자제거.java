import java.util.Arrays;
class Solution27 {
    public String solution(String my_string, String letter) {
        String[] words = my_string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != letter) {
                words[i] ;

            }
            else
                break;
        }
        return String.join(" ", words);

        }
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        String my_string1 = "love life long toutht";
        String letter1 = "l";
        String result1 = s.solution(my_string1, letter1);
        System.out.println(result1 );

}



public class _27_특정문자제거 {
}
