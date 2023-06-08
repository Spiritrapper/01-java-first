class Solution34 {

    public int solution(String my_string) {
        int sum = 0;  // 숫자의 합을 저장할 변수
        StringBuilder numStr = new StringBuilder();  // 숫자를 임시로 저장할 StringBuilder 객체

        for (char c : my_string.toCharArray()) {  // 문자열을 한 글자씩 순회
            if (Character.isDigit(c)) {  // 현재 문자가 숫자인지 확인
                numStr.append(c);  // 숫자인 경우 numStr에 추가
            } else {
                if (numStr.length() > 0) {  // 숫자가 저장된 경우
                    sum += Integer.parseInt(numStr.toString());  // numStr에 저장된 숫자를 합산
                    numStr.setLength(0);  // numStr 초기화
                }
            }
        }

        if (numStr.length() > 0) {  // 숫자가 남아있는 경우
            sum += Integer.parseInt(numStr.toString());  // numStr에 저장된 숫자를 합산
        }

        return sum;  // 결과 합 반환
    }

    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        String my_string1 = "aAb1B2cC34oOp";
        int result1 = solution.solution(my_string1);
        System.out.println(result1); // 10

        String my_string2 = "1a2b3c4d123";
        int result2 = solution.solution(my_string2);
        System.out.println(result2); // 16
    }
}






public class _34_숨어있는숫자의덧셈 {
}
