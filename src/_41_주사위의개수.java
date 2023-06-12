class Solution41 {
    public int solution(int[] box, int n) {
        int[] boxx = {horison,vertical,height};
        int answer = h/n * v/n * height/n;
        return answer;
    }
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        int[]box1={10, 8, 6};
        int n = 3;
        int result = s.solution(box1, 3);
        System.out.println(result);

    }
}






public class _41_주사위의개수 {
    
}
