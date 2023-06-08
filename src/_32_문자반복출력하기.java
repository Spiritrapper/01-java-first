import java.lang.String;
class Solution32 {
    public String solution(String myString, int n) {
        StringBuilder result = new StringBuilder();
        // 빈 StringBuilder 객체 생성

        for (int i = 0; i < myString.length(); i++) {
            // 문자열 길이만큼 반복
          for (int j = 0; j < n; j++) {
                // n번 반복
                result.append(myString.charAt(i));
                // 문자를 StringBuilder에 추가
           }
        }
        return result.toString();
        // StringBuilder를 문자열로 변환하여 반환
    }

    public static void main(String[] args) {
        Solution32 s = new Solution32();
        // Solution32 객체 생성

        String myString = "hello";
        int n = 3;
        // 입력 값 설정

        String result = s.solution(myString, n);
        // solution 메서드 호출하여 결과 값 저장

        System.out.println(result);
        // 결과 값 출력
    }
}














public interface _32_문자반복출력하기 {
}
