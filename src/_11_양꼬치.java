//#include <stdio.h>
//        #include <stdbool.h>
//        #include <stdlib.h>

class Solution11 {
    public int solution(int n, int k) {
        if (n < 10) {
            for (int i = 0; i < n; i++) {
                int result = 12000 * i;
                return 12000 * i;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int result = 12000 * i - i / n * 2000;
                return 12000 * i - i / n * 2000;
            }
        }

        for (int j = 0; j < k; j++) {
            int result = 2000 * j;
            return 2000 * j;
        }

        return 0; // 모든 조건에 해당하지 않을 경우 0을 반환
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int n = 10;
        int k = 3;
        int result1 = s.solution(10, 3);
        System.out.println(result1);
    }
}





public class _11_양꼬치 {
}
