/////////////// 패키지 ///////////////
/*
패키지(package)란 서로 관련이 있는 클래스 또는 인터페이스들을 묶어 놓은 묶음이다. 
패키지를 사용함으로써 클래스들이 필요할 때만 사용될 수 있도록 하고, 
클래스를 패키지 이름과 함께 계층적인 형태로 사용함으로써 
다른 그룹에 속한 클래스와 발생할 수 있는 클래스 이름간의 충돌을 막아 클래스의 관리를 편하게 해준다.

[패키지 정의방법]
1. package이름은 보통 도메인 이름을 거꾸로 적은 후, 그 뒤에 프로젝트 이름을 붙여서 만든다. 
   물론, 프로젝트 이름 뒤에 또 다른 이름이 나올 수도 있다.
2. package이름은 폴더명 점 폴더명 점 폴더명 과 같은 형식으로 만들어진다. 각각의 폴더명은 숫자로 시작할 수 없다.
3. 도메인 이름이 8cruz.com 이고 프로젝트 이름이 javastudy 라면 com.eightcruz.javastudy.Hello 로 패키지를 지정 할 수 있다.
- 도메인이 숫자로 시작되는데 패키지명은 첫글자에 숫자를 사용할 수 없으므로 적절하게 수정한다.
- 도메인으로 사용하는 이유는 패키지가 중복되는것을 방지하기 위함이므로, 반드시 존재하는 도메인이 아니라도 상관없다.

[이클립스에서 패키지 생성하기]
1. 소스폴더를 선택한 후 우측버튼을 클릭하여 패키지 생성을 선택한다.
2. 패키지 이름에 kr.co.helloWorld.javastudy를 입력한다.
3.해당 패키지를 선택하고 Hello클래스를 작성한다.
- 작성된 클래스 파일의 첫줄에 package com.eightcruz.javastudy.Hello; 생성된것을 볼 수 있다.
- 패키지를 생성하는 예약어는 package 다.

[패키지에 생성된 클래스 사용하기]
1. java.lang패키지를 제외하고는 다른 패키지에 있는 클래스를사용하려면 import라는 구문을 적어줘야 한다.
2. import com.eightcruz.javastudy.Hello;
3. 위의 코드는 com.eightcruz.javastudy패키지 아래의 Hello클래스를 사용하겠다는 것을 컴파일러와 JVM에게 알리는 것이다.
4. 클래스 이름대신에 * 를 적어도 된다. import com.eightcruz.javastudy.*;

[import 하지 않고 사용하는 방법]
1.만약 import를 하기 싫다면, 혹은 각기 다른 패키지에 존재하는 같은 이름의 클래스 파일을 사용해야 한다면 아래와 같이 이용한다.
- com.eightcruz.javastudy.Hello hello = newe com.eightcruz.javastudy.Hello(); 이렇게 사용한다.
*/

//////////////// 상속 ////////////////
/* 상속이란? 
- 부모가 가진것을 자식에게 물려주는것을 의미한다.
- 노트북은 컴퓨터의 한 종류다. 침대는 가구의 한 종류다. 혹은 침대는 가구다. 소방차는 자동차다.
- 이렇게 말할 수 있는 관계를 is a 관계 혹은 kind of 관계라고 한다.

[Car 를 상속받은 Bus 를 class로 표현하는 방법]
 public class Car{

    }

    public class Bus extends Car{

    }
- 자바는 클래스 이름 뒤에 extends 키워드를 적고 부모클래스 이름을 적게 되면 부모 클래스가 가지고 있는 것을 상속받을 수 있게 된다.
- 상속이란 부모가 가지고 있는 것을 자식이 물려받는 것을 말한다. 즉, 부모가 가지고 있는 것을 자식이 사용할 수 있게 된다.

[부모클래스에 메소드 추가하기]
1. Car에 run()메소드를 추가
    public class Car{
        public void run(){
            System.out.println("달리다.");
        }
    }
2. Car를 상속받은 Bus 사용
    public class BusExam{
        public static void main(String args[]){
            Bus bus = new Bus();
            bus.run();  
            //Bus class 는 아무런 코드를 가지지 않는다. 그럼에도 run 이라는 메소드를 사용하는데 문제가 발생되지 않는다. 
        }   
    }
3. Bus에 메소드 추가
    public class Bus extends Car{
        public void ppangppang(){
            System.out.println("빵빵");
        }       
    }
- Bus는 Car에서 물려받은 run메소드와 ppangppang메소드를 사용할 수 있게 된다.
- 부모가 가지고 있는 메소드외에 추가로 메소드를 선언하는 것을 확장하였다고 표현한다.
*/
package javastudy;

public class Bus extends Car { //public class 클래스명 extends 부모클래스명
    public void run(){
        System.out.println("달리다.")
    }

    public void ppangppang(){
        System.out.println("빵빵~!")
    }

    public void
}


package javastudy;
public class BusExam{
    public void main(String[]args){
        Bus bus=new Bus();
        bus.run();
        bus.ppangppang();
        
        //부모 클래스인 Car는 자식 메서드의 run 사용 X
        Car car=new Car();
        car.run();  //사용 X
        }
}