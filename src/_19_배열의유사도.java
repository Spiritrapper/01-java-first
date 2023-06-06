class Solution19 {
    public int solution(String[] s1, String[] s2) {
        int count = 0; // 일치하는 문자열 개수를 저장할 변수 count를 초기화합니다.

        for (String str1 : s1) { // s1 배열의 각 문자열에 대해서 반복합니다.
            for (String str2 : s2) { // s2 배열의 각 문자열에 대해서 반복합니다.
                if (str1.equals(str2)) { // str1과 str2의 값이 일치하는지 비교합니다.
                    count++; // 일치하는 경우 count를 증가시킵니다.
                }
            }
        }

        return count; // 일치하는 문자열 개수를 반환합니다.
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19(); // Solution19 클래스의 인스턴스 s를 생성합니다.
        String[] s1 = {"a", "b", "c"}; // 문자열 배열 s1을 초기화합니다.
        String[] s2 = {"com", "b", "d", "p", "c"}; // 문자열 배열 s2를 초기화합니다.
        int result1 = s.solution(s1, s2); // solution 메소드를 호출하여 일치하는 문자열 개수를 계산합니다.

        System.out.println("Matched count: " + result1); // 일치하는 문자열 개수를 출력합니다.
    }
}



public class _19_배열의유사도 {
}
