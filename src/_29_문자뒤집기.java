class Solution29 {
    public String solution(String my_string) {
        char[] characters = my_string.toCharArray();
        // 문자열을 문자 배열로 변환합니다.

        int left = 0;
        int right = characters.length - 1;
        // 두 개의 포인터(left와 right)를 사용하여 배열의 양쪽 끝에서부터 문자를 교환하기 위해 변수를 초기화합니다.

        while (left < right) {
            // left가 right보다 작은 동안 반복합니다.

            char temp = characters[left];
            // 현재 left 위치의 문자를 임시 변수 temp에 저장합니다.

            characters[left] = characters[right];
            // left 위치에 right 위치의 문자를 대입합니다.

            characters[right] = temp;
            // right 위치에 임시 변수 temp에 저장된 문자를 대입합니다.

            left++;
            right--;
            // left는 오른쪽으로, right는 왼쪽으로 이동하여 다음 문자를 처리합니다.
        }

        return new String(characters);
        // 뒤집힌 문자 배열을 다시 문자열로 변환하여 반환합니다.
    }

    public static void main(String[] args) {
        Solution29 s = new Solution29();

        // Example test cases
        String my_string1 = "jaron";
        String result1 = s.solution(my_string1);
        System.out.println(result1); // "noraj"이 예상되는 출력 결과를 확인합니다.

        String my_string2 = "bread";
        String result2 = s.solution(my_string2);
        System.out.println(result2); // "daerb"가 예상되는 출력 결과를 확인합니다.
    }
}













public class _29_문자뒤집기 {
}
