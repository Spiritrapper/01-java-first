class Solution39 {  // 가위바위보 숫자된 문자열의 대응 위치 : for문을 통해 각문자를 확인 그에 대응하는 숫자를 result에 추가
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();  // 결과 문자열을 저장하기 위한 StringBuilder 객체

        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);  // 문자열 rsp에서 i 해당위치에 문자를 반환하는 메서드

            if (c == '2') {
                result.append('0');  // 가위(2)는 바위(0)를 이김
            } else if (c == '0') {
                result.append('5');  // 바위(0)는 보(5)를 이김
            } else if (c == '5') {
                result.append('2');  // 보(5)는 가위(2)를 이김
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution39 solution = new Solution39();

        String rsp1 = "2";
        String result1 = solution.solution(rsp1);
        System.out.println(result1);  // "0"

        String rsp2 = "205";
        String result2 = solution.solution(rsp2);
        System.out.println(result2);  // "052"
    }
}