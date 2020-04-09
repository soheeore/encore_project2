/*
this
this는 현재 객체, 자기 자신을 나타낸다.
this 의 사용
    public class Car{
        String name;
        int number;

        public Car(String n){
            name = n;
        }
    }
Car클래스의 생성자 매개변수의 이름이 n 이다. n 이라는 변수명은 무엇을 의미하는지 쉽기 알수 없다.
n 으로 쓰기 보다는 name 으로 사용하는 것이 좋다.
    public Car(String name){
        name = name;
    }
'name=name' 이라고 코드를 바꾸면, 가깝게 선언된 변수를 우선 사용하기 때문에 'name=name'이라는 코드는 매개변수의 name의 값을 매개변수 name에 대입하라는 의미가 된다.
즉, 필드는 바뀌지 않습니다. 이런 경우 필드라는 것을 컴파일러와 JVM에게 알려주기 위해서 this키워드를 사용해야 한다.
    public Car(String name){
        this.name = name;
    }
앞의 this.name은 필드 name을 말하고 =(이퀄) 뒤의 name은 매개변수를 의미한다.
즉 매개변수의 값을 필드에 대입하라는 의미가 된다.
클래스 안에서 자기 자신이 가지고 있는 메소드를 사용할 때도 this.메소드명()으로 호출할 수 있다.
*/

package javastudy;
public static Car {
    //타입 필드명
    String name;
    int number;
    
    public Car(String name) {
        this.name=name; // name=name만 쓰면 name이 윗줄에 String name을 가리키고 있어서 null값 떠(입력한게 없으니까)
        //this(객체 자신을 참조하는 키워드) 안 쓰면 아래 클래스에서 제대로 값 안떠 
    } 
}


package javastudy;{
    public class CarExam2{
        public static void main(String[] args){
            Car c1=Car();
            Car c2=Car("소방차");
            Car c3=Car("응급차");

            System.out.print(c2.name,c3.name);
        }
    }
}
