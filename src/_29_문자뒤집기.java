
class Solution29 {
    public String solution(String my_string) {
        String [] words = my_string.split("");
        int n = words.length;
        for (int i = 0; i < n/ 2; i++) {  // 배열의 반절까지만 반복
            String temp = words[i];  // 현재 위치의 값을 임시 변수에 저장
            words[i] = words[n - i - 1];  // 대칭 위치의 값을 현재 위치로 이동
            words[n - i - 1] = temp;

        }return words.toString();
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
