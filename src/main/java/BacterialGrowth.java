//세균 증식
public class BacterialGrowth {
    static int solution(int n, int t) {

        for(int i =1; i<=t; i++){
            n*=2;

        }
        return n;

    }

    public static void main(String[] args) {
       System.out.println( solution(7,15));
    }
}
