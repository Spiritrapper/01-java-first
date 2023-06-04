class Solution7{
    public int solution(int angle) {
        switch (angle) {
            case 0< angle <90 :
                return 1;
            case angle = 90:
                return 2;
            case 90 < angle < 180:
                return 3;
            case angle =180:
                return 4;
    }
    public static void main (String[] args){
            Solution7 s = new Solution7();
            double angle = 95.5;
            int result = s.solution(angle);
            System.out.println(result);
        }
}


public class _08_각도기 {
}
