import javax.sound.midi.Soundbank;

public class ResultComparison {
    public int solution(int a, int b) {
        int answer = 0;

        int sum1=Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int sum2= a * b* 2;

        answer = sum1> sum2 ? sum1 :sum2;
        return answer;
    }

    public static void main(String[] args) {
        ResultComparison resultComparison = new ResultComparison();
        System.out.println(resultComparison.solution(2,91));
    }
}
