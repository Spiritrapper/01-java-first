class Solution {
    public int solution(int age) {
        int standardYears = 2022;
        int age = 40;
        return 2022 - age +1;
    }
    public static void main (String[] args){
        Solution s = new Solution();
        int result1 =s.solution(40);
        System.out.print(result1);
        int result2 =s.solution(23);
        System.out.print(result2);
    }
}
public class _07_나이출력 {
}
