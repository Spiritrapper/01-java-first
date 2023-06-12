import javax.swing.Spring;

class Solution40 {
    public String solution(String cipher, int code) {
        char[] words = cipher.toCharArray();
        String answer = "";
        for (int i = code -1 ; i < words.length; i += code) {
            answer += words[i];   
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution40 s = new Solution40();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String result = s.solution(cipher, code); 
        System.out.println(result); // 출력: attack
}

}











public class _40_password {
    
}
