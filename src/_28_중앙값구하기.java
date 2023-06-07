import java.util.Arrays;


class Solution28 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/ 2];

    }return answer;

    public static void main(String[] args) {
        Solution28 s = new Solution28();
        int [] array1 = {1, 2, 7, 10, 11};
        int result =  s.solution(array1);
        System.out.println(array1[array1.length/ 2]);


    }


}






public class _28_중앙값구하기 {
}
