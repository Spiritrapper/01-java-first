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
            return 0; // 각도 범위에 맞지 않을 경우 0을 반환하도록 설정
        }
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        double angle = 70;
        int result1 = s.solution(angle);
        System.out.println(result1);
        angle = 91;
        int result2 = s.solution(angle);
        System.out.println(result2);
        angle = 180;
        int result3 = s.solution(angle);
        System.out.println(result3);
    }
}


public class _08_각도기 {
}
