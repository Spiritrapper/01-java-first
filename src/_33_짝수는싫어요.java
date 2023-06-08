import java.util.Arrays;

class Solution33 {
    public int[] solution(int n) {
        if (n % 2 != 0) {
            return new int[]{n};  // n이 홀수인 경우 크기가 1인 배열을 생성하고, n을 요소로 가지도록 초기화하여 반환
        } else {
            return new int[]{};  // n이 짝수인 경우 빈 배열을 생성하여 반환
        }
    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();  // Solution33 객체 생성
        int n = 10;  // 입력값 설정
        int[] result = s.solution(n);  // solution 메소드 호출하여 결과값 받기
        System.out.println(Arrays.toString(result));  // 결과값 출력
    }
}


public class _33_짝수는싫어요 {
}
