class Solution8 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        int result1 = s.solution(10);
        System.out.println(result1);
        int result2 = s.solution(4);
        System.out.println(result2);
    }
}





public class _09_짝수의합 {
}
