class Solution4 {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int result1 = s.solution(2, 3);
        System.out.println(result1);
        int result2 = s.solution(11, 11);
        System.out.println(result2);
        int result3 = s.solution(7, 99);
        System.out.println(result3);
    }
}
public class _05_숫자비교하기 {
}
