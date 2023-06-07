class Solution22 {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        for (int i = 0; i < n / 2; i++) {  // 배열의 반절까지만 반복
            int temp = num_list[i];  // 현재 위치의 값을 임시 변수에 저장
            num_list[i] = num_list[n - i - 1];  // 대칭 위치의 값을 현재 위치로 이동
            num_list[n - i - 1] = temp;  // 임시 변수의 값을 대칭 위치로 이동
        }

        return num_list;  // 뒤집힌 배열을 반환
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] result1 = s.solution(num_list1);
        for (int num : result1) {  // 뒤집힌 배열의 원소를 하나씩 출력
            System.out.print(num + " ");
        }
    }
}

public class _22_문자열뒤집기 {
}
