import java.util.Random;
import java.util.Scanner;

public class _47_secretquiz{ 
    public static void main(String[] args) {
        // 문이 5개가 있고 각 문마다 점점 어려운 수식 퀴즈가 출제 (랜덤)
        // 맞히면 통과, 틀리면 실패

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i <= 5; i++) {
            // x * y = ?
            int num1 = getRandomNumber(random, i);
            int num2 = getRandomNumber(random, i);
            showQuestion(i, num1, num2);

            int answer = scanner.nextInt();
            if (answer == -1) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else if (answer == num1 * num2) {
                // 성공
                success();
                count++;
            } else {
                // 실패
                fail();
            }
        }

        System.out.println("\n\n 당신은 5개의 비밀번호 중 " + count + "개를 맞추셨습니다.");
    }

    public static int getRandomNumber(Random random, int level) {
        return random.nextInt(level * 7) + 1;
    }

    public static void showQuestion(int level, int num1, int num2) {
        System.out.println("\n\n\n###### " + level + " 번째 비밀번호 ######");
        System.out.println("\n\n " + num1 + " x " + num2 + " 는 ?");
        System.out.println("#####################################");
        System.out.print("\n비밀번호를 입력하세요 (종료 : -1) >> ");
    }

    public static void success() {
        System.out.println("\n >> Good ! 정답입니다. \n");
    }

    public static void fail() {
        System.out.println("\n >> 땡 ! 틀렸습니다. \n");
    }
}
