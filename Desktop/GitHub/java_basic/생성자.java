//////////////////// 생성자 ////////////////////
/*
모든 클래스는 인스턴스화 될때 생성자를 사용한다.
[생성자의 특징]
- 생성자는 리턴타입이 없다.
- 생성자를 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컴파일할 때 자동으로 만들어진다.
- 매개변수가 없는 생성자를 기본생성자라고 한다.
- 생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.
[생성자의 역할]
- 생성자가 하는 일은 객체가 될 때 필드를 초기화 하는 역할을 수행한다.
- 자동차가 객체가 될때 반드시 이름을 가지도록 하려면,Car클래스를 다음과 같이 만들어야 한다.
    public class Car{
        String name;
        int number;

        public Car(String n){
            name = n;
        }
    }
위의 Car 클래스를 이용하여 Car 인스턴스를 생성하는 방법
    public class CarExam2{
        public static void main(String args[]){

            Car c1 = new Car("소방차");
            Car c2 = new Car("구급차");
            //Car c3 = new Car(); // 컴파일 오류가 발생합니다.

            System.out.println(c1.name);

            System.out.println(c2.name);
        }
    }
Car클래스는 기본 생성자를 가지지 않는다. 그래서 기본생성자로 Car 객체를 생성할 수 없다.
*/

package javastudy;
public class CarExam{
    public static void main(String[] args) {
        Car c1=new Car();   //생성자
        Car c2=new Car("소방차");   //밑에서 String값으로 값을 받기 때문에 여기서도 String 값으로 받기
        Car c3=new Car("구급차");   

        System.out.println(c2.name) //출력하면 "소방차"
    }
}

package javastudy;
public class Car{
    String name;
    int number;
    
    public Car(String n) {
        name=n;
    }


}


