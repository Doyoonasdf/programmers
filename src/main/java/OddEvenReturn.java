//홀짝에 따라 다른 값 반환하기
public class OddEvenReturn {
    public int solution(int n) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        int k = 1;

        if(n%2==0){
            while(2*k<=n){
                evenSum += (2*k)*(2*k);
                k++;
            }
        }else{
            while(2*k-1<=n){
                oddSum += 2*k-1;
                k++;
            }
        }

        answer = n%2 == 0 ? evenSum : oddSum;

        return answer;
    }


    public static void main(String[] args) {
        OddEvenReturn solution = new OddEvenReturn();
        System.out.println(solution.solution(10));
    }
}

