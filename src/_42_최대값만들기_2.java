class Solution42 {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE; // 최솟값으로 초기화
        
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    continue;
                }
                int product = numbers[i] * numbers[k];
                if( product > max){
                    max = product;
                }

            }
               
        }
        
        return max;
    }
    public static void main(String[] args) {
    Solution42 s = new Solution42();
    
    int[] numbers1 = {1, 2, -3, 4, -5};
    int result1 = s.solution(numbers1);
    System.out.println(result1); // 출력: 15
    
    int[] numbers2 = {0, -31, 24, 10, 1, 9};
    int result2 = s.solution(numbers2);
    System.out.println(result2); // 출력: 240
    
    int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
    int result3 = s.solution(numbers3);
    System.out.println(result3); // 출력: 600
}
}








public class _42_최대값만들기_2 {
    
}
