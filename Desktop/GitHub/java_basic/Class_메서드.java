///////////////// 메소드 /////////////////
/*
필드가 물체의 상태라면, 물체의 행동에 해당하는게 메소드다. car에 이름과 번호가 있기도 하지만, car는 앞으로 전진할수도 있고 후진하는 행동도 할 수 있다.
메소드는 입력값이 있고, 그 입력값을 받아서 무언가 한 다음 결과를 도출해 내는 수학의 함수와 비슷한 개념이다.
이때 입력값을 매개변수라고 하고,결과값을 리턴값이라고 합니다.
인자( Argument ) 는 어떤 함수를 호출시에 전달되는 값을 의미한다.
매개 변수( Parameter ) 는 그 전달된 인자를 받아들이는 변수를 의미한다.
메소드란 클래스가 가지고 있는 기능이다. 클래스 안에 선언됩니다.
*/


// 다양한 형태의 메서드
// 1. 들어오는 매개변수 X, 돌려줄 값 X
package javastudy;
public class MyClass{
    public void method1() {
        //void : 정해진 리턴 타입 없음
        //메서드(매개변수) : 매개변수 없으니 괄호 안은 비워두기
        System.out.println("m1이 실행됨...!");
    }
    
// 2. 정수를 받아들이고, 돌려줄 값 X
    public void method2(int x) {
        //int : 리턴 안 하니까 리턴 타입 void
        //메서드(매개변수) : int 형 변수 받음
        System.out.println(x+"를 이용한 m2이 실행됨");    
    }
// 3. 안 받고, int형 돌려줌
    public int method3() {
        //int : 리턴 타입 int
        //메서드(매개변수) : 매개변수 없으니 괄호 안은 비워두기
        System.out.println("m3");    
        return 10; 
    }

// 4. 정수 2개 받고, 안 돌려줌
    public void method4(int x,y) {
        //int : 리턴 타입 void
        //메서드(매개변수) : 매개변수 int 타입
        System.out.println(x+y+"method4의 합");    
    }

// 5. int 값 받고, int 값 돌려줌 
    public int method5(int x) {
        //int : 리턴 타입 int
        //메서드(매개변수) : int 형 변수 받음
        System.out.println(x+"를 이용한 m5이 실행됨");    
        return x*2;
    }


}
/////////////// 메서드 활용 ///////////////
package javastudy;
public class MyClassExam{
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();  //m1이 실행됨...!
        myclass.method2(15);

        int value = myclass.method3(32);
        //myclass.method3(32)이 리턴한 값을 value에 넣어줌
        System.out.println("m3이 리턴한 값 :"+ value);

        myclass.method4(2,19);
        int value2=myclass.method5(2);
        System.out.println("m5이 리턴한 값 :"+ value)2;
    
    }
}

/////////////// String 메서드 ///////////////
package javastudy;
public class StringMethodExam {
    public static void main (String[] args) {
        //String str = new String("hello");   //보통은 이렇게 쓰는데 String은 자주 쓰니까
        String str="hello";
        System.out.println(str.length());   //길이를 구해주는 메서드 
        System.out.println(str.concat(", world"));   // 문자열끼리 결합시키는 메서드
        //("hello, world")를 새로운 객체로 만들어서 concat한 문자열이 출력됨. 그러나 str는 여전히 "hello"
        
        //str을 "hello, world"로 만들고 싶다면 
        str=System.out.println(str.concat(", world"));
        System.out.println(str);

        System.out.println(str.substring(3,6));   //3~6번 인덱스까지 슬라이싱 메서드
        System.out.println(str.substring(3));     //3번부터 끝까지 슬라이싱
    
    }
}