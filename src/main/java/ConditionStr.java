//조건 문자열

public class ConditionStr {
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals("<")&&eq.equals("=")) {
            if(n<=m){
                return 1;
            }
        }

        if(ineq.equals(">")&&eq.equals("=")) {
            if(n>=m){
                return 1;
            }
        }

        if(ineq.equals("<")&&eq.equals("!")) {
            if(n<m){
                return 1;
            }
        }

        if(ineq.equals(">")&&eq.equals("!")) {
            if(n>m){
                return 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        ConditionStr cs = new ConditionStr();
        System.out.println(cs.solution(">", "!", 41, 78));
    }
}
