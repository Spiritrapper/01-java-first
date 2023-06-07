
class Solution25 {
    public int solution(int price) {
        int payprice = 0;
        if(100000< payprice || payprice <300000 ){
            return payprice * 0.95;
        }else if (300000< payprice || payprice <500000 ){
            return payprice * 0.90;
        }else if (500000< payprice  ) {
            return payprice * 0.80;
        }else
            return payprice;

    }

    public static void main(String[] args) {
        Solution25 s = new Solution25();
        int price1 = 150000;
        int result1 = s.solution(price1);
    }
}



public class _25_옷가게할인받기 {
}
