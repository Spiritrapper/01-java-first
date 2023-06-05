
// 솔루션을 위한 클래스
class Solution14 {
    // 문자열 배열(strlist)을 매개변수로 받아서 int 배열을 반환하는 solution 메소드 정의
    public int[] solution(String[] strlist) {
        // 결과를 저장할 int 배열(answer) 생성. 배열의 길이는 strlist 배열의 길이와 동일하다.
        int[] answer = new int[strlist.length];  // [] 내에는 배열의 길이 위치정보 1, 2, 3, 이런식으로만 나타낸다.

        // 각 원소의 길이를 구하여 answer 배열에 저장
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();    // 각원소의 길이 , 예를 들으면 strlist[1] 은 3이라는 원소값를갖는다.
        }

        // 결과 배열 반환
        return answer;
    }

    // main 메소드에서 solution 메소드를 호출하여 결과를 출력
    public static void main(String[] args) {
        // Solution 클래스의 객체 생성
        Solution14 s = new Solution14();

        // 문자열 배열(strlist1) 선언 및 초기화
        String[] strlist1 = {"We", "are", "the", "world!"};

        // solution 메소드를 호출하여 결과를 result 배열에 저장
        int[] result = s.solution(strlist1);

        // 결과 출력
        for (int length : result) {
            System.out.print(length + " ");
        }
    }
}

public class _14_배열원소의길이 {
}
class Solution9 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();

        }
        return answer;

    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        String[] strlist1 = {"We", "are", "the", "world!"};
        int[] result = s.solution(strlist1);
        for (int length : result) {
            System.out.print(length + " ");

        }
    }
}