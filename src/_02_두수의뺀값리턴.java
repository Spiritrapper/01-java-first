public class _02_두수의뺀값리턴 {
    public static int solution(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result1 = solution(num1, num2);
        System.out.println(result1); // 출력: -1

        int num3 = 100;
        int num4 = 2;
        int result2 = solution(num3, num4);
        System.out.println(result2); // 출력: 98

    }
}
