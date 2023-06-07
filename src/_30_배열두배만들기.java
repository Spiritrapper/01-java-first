import java.util.Arrays;
class Solution30 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 결과 배열을 저장할 배열 생성

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; // 각 요소를 2배로 변환하여 결과 배열에 저장
        }

        return answer; // 결과 배열을 반환
    }

    public static void main(String[] args) {
        Solution30 s = new Solution30();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] result = s.solution(numbers1);
        System.out.println(Arrays.toString(result)); // 결과 배열 출력
    }
}





public class _30_배열두배만들기 {
}
