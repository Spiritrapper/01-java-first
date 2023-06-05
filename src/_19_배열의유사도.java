class Solution19 {
    public int solution(String[] s1, String[] s2) {

        int count = 0;
        for (int i = 0; i < s1.length; i++)
            for (int j = 0; j < s2.length; j++) {

            if(s1==s2)
                count += 1;
            else
                count = 0;
        }

        return count ;


    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();
        String[] s1	= {"a", "b", "c" };
        String[] s2	= {"com", "b", "d", "p", "c"};
        int result1 = s.solution(count);



    }
}



public class _19_배열의유사도 {
}
