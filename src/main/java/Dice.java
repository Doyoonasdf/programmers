// 주사위 게임2
public class Dice {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a!=b && b!=c && c!=a){
            answer = a+b+c;
        }else if(a==b && b==c && c==a){
            answer = (a+b+c)*(a*a +b*b +c*c)*(a*a*a +b*b*b+c*c*c);
        }else if(a==b || b==c || c==a){
            answer = (a+b+c)*(a*a +b*b +c*c);
        }
        System.out.println("answer : " + answer);

        return answer;
    }


    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.solution(4,4,4);
    }

}
