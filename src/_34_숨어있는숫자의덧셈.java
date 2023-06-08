
class Solution34 {

    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                int n = Character.getNumericValue(c);
                sum += n;
            } else {
                return 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        String my_string = "GA12AJFG345";
        int result = solution.solution(my_string);
        System.out.println(result); // 15

        my_string = "abc1SJ2FJ3HS";
        result = solution.solution(my_string);
        System.out.println(result); // 0

    }
}







public class _34_숨어있는숫자의덧셈 {
}
