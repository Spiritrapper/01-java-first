import java.util.Arrays;

class Solution12 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];   // 문제 answer 배열선언 특정 배열의 크기는 int[end - start+1] 여기서 end start 전부 인덱스값 = 위치값
        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];         // 특정배열위치인덱스값은 answer[i-start] 0부터 시작하기때문에
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int[] result1 = s.solution(numbers1, num1, num2);
        System.out.println(Arrays.toString(result1));

        int[] numbers2 = {1, 3, 5};
        num1 = 1;
        num2 = 2;
        int[] result2 = s.solution(numbers2, num1, num2);
        System.out.println(Arrays.toString(result2));
    }
}





public class _12_배열자르기 {
}
