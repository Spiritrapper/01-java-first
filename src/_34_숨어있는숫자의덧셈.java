class Solution34 {
    public int solution(String my_string) {
        int sum = 0;
        String[] words = my_string.split("");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                try {
                    int n = Integer.parseInt(words[i]);
                    sum += n;
                } catch (NumberFormatException e) {
                    return 0;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        String my_string1 = "aAb1B2cC34oOp";
        int result1 = solution.solution(my_string1);
        System.out.println(result1); // 10

        String my_string2 = "1a2b3c4d123";
        int result2 = solution.solution(my_string2);
        System.out.println(result2); // 16
    }
}





public class _34_숨어있는숫자의덧셈 {
}
