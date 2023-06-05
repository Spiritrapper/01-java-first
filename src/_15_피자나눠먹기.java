class Solution15 {
    public int solution(int slice, int n) {
        int minPans = 0; // 최소 판수를 저장할 변수

        // 한 판에 나눠지는 피자 조각 수가 n보다 작을 경우
        if (slice < n) {
            minPans = n / slice; // 최소 판수는 n을 slice로 나눈 몫
            if (n % slice != 0) {
                minPans++; // 남은 조각이 있을 경우 판수 1 증가
            }
        }
        // 한 판에 나눠지는 피자 조각 수가 n보다 크거나 같을 경우
        else {
            minPans = 1; // 최소 판수는 1
        }

        return minPans;
    }

    public static void main(String[] args) {
        Solution15 solution = new Solution15();

        int slice1 = 7;
        int n1 = 10;
        int result1 = solution.solution(slice1, n1);
        System.out.println("slice: " + slice1 + ", n: " + n1 + ", result: " + result1);

        int slice2 = 4;
        int n2 = 12;
        int result2 = solution.solution(slice2, n2);
        System.out.println("slice: " + slice2 + ", n: " + n2 + ", result: " + result2);
    }
}

public class _15_피자나눠먹기 {
}
