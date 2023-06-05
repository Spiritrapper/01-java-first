class Solution {
    public int solution(int slice, int n) {
        return (n % slice == 0) ? (n / slice) : (n / slice + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

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
