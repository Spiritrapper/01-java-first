class Solution16 {
    public int[] solution(int money) {

        int americanoPrice = 5500;
        int americanoDrinking = money / americanoPrice;
        int restMoney = money / americanoPrice;
        int[] result = {americanoDrinking, restMoney};
        return result;
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();
        int money1 = 15000;
        int[] result1 = s.solution(money1);
        System.out.println(money1 + result1[0] + result1[1]);


    }
}





public class _16_아이스아메리카노 {
}
