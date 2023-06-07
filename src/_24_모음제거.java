import java.util.Arrays;

class Solution24 {
    public String solution(String my_string) {
        String[] words = my_string.split(" "); // 주어진 문자열을 공백을 기준으로 분리하여 단어 배열 생성

        for (int i = 0; i < words.length; i++) {
            words[i] = removeVowels(words[i]); // 모음을 제거한 단어로 대체
        }

        return String.join(" ", words); // 단어들을 공백을 포함하여 연결하여 최종 결과 문자열 반환
    }

    private String removeVowels(String word) {
        return word.replaceAll("[aeiouAEIOU]", ""); // 정규식을 사용하여 모음을 제거한 문자열 반환
    }

    public static void main(String[] args) {
        Solution24 s = new Solution24();
        String my_string1 = "nice to meet you";
        String result1 = s.solution(my_string1);
        System.out.println(result1); // 최종 결과 문자열 출력
    }
}


public class _24_모음제거 {
}

