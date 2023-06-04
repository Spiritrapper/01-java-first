class Solution7 {
    public int solution(double angle) {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(70));
        System.out.println(s.solution(91));
        System.out.println(s.solution(180));
    }
}








public class _08_각도기 {
}
