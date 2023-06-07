
class Solution31 {
    public int solution(int n) {
        String numString = String.valueOf(n); // 정수 n을 문자열로 변환
        int[] digits = new int[numString.length()]; // 자리 숫자를 저장할 배열생성
        for (int i = 0; i < numString.length(); i++) {
            digits[i] = Character.getNumericValue(numString.charAt(i));
        }
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();
        // Example test cases
        int n1 = 1234;
        int result1 = s.solution(n1);
        System.out.println(result1); // Expected: 10

        int n2 = 930211;
        int result2 = s.solution(n2);
        System.out.println(result2); // Expected: 16
    }
}





public class _31_자릿수더하기 {
}
