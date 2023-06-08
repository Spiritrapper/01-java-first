class Solution38 {
    public int solution(int n, int t) {
        int bacteria = n;  // 초기 세균의 개수

        // t시간 동안 세균 증식 계산
        for (int i = 1; i <= t; i++) {
            bacteria *= 2;  // 세균의 개수를 두 배로 증가
        }

        return bacteria;
    }

    public static void main(String[] args) {
        Solution38 solution = new Solution38();

        int n1 = 2;
        int t1 = 10;
        int result1 = solution.solution(n1, t1);
        System.out.println(result1);  // 2048

        int n2 = 7;
        int t2 = 15;
        int result2 = solution.solution(n2, t2);
        System.out.println(result2);  // 229,376
    }
}


public class _38_세균증식 {
}
