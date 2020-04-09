


//////////// 변수 및 상수 선언 ////////////

ackage javastudy;

public class constanyExam {

    public static void main(String[] args) {
        int i=10;
        
        final int J=12;
        
        double circleArea;
        final double PI;
        PI=3.14159;
        circleArea=3*3*PI;
    }
}

//////////// 데이터 타입 ////////////

package javaStudy;
public class PrimitiveDataTypeExam{
    public static void main(String[] args) {
        //boolean형 변수
        boolean isFun=false;
        system.out.println(isFun);
        
        //charactor형 변수 : 문자 1개 표현
        char c = 'd';
        //정수형 데이터 타입
        int x = 59;
        //긴 정수형 : 숫자끝에 대문자 L 포함
        long bing=43253425435L;
        //실수형 : f 붙여주기
        float ft=123.123f;
        double db=1991999299.12555524124;


    }
}

//////////// 데이터 타입 변환 ////////////
package javaStudy;
public class TypeCastingExam{
    public static void main(String[]args) {
        int x=50000;
        //묵시적 형 변환
        long y = x;

        //강제적 형 변환
        long x2=10;
        int y2=(int) x2;
    }
}