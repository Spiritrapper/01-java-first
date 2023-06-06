class Solution21 {
    public int solution(int[] sides) {
        for (int i = 0; i < sides.length; i++) {
            for (int j = 0; j < sides.length; j++) {
                for (int k = 0; k < sides.length; k++) {
                    if (sides[i] + sides[j] <= sides[k])  // 삼각형 조건을 만족하지 않는 경우
                        return 1;
                }
            }
        }

        return 3;  // 모든 경우에 삼각형 조건을 만족하는 경우
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();
        int[] sides1 = {2, 8, 15};
        int result1 = s.solution(sides1);
        System.out.println(result1);
    }
}



public class _21_삼각형의완성조건 {
}
