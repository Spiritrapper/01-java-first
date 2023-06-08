class Solution33 {
    public int[] solution(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) {
                return int(i);
            }else
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();
        int n = 10;
        int [] result = s.solution(n);
        System.out.println(result);
    }
}



public class _33_짝수는싫어요 {
}
