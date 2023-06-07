class Solution22 {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            for (int j = 0; j < num_list.length; j++) {
                num_list[i] = num_list[num_list.length-j];

            }
        }int[] answer = num_list[num_list.length-j];

        return answer;
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();
        int num_list1 = {1, 2, 3, 4, 5 } ;
    }
}




public class _22_문자열뒤집기 {
}
