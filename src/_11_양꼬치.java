//#include <stdio.h>
//        #include <stdbool.h>
//        #include <stdlib.h>
class Solution11 {
    public int solution(int n, int k) {
        int yakitoriCost = n * 12000; // 양꼬치 가격
        int drinkCost = k * 2000; // 음료수 가격

        // 10인분 이상인 경우 음료수 서비스 적용
        if (n >= 10) {
            int freeDrinks = n / 10; // 서비스로 제공되는 음료수 개수
            drinkCost -= freeDrinks * 2000; // 서비스 음료수 가격 차감
        }

        int totalCost = yakitoriCost + drinkCost; // 총 결제 금액
        return totalCost;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int n = 10;
        int k = 3;
        int result1 = s.solution(n, k);
        System.out.println(result1);
    }
}






public class _11_양꼬치 {
}
