import java.util.Arrays;

class Solution18 {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (0 < x && 0 < y) {
            return 1;
        } else if (0 < x && 0 > y) {
            return 4;
        } else if (0 > x && 0 < y) {
            return 2;
        } else if (0 > x && 0 > y) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution18 s = new Solution18();
        int[] dot1 = {2, 4};
        int result1 = s.solution(dot1);
        System.out.println(Arrays.toString(dot1) + " => " + result1);
    }
}








public class _18_점의위치구하기 {
}
