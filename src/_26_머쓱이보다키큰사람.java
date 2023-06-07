import java.util.Arrays;

class Solution26 {
    public int solution(int[] array, int height) {
        Arrays.sort(array); // 배열을 오름차순으로 정렬

        int count = 0; // 현재 연속 개수를 저장하는 변수
        int maxCount = 0; // 최대 연속 개수를 저장하는 변수

        for (int i = 0; i < array.length; i++) {
            if (array[i] < height) {
                count += 1; // 특정 높이보다 작은 원소를 만나면 count를 1 증가
                maxCount = Math.max(maxCount, count); // 최대 연속 개수 업데이트
            } else {
                count = 0; // 특정 높이보다 크거나 같은 원소를 만나면 count를 0으로 초기화
            }
        }

        return maxCount; // 최대 연속 개수 반환
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
