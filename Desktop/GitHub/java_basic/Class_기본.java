////////////////////// 클래스 선언 //////////////////////
/*
클래스
자바는 객체를 만들기 위해 반드시 클래스를 먼저 만들어야 한다. 클래스는 객체를 만들기 위한 일종의 틀이다.
붕어빵이 객체라면, 붕어빵 틀은 클래스
자동차 클래스 생성
    public class Car{

    }
Car.java란 파일을 만든다.
저장을 하면 이클립스는 컴파일하여 디스크에 Car라는 클래스를 생성한다.
자동차 클래스가 생성되었다고 해서 자동차가 만들어 진것은 아니다.
Car객체 생성하기 (자동차 만들기)
    public class CarExam{
        public static void main(String args[]){
            Car c1 = new Car();
            Car c2 = new Car();
        }
    }
new 연산자는 new연산자 뒤에 나오는 생성자를 이용하여 메모리에 객체를 만들라는 명령.
메모리에 만들어진 객체를 인스턴스(instance)라고도 한다.
이렇게 만들어진 객체를 참조하는 변수가 c1 , c2 이다.
위의 코드가 실행되면 Car라는 객체가 2개가 만들어지고 각각의 객체를 참조하는 c1과 c2변수가 선언됩니다.
*/

package javastudy;

public class car {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
    }
}


////////////////////// 참조타입 //////////////////////

/*
참조형 타입은 기본형 타입을 제외한 모든 타입입니다. 앞서 배웠던, 배열도 참조형이고, 클래스도 모두 참조 타입이다
1. 참조형 변수
- String str = new String(hello);
    -str 변수 앞에 기본형 타입이 아닌 String클래스가 적혀있다.
    -이퀄(=)뒤에는 new 다음에 생성자라는 것이 있다.
    -new 라는 키워드는 객체를 메모리에 올려준다. 이렇게 메모리에 올라간 객체를 인스턴스라고 말한다.
2. 메모리에 올라간 인스턴스를 가리키는 변수, 참조하는 변수, 레퍼런스 하는 변수가 str 이다. 참조한다. 레퍼런스 한다라는 것은 변수가 인스턴스를 가지고 있는게 아니라 말그대로 가리킨다는 의미이다.
3. str이라는 변수에는 메모리의 위치 값이 저장되는 것이다. 메모리의 위치값이 저장된다고 하더라도, 어떤 메모리에 저장되는지 그 정보를 알 수 있는 방법은 없다. 그렇기 때문에 str변수는 String 인스턴스를 참조한다라고만 아시면 된다.
4. 앞으로 배울 클래스들은 모두 참조형이다
*/
package javastudy;

public class ReferenceDataType {
    public static void main(String[] args) {
        int i = 4;
        String str = new String("hello");
        //str은 참조변수 : 'hello'라는 값을 가지고 있는게 아니라 참조.
        //'hello'가 있는 위치를 갖고 있지만, 그 위치에 'hello'가 있다는 건 모름

    }
}

