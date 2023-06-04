class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return average;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double result1 = s.solution(numbers1);
        System.out.println(result1);

        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double result2 = s.solution(numbers2);
        System.out.println(result2);
    }
}




public class _10_배열평균 {
}
