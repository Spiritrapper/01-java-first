
class Solution29 {
    public String solution(String my_string) {
        char[] characters = my_string.toCharArray();
        int n = characters.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[n - i - 1];
            characters[n - i - 1] = temp;
        }
        return new String(characters);
    }

    public static void main(String[] args) {
        Solution29 s = new Solution29();
        String my_string1 = "afjkdajfklaufkdlafuij";
        String result1 = s.solution(my_string1);
        System.out.println(result1);
    }
}













public class _29_문자뒤집기 {
}
