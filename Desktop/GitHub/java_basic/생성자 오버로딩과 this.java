/*
생성자 오버로딩과 this
생성자 오버로딩
생성자의 매개변수의 유형과 개수가 다르게 하여 같은 이름의 생성자를 여러 개 가질 수 있다.
생성자도 메소드와 마찬가지로 여러개를 선언할 수 있다.
매개변수의 수와 타입이 다르다면 여러개의 생성자를 선언할 수 있다.
    public class Car{
        String name;
        int number;

        public Car(){

        }

        public Car(String name){
            this.name = name;
        }

        public Car(String name, int number){
            this.name = name;
            this.number = number;
        }
    }
오버로딩된 생성자 이용하기
    public class CarExam4{
        public static void main(String args[]){
            Car c1 = new Car();
            Car c2 = new Car("소방차");
            Car c3 = new Car("구급차", 1234);
        }
    }
자기 생성자 호출하는 this()
기본생성자를 호출하였을 때 name을 이름없음 , 숫자를 0으로 초기화 하기
    public Car(){
        this.name = "이름없음";
        this.number = 0;
    }
위처럼 작성했을 경우 코드의 중복이 일어난다.
자신이 가지고 있는 다른 생성자를 이용할 수 있다.
    public Car(){
        this("이름없음", 0);
    }
this괄호 열고로 시작하면 자신의 생성자를 호출하는 것이다.
자기 자신의 생성자를 호출함으로써 비슷한 코드가 중복되서 나오는 것을 방지할 수 있다.
*/

//기본생성자 정의하기//
package javastudy;

public class Car{
    String name;
    int number;
     
    //이름이랑 번호를 초기값으로 받아들임//
    public Car(string name, int number){
        this.name=name;
        this.number=number;
    }

    //기본 생성자//
    public Car(){
//        this.name="No name";
//        this.number=0;
        // 아무것도 없이 기본 생성자에 생성되어도 필드에 "No name"과 0을 넣어 생성하고 싶다면 위와 같이
        // 근데 위에도 name과 number를 이미 정의해줌. 
        // 똑같은 코드를 반복하기 보다 아래와 같이 간단히 나타내기.
        this("이름없음",0);
    }

}

package javastudy;

public static CarExam3 {
    public static void (String[] args){
        Car c1=new Car("소방차");
        Car c2=new Car();
        Car c2=new Car("구급차",0119);
    }
}
