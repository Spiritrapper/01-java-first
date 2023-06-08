class Solution33 {
    public static int[] solution(int n) {
        int[] result = new int[(n + 1) / 2];  // 홀수 개수에 해당하는 배열 길이를 계산

        int idx = 0;
        for (int i = 1; i <= n; i += 2) {
            result[idx] = i;
            idx++;
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int[] result1 = solution(n1);
        for (int num : result1) {
            System.out.print(num + " ");  // 1 3 5 7 9
        }
        System.out.println();

        int n2 = 15;
        int[] result2 = solution(n2);
        for (int num : result2) {
            System.out.print(num + " ");  // 1 3 5 7 9 11 13 15
        }
        System.out.println();
    }
}





public class _33_짝수는싫어요 {
}
