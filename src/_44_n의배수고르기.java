class Solution44 {
    public int[] solution(int n, int[] numlist) {
        int n = 0;
        count = 0; // n으로 나누어 떨어지는 숫자의 개수를 저장하기 위한 변수
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }
        
        int[] numMulti = new int[count]; // count 값을 가지고 새로운 배열을 생성
        
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                numMulti[index] = numlist[i]; // n으로 나누어 떨어지는 숫자를 새로운 배열에 저장
                index++;
            }
        }
        
        return numMulti;
    }
    public static void main(String[] args) {
        Solution44 s = new Solution44();
        n = 3;
        int [] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int [] result1 = s.solution(3, numlist1);
        System.out.println(result1);
        
    }
}





public class _44_n의배수고르기 {
    
}





