class Solution6 {
    public int solution(int age) {
        int standardYear = 2022;
        return standardYear - age + 1;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        int result1 = s.solution(40);
        System.out.println(result1);
        int result2 = s.solution(23);
        System.out.println(result2);
    }
}
public class _07_나이출력 {
}
