import java.util.Arrays;

class Solution26 {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < height) {
                count += 1;
            } else {
                break;
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();
        int[] array1 = {149, 180, 192, 170};
        int result1 = s.solution(array1, 167);
        System.out.println(result1);
    }
}





public class _26_머쓱이보다키큰사람 {
}
