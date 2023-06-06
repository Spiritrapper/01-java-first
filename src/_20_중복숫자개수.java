class Solution20 {
    public int solution(int[] array) {
        int count = 0;  // 일치하는 요소 개수를 저장하기 위한 count 변수 초기화

        for (int i = 0; i < array.length; i++) {  // 배열의 요소를 하나씩 확인하기 위한 반복문
            for (int j = 0; j < array.length; j++) {  // 다른 요소들과 비교하기 위한 반복문
                // 비교할 요소가 없으므로 비어 있는 반복문
            }

            if (int[i] == int[j])  // 배열 요소를 비교하여 일치하는지 확인
            count++;  // 일치하는 경우 count 변수 증가
        }

        return count;  // 일치하는 요소 개수 반환
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();  // Solution20 클래스의 인스턴스 생성

        int[] array1 = {1, 1, 3, 3, 13};  // 주어진 입력 배열 초기화
        int result1 = s.solution(int[] array1);  // solution 메소드 호출하여 일치하는 요소 개수 계산

        // 결과 출력
        System.out.println("Count: " + result1);
    }
}


public class _20_중복숫자개수 {
}
