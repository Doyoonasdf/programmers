//문자열 곱하기

public class StrMultiply {
    class Solution {
        public String solution(String my_string, int k) {
            String answer = "";
            int i = 0;
            for(i=1; i <= k; i++){
                answer += my_string;
            }

            return answer;

        }
    }
}
