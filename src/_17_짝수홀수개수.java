import java.util.Arrays;

class Solution17 {
    public int[] solution(int[] num_list) {
        // 짝수를 저장할 배열 선언
        int[] even = new int[num_list.length];

        // 홀수를 저장할 배열 선언
        int[] odd = new int[num_list.length];

        // 홀수의 개수를 카운트하기 위한 변수 초기화
        int oddCount = 0;

        // 짝수의 개수를 카운트하기 위한 변수 초기화
        int evenCount = 0;

        // num_list 배열을 순회하면서 홀수와 짝수를 분리하여 배열에 저장
        for (int num : num_list) {
            if (num % 2 == 0) {
                // 짝수일 경우 even 배열에 저장
                even[evenCount] = num;
                evenCount++;
            } else {
                // 홀수일 경우 odd 배열에 저장
                odd[oddCount] = num;
                oddCount++;
            }
        }

        // 결과를 저장할 배열 선언
        int[] result = {evenCount, oddCount};

        // 결과 배열 반환
        return result;
    }

    public static void main(String[] args) {
        Solution17 s = new Solution17();

        // 입력 리스트
        int[] num_list1 = {1, 2, 3, 4, 5, 6};

        // solution 메소드 호출하여 결과 저장
        int[] result1 = s.solution(num_list1);

        // 입력 리스트와 결과 출력
        System.out.println("num_list: " + Arrays.toString(num_list1));
        System.out.println("result: " + Arrays.toString(result1));
    }
}
public class _17_짝수홀수개수 {
}
