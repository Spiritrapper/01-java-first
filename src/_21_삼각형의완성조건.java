import java.util.Arrays;
class Solution21 {
    public int solution(int[] sides) {
        // 세 변의 길이를 오름차순으로 정렬
        Arrays.sort(sides);

        int maxSide = sides[2];  // 가장 긴 변의 길이
        int sumOfOtherSides = sides[0] + sides[1];  // 나머지 두 변의 길이의 합

        if (maxSide < sumOfOtherSides) {
            return 1;  // 삼각형을 완성할 수 있는 경우
        } else {
            return 2;  // 삼각형을 완성할 수 없는 경우
        }
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();
        int[] sides1 = {1, 2, 3};
        int result1 = s.solution(sides1);
        System.out.println(result1);  // 2

        int[] sides2 = {3, 6, 2};
        int result2 = s.solution(sides2);
        System.out.println(result2);  // 2

        int[] sides3 = {199, 72, 222};
        int result3 = s.solution(sides3);
        System.out.println(result3);  // 1
    }
}



public class _21_삼각형의완성조건 {
}
