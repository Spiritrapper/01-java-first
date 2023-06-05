class Solution14 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // 결과를 저장할 배열 생성

        // 각 원소의 길이를 구하여 answer 배열에 저장
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer; // 결과 배열 반환
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();
        String[] strlist1 = {"We", "are", "the", "world!"};

        int[] result = s.solution(strlist1);

        // 결과 출력
        for (int length : result) {
            System.out.print(length + " ");
        }
    }
}


public class _14_배열원소의길이 {
}
