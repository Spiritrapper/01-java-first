class Solution39 {  // 가위바위보 숫자된 문자열의 대응 위치 : for문을 통해 각문자를 확인 그에 대응하는 숫자를 result에 추가
    public String solution(String rsp) {
        String result = "";
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if (c == '2') {
                result += '0';
            } else if (c == '0') {
                result += '5';
            } else if (c == '5') {
                result += '2';
            }
        }
        return result;
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