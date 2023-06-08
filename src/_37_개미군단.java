class Solution37 {
    public int solution(int hp) {
        int generals = hp / 5;  // 장군개미의 수
        int lieutenants = 0;    // 병정개미의 수
        int soldiers = 0;       // 일개미의 수

        // 장군개미 수를 조정하며 최소 개미 수를 찾음
        while (generals >= 0) {
            int remainingHP = hp - generals * 5;  // 장군개미로 처리하지 못한 체력

            // 잔여 체력에 대해 병정개미 수 계산
            lieutenants = remainingHP / 3;
            soldiers = remainingHP % 3;

            // 조건에 맞는 경우 반복 종료
            if (soldiers == 0)
                break;

            // 장군개미 수를 하나 줄이고 다시 계산
            generals--;
        }

        return generals + lieutenants + soldiers;
    }

    public static void main(String[] args) {
        Solution37 solution = new Solution37();

        int hp1 = 23;
        int result1 = solution.solution(hp1);
        System.out.println(result1);  // 5

        int hp2 = 24;
        int result2 = solution.solution(hp2);
        System.out.println(result2);  // 6

        int hp3 = 999;
        int result3 = solution.solution(hp3);
        System.out.println(result3);  // 201
    }
}










public class _37_개미군단 {
}
