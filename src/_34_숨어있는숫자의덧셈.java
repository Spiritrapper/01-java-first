class Solution34 {
    public int solution(String my_string) {
        int sum = 0; // 합계를 저장할 변수
        String[] words = my_string.split(""); // 문자열을 한 글자씩 나눠서 배열에 저장

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(" ")) { // 공백 문자가 아닌 경우에만 처리
                try {
                    int n = Integer.parseInt(words[i]); // 문자열을 정수로 변환
                    sum += n; // 합계에 정수값 더하기
                } catch (NumberFormatException e) {
                    sum += 0; // 숫자로 변환할 수 없는 경우에는 0을 더해도 변화 없음
                }
            }
        }
        return sum; // 최종 합계 반환
    }

    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        String my_string1 = "aAb1B2cC34oOp";
        int result1 = solution.solution(my_string1);
        System.out.println(result1); // 10

        String my_string2 = "1a2b3c4d123";
        int result2 = solution.solution(my_string2);
        System.out.println(result2); // 16
    }
}




public class _34_숨어있는숫자의덧셈 {
}
