class Solution21 {
    public int solution(int[] sides) {
        for (int i = 0; i < sides.length; i++) {
            for (int j = 0; j < sides.length; j++) {
                for (int k = 0; k < sides.length; k++) {
                }
                if(sides[i] + sides[j] <= sides[k])
                    return 1;


            }

        }else
            return 3;

    }
}



public class _21_삼각형의완성조건 {
}
