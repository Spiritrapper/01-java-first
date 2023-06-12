class Solution41 {
    public int solution(int[] box, int n) {
        int horison = box[0];
        int vertical = box[1];
        int height = box[2];
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
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
