class Solution13 {
    public int solution(String message) {
        int massageLength = message.length();
        int paperLength = 2 * massageLength+2;
        return 2 * massageLength+2;
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();
        String message = "happy birthday!";
        int result = s.solution(message);
        System.out.println(result);
        message = "I love you~";
        result = s.solution(message);
        System.out.println(result);


    }
}




public class _13_편지 {
}
