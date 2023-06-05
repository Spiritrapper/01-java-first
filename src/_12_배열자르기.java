import java.util.Arrays;
//
//class Solution12 {
//    public int[] solution(int[] numbers, int num1, int num2) {
//        return Arrays.copyOfRange(numbers, num1, num2 + 1);
//    }
//
//    public static void main(String[] args) {
//        Solution12 s = new Solution12();
//        int[] numbers1 = {1, 2, 3, 4, 5};
//        int num1 = 1;
//        int num2 = 3;
//        int[] result1 = s.solution(numbers1, num1, num2);
//        System.out.println(Arrays.toString(result1));
//
//        int[] numbers2 = {1, 3, 5};
//        num1 = 1;
//        num2 = 2;
//        int[] result2 = s.solution(numbers2, num1, num2);
//        System.out.println(Arrays.toString(result2));
//    }
//}





public class _12_배열자르기 {

    static class Solution12 {
        public int[] solution(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1, num2 + 1);
        }

        public static void main(String[] args) {
            Solution12 s = new Solution12();
            int[] numbers1 = {1, 2, 3, 4, 5};
            System.out.print(s.solution(numbers1, 1, 3));
            int[] numbers2 = {1, 3, 5, 7, 9};
            System.out.print(s.solution(numbers2, 1, 3));

        }

    }
}