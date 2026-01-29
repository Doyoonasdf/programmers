import java.util.Arrays;

//배열의 길이에 따라 다른 연산하기
/*
* 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
* arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
*  */
public class ArrayLengthBasedOperation {

    static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr.length % 2 ==0 ) { //짝수면
                if(i % 2 ==0){ // 짝수 인덱스면 걍 짝수 인덱스 값을 그대로
                    answer[i] = arr[i];
                }else if(i % 2 !=0){ // 홀수인덱스일때는 n을 더하고 /
                    answer[i] = arr[i]+n;
                }
            }

            if (arr.length % 2 !=0 ) { //홀수면
                if(i % 2 ==0){ // 짝수 인덱스면  n을 더하고
                    answer[i] = arr[i]+n;
                }else if(i % 2 !=0){ // 홀수인덱스일때는 걍 홀수 인덱스 값을 그대로/
                    answer[i] = arr[i];
                }
            }

        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33},27)));

    }

}
