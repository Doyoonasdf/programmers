import java.util.Arrays;

//배열 만들기1
/*
* 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
*
* */
public class MakeArray1 {
    static int[] solution(int n, int k) {
//        int[] answer = new int[10];
//                    //n=10
//        for(int i=0; i<n; i++){
//        // k -> k+k -> k+k+k
//            answer[i] = k*i;
//        }
//
//        return answer;


        int[] answer = new int[n/k];

        for(int i=1; i<=answer.length; i++){
            // k -> k+k -> k+k+k
            answer[i-1] = k*i;
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,3)));
    }
}
