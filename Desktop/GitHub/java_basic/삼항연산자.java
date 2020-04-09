/*
삼항연산자
삼항 연산자
조건식 ? 피연산자1 : 피연산자2

조건식의 연산결과가 true 이면, 결과는 피연산자 1이고, 조건식의 연산결과가 false 이면 결과는 피연산자2
        int b1 = (5>4) ? 50 : 40;
        //조건식이 true이므로 b1은 50이 된다. 
피연산자1, 피연산자2 에는 주로 값이 오지만, 경우에 따라 연산식이 올 수 있다.
삼항 연산자가 익숙하지 않다면, if문으로 바꾸어 이용해도 좋다.
            int b2 = 0;
            if(5 > 4){
                b2 = 50;
            }else{
                b2 = 40;
            }
*/
package javastudy;
public class OperatorExam6 {
    public static void main (String[] args){
        int b1=(5>4) ? 50 : 40;
        //(5>4)가 참이라면  50을 b1에 넣고 거짓이면 40을 넣음
        System.out.println(b1);
        //아래와 같음
        int b2=0;
        if (5<4) {
            b2=50;
        }else{
            b2=40;
        }
        System.out.println(b2);
    }
}
