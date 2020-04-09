/*if문
if 조건문
조건식의 연산 결과에 따라 블록 내부 문장의 실행 여부를 결정 할 수 있다.
if 문
조건식이 true 일 경우에만 실행문이 실행된다.
if(조건식) 다음의 { } 를 생략할 수 있다. 하지만, 생략할 경우 if문에 포함되는 실행문은 단 한 줄만 포함된다.
        if(조건식){
            실행문;
            실행문;
        }
if - else 문
조건식이 true일 경우 if 블록의 실행문이 실행되고, flase 일 경우 else 블록의 실행문이 실행된다.
        if(조건식){
            실행문;
            실행문;
        }else{
            실행문;
        }
if - else if - else문
처음 if문의 조건식의 조건문이 true일 경우 처음 if문의 블록이 실행되고, false일 경우 다음 조건식의 결과에 따라 실행 블록이 달라진다.
else if 문의 수는 제한이 없다. 그러나 너무 많은 else if 문은 실행 속도를 느리게 한다.
마지막 else 블록은 생략되도 상관없다.
        if(조건식){
            실행문;
            실행문;
        }else if(조건식){
            실행문;
        }else{
            실행문;
        }
*/

package javastudy;
public class IfExam{
    public static void main(String[] args) {
        int x =50;
        int y =60;
        if (x<y) {
            System.out.println("x는 y보다 작습니다.");
        }
        // if 조건문 {명령문}과 아래형태 같음
        // if 조건문
        //      명령문
        if (x<y)
            System.out.println("x는 y보다 작습니다.");
    /////// else 구문 ///////
         if (x<y) {
            System.out.println("x는 y보다 작습니다.");
         }else{
             System.out.println("x는 y보다 크거나 같습니다.");
         }

    }
}

