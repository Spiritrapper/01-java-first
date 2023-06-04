
public class  _02_두수의뺀값리턴 {
    public static int solution(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result = solution(num1, num2);
        System.out.println(result); // 출력: -1
    }
}

