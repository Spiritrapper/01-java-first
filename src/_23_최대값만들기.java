import java.util.Arrays;
class Solution23 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length -1] * numbers[numbers.length-2];
        return answer;
    }

    public static void main(String[] args) {
        Solution23 s = new Solution23();
        int[] numbers1 = {3, 1, 5, 2, 4};
        int result1 = s.solution(numbers1);
        System.out.println(result1);
    }

}


public class _23_최대값만들기 {
}
