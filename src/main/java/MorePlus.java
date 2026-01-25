//더 크게 합치기
public class MorePlus {
        public int solution(int a, int b) {
            int answer = 0;

            int sum1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
            int sum2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));

            answer = Math.max(sum1, sum2);

            return answer;
        }


    public static void main(String[] args) {
        MorePlus m = new MorePlus();
        System.out.println(m.solution(31, 4));
    }
}
