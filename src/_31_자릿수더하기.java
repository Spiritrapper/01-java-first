class Solution31 {
    public int solution(int n) {
        int sum = 0;

        // 정수 n의 각 자릿수를 더합니다.
        while (n >0) {
            sum += n % 10; // n의 임의 자리 숫자를 더합니다.
            n /= 10;       // n울 10으로 나누어 다음 자릿수로 이동합니다.
        }

        return sum;

    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();
        int n1 =12345;
        int result = s.solution(n1);
        System.out.println(result);
    }
}






public class _31_자릿수더하기 {
}
