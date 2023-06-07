class Solution32 {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();
        char[] character = my_string.toCharArray();
        for (int i = 0; i < n; i++) {
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution32 s = new Solution32();
        String myString = "hello";
        int n = 3;
        String result = s.solution(myString, n);
        System.out.println(result);
    }
}















public interface _32_문자반복출력하기 {
}
