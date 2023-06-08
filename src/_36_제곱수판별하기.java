class Solution36 {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);  // 주어진 자연수의 제곱근을 계산하여 정수로 변환

        if (sqrt * sqrt == n) {  // 제곱근을 제곱한 값과 원래 값이 같으면 제곱수
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Solution36 solution = new Solution36();

        int n1 = 144;
        int result1 = solution.solution(n1);
        System.out.println(result1);  // 1

        int n2 = 976;
        int result2 = solution.solution(n2);
        System.out.println(result2);  // 2
    }
}




public class _36_제곱수판별하기 {
}
