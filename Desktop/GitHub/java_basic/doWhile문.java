/*
do while문
do-while문
while문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.
하지만, do while문의 경우는 무조건 한번은 실행되는 반복문이다.
    do{
        실행문;
    }while(조건문);
do-while 실습
    import java.util.Scanner;

    public class DoWhileExam {

        public static void main(String[] args) {
            int value = 0;

            // Scanner는 java.util 패키지에 있는 클래스로써
             키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
            Scanner scan = new Scanner(System.in);
            //위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다. 

            do{
                value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
                System.out.println("입력받은 수 : " + value);  
            }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

            System.out.println("반복문 종료");
        }
    }
*/


package javastudy;
import java.util.Scanner;
public class DowhileExam{
    public static void main(String[] args){
        
        int value=0;
        Scanner scan = new Scanner(System.in);  //키보드로 입력받는 값
                                                //Scanner를 scan으로 받기
        do{
            value=scan.nextInt();
            System.out.println("입력받은 값 :"+value);
        }                     //while조건에 안 맞아도 한번은 실행할 문장을 do{}안에 적음
        while(value!=10);    //while 조건문이 만족하면 do 명령문 실행
        System.out.println("반복문 종료!");     //while 조건에 안 맞으면 반복문 종료하고 나와서 수행할 값

    }