////////////////////// String 클래스 //////////////////////
/*

문자열을 표현하는 자바에서 가장 많이 사용하는 클래스
자바 인스턴스 생성 방법
1. new연산자를 이용하지 않고 인스턴스를 만드는 경우
    String str1 = "hello";
    String str2 = "hello";
hello라는 문자열이 메모리 중에서 상수가 저장되는 영역에 저장된다. 상수는 변하지 않는 값을 의미.
String str2 = hello; 이 문장이 실행될 때에 hello 라는 문자열 상수는 이미 만들어져 있으므로 str1이 참조하는 인스턴스를 str2도 참조한다.

2. new연산자를 이용해서 인스턴스를 만드는 경우

    String str3 = new String("hello");
    String str4 = new String("hello");
new연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다.
String str4 = new String(hello); 이 문장이 실행될때도 새롭게 만들게 되므로, str3 과 str4는 서로 다른 인스턴스를 참조한다.
    if(str1 == str2){  // 같은 인스턴스를 참조하므로 결과는 true 
        System.out.println("str1과 str2는 같은 레퍼런스입니다.");
    }

    if(str1 == str3){  // str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false 
        System.out.println("str1과 str3는 같은 레퍼런스입니다.");
    }

    if(str3 == str4){  // str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false 
        System.out.println("str3과 str4는 같은 레퍼런스입니다.");
    }
참조변수끼리 == 로 비교하면 서로 같은 것을 참조하는지 비교한다.

String은 다른 클래스와 다르게 new를 사용하지 않고 사용할 수 있다. 메모리를 아끼려면 String은 new를 사용하지 않고 사용하는 것이 좋다.
String은 불변 클래스이다. 불변이란 String이 인스턴스가 될때 가지고 있던 값을 나중에 수정할 수 없다.
String은 문자열과 관련된 다양한 메소드를 가지고 있다. 메소드를 호출한다 하더라도 String은 내부의 값이 변하지 않는다.
String이 가지고 있는 메소드중 String을 반환하는 메소드는 모두 새로운 String을 생성해서 반환한다.
    String str5 = "hello world";
    String str6 = str5.substring(3);
substring은 문자열을 자른 결과를 반환하는 메소드이다. 해당 코드가 실행되어도 str5는 변하지 않는다.
str6은 str5가 가지고 있는 문자열 중 3번째 위치부터 자른 결과 즉 새로운 String을 참조하게 된다.
*/


package javastudy;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";    
        //str1,2는 상수형태로 저장됨. 
        //상수영역에 저장한 str1,2 둘 다 'hello'라는 문자열 가리킬 때는 str2의 경우 새롭게 hello만들지 않고 기존에 있는 hello를 참조.


        String str3 = new String("hello");
        String str4 = new String("hello");
        //반면, 상수영역에 저장하지 않은 str3,str4는 레퍼런스 다름.

        if(str1==str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.")
        
        if(str1==str3)
            System.out.println("str1과 str3은 같은 레퍼런스입니다.")

        if(str4==str3)
            System.out.println("str1과 str3은 같은 레퍼런스입니다.")

            
        System.out.println(str1);
        System.out.println(str1.substring(3));  //substring : 3번 인덱스 부터 잘라서 보여줌
                                                //str1에 substring했지만 string이 갖고 있는 내부의 값이 변하지 않아
    }
}


////////////////////// 필드(field)선언 //////////////////////

/*
자동차는 자동차 이름, 자동차 번호를 가지고 있고, 자동차는 달리고 멈추는 기능이 있다. 여기에서 가지고 있는 것을 속성이라고 한다. 자바에서는 이러한 속성을 필드(Field)라는 용어로 사용한다.
이름과 번호를 필드로 가지고 있는 Car클래스 선언
    public class Car{
        String name;    
        int number;
    }
Car 클래스를 인스턴스화 하기
    Car c1 = new Car();
    Car c2 = new Car();
    //Car라는 인스턴스가 메모리에 2개 만들어 진다. 객체별로 name과 number라는 속성을 가진다.
속성 이용하기
참조 변수 다음에 나오는 점(dot)은 참조변수가 참조하는 객체가 가지고 있는 것을 사용할 때 사용
    //c1.name은  c1이 참조하는 객체의 name 을 의미.

    c1.name = "소방차";  //c1이 참조하는 객체의 name을 소방차로 설정 
    c1.number = 1234;   // c1.number = 1234란 c1이 참조하는 객체의 number를 1234 로 설정 

    c2.name = "구급차"  //c2가 가리키는 객체의name을 구급차로 설정
    c2.number = 1004;  //c2가 가리키는 객체의 number를 1004로 설정


    System.out.println(c1.name);  //콘솔에 c1이 참조하는 객체의 name 을 출력합니다. 
    System.out.println(c1.number); //콘솔에 c1이 참조하는 객체의 number 를 출력합니다. 

    String name = c2.name;   //c2가 참조하는 객체의 name 을 String 타입 변수 name 도 참조하게 합니다.
*/

package javastudy;
public class CarExam{
    public static void main(String[] args) {
        String name;
        int number;

        Car c1=new Car();
        Car c2=new Car();

        c1.name="소방차";
        c1.number=1234;

        c2.name="소방차";
        c2.number=1234;
        
        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);

    }


} 