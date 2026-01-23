//flag에 따라 다른 값 반환하기
public class FlagPlusOrMinus {

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag){
            answer= a+b;
        }else{
            answer = a-b;
        }
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        solution(-4,7,true);
    }
}
