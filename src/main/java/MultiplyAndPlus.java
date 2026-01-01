//원소들의 곱과 합
public class MultiplyAndPlus {

    static int solution(int[] num_list) {

        int multiplier = 1;
        int plus = 0;

        for(int i=0; i<num_list.length; i++) {
            plus += num_list[i];
        }
         plus *= plus;


        for(int i=0; i<num_list.length; i++) {
            multiplier *= num_list[i];
        }


        if(multiplier < plus){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
    }
}
