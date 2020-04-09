
///////////// 메소드 오버로딩 /////////////
/*
매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술
메소드 오버로딩
이름은 같지만 매개변수가 다른 메소드
    class MyClass2{
        public int plus(int x, int y){
            return x+y;
        }

        public int plus(int x, int y, int z){
            return x + y + z;
        }

        public String plus(String x, String y){
            return x + y;
        }
    }
메소드 오버로딩은 매개변수 부분이 달라야 한다.
    public int plus(int i, int f){
        return i+f;
    }
위처럼 변수명은 다르지만, 매개변수의 타입과 개수가 동일한 메소드를 또 정의 할 수는 없다.
오버로딩된 메소드 이용하기
메소드의 인자에 어떤 값이 쓰이느냐에 따라서 각기 다른 메소드가 호출된다.
    public MethodOverloadExam{
        public static void main(String args[]){
            MyClass2 m = new MyClass2();
            System.out.println(m.plus(5,10));
            System.out.println(m.plus(5,10,15));
            System.out.println(m.plus("hello" + " world"));
        }
    }
*/

package javastudy;

public static Myclass2 {
    public int plus (int x, int y){
        return x+y;
    }
    public int plus(int x, int y,int z){
        return x+y+z;
    }
    public String plus(String x,String y){
        return x+y;
    }
}

package javastudy;
    public class MethodOverloadExam{
        public static void name() {
            Myclass2 m = new MyClass2();
            System.out.println(m.plus(4,5));    //2개 숫자의 합
            System.out.println(m.plus(4,5,9));  //3개 숫자의 합
            System.out.println(m.plus('Hello','Java')); //2개 문자열의 합
    }
}