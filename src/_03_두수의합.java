class Solution2 {
    public int solution(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int num1 = 2;
        int num2 = 3;
        int result1 = solution.solution(num1, num2);
        System.out.println(result1);

        num1 = 100;
        num2 = 2;
        int result2 = solution.solution(num1, num2);
        System.out.println(result2);
    }
}

public class _03_두수의합 {
}
