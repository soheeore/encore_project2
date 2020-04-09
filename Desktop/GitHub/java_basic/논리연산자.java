/*논리연산자
논리 연산자
논리연산자는 논리곱(&&,&) 논리합(||,|), 배타적 논리합 () 논리부정(!) 연산을 수행한다. 논리 연산자의 피연산자는 블린 타입만 사용할 수 있다. 결과는 불린값이다.
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
논리곱 (&&, &) - 피연산자가 모두 true일 경우에만 연산 결과가 true 이다.

System.out.println(b1 && b2); -> b2가 false 이므로 결과는 false
System.out.println(b1 && b3); -> b1과 b2 모두 true 이므로 결과는 true
논리합 (||,|) - 피연산자 중 하나만 true이면 연산 결과는 true 이다.

System.out.println(b1 || b2); -> b1 이 true이므로 결과는 true 이다.
배타적 논리합 () -> 피연산자가 서로 다른 값일 경우만 연산 결과가 true 이다.

System.out.println(b1 ^ b2); -> b1은 true, b2는 false로 서로 다르므로 결과는 true 이다.
System.out.println(b1 ^ b3); -> b1, b3 모두 true로 서로 같다. 결과는false 이다
논리 부정 (!) -> 피연산자의 논리값을 바꾼다. true는 false로 false는 true로 바꾼다.

System.out.println(!b1); -> b1 이 true 이므로 결과는 false 이다.
System.out.println(!b2); -> b1 이 false 이므로 결과는 true 이다.
*/
package javastudy;
public class OperatorExams{
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=true;
        boolean b3=false;
        System.out.println(b1 && b2);
        System.out.println(b1 || b3);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);

        int score = 88;
        if (score<=100 && score>=70); {
            System.out.print("성공");
        }else{
            System.out.print("실패");
        }
        System.out.print(b1^b3);
        System.out.print(b1^b2);
        System.out.print(!b1);
    }
}

