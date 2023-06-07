import java.util.Arrays;

class Solution24 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder 객체 생성

        // 주어진 문자열을 반복하면서 모음을 제외한 문자를 결과에 추가
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); // 문자열에서 해당 인덱스의 문자 추출
            if (!isVowel(c)) { // 추출한 문자가 모음이 아닌 경우
                result.append(c); // 결과 문자열에 해당 문자 추가
            }
        }

        return result.toString(); // StringBuilder 객체를 String으로 변환하여 결과 문자열 반환
    }

    // 문자가 모음인지 확인하는 메소드
    private boolean isVowel(char c) {
        // 주어진 문자가 'a', 'e', 'i', 'o', 'u' 중 하나인지 확인
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Solution24 solution = new Solution24(); // Solution 객체 생성

        String my_string1 = "bus";
        String result1 = solution.solution(my_string1);
        System.out.println(result1); // "bs"

        String my_string2 = "nice to meet you";
        String result2 = solution.solution(my_string2);
        System.out.println(result2); // "nc t mt y"
    }
}

public class _24_모음제거 {
}

