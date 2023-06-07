import java.util.Arrays;
class Solution24 {
    public String solution(String my_string) {
        String[] words = my_string.split(" "); // 주어진 문자열을 공백을 기준으로 분리하여 단어들의 배열 생성

        for (int i = 0; i < words.length; i++) {  // 배열을 만들어야 length의 사용가능
            if (containsVowel(words[i])) { // 해당 단어에 모음이 포함되어 있는지 확인
                words[i] = ""; // 모음이 포함된 단어는 빈 문자열로 대체
            }
        }

        return String.join("", words); // 단어들을 공백 없이 연결하여 최종 결과 문자열 반환
    }

    private boolean containsVowel(String word) {
        return word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u");

        // 단어에 모음(a, e, i, o, u)이 포함되어 있는지 확인하는 메서드
    }

    public static void main(String[] args) {
        Solution24 s = new Solution24();
        String my_string1 = "nice to meet you";
        String result1 = s.solution(my_string1);
        System.out.println(s.solution(my_string1));
    }
}


public class _24_모음제거 {
}

