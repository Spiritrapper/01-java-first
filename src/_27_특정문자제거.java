import java.util.Arrays;

class Solution27 {
    public String solution(String my_string, String letter) {
        String[] words = my_string.split("");
        // 주어진 문자열을 빈 문자열("")을 기준으로 문자 단위로 분리하여 words 배열에 저장합니다.

        StringBuilder result = new StringBuilder();
        // 결과를 저장하기 위한 StringBuilder 객체를 생성합니다.

        for (String word : words) {
            // words 배열을 순회하면서 각 문자를 word 변수에 담아 반복합니다.

            if (!word.contains(letter)) {
                // 만약 word 변수에 저장된 문자가 letter 문자를 포함하지 않는다면 실행합니다.

                result.append(word);
                // word 문자를 결과 문자열인 result에 추가합니다.
                // 여기서 ""을 추가하는 이유는 문자 단위로 분리되었기 때문에 원래 문자열의 구분을 위해 빈 문자열을 추가합니다.
            }
        }

        return result.toString();
        // 결과 문자열인 result를 문자열로 변환하고 양쪽 공백을 제거한 후 반환합니다.
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







