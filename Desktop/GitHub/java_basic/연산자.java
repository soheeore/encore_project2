/*
산술연산자
부호(+,-), 증감(++,--), +,-,*,/,%
연산식 ** x = y + z;**

y와 z를 더한 값을 x에 대입한다는 것을 의미
=과 + 는 연산자 = 은 대입연산자 이고, + 산술연산자 이다.
y와 z 는 피연산자 이다.
x = y+ z 는 연산식이다.
부호를 결정하는 부호 연산자

산술 연산을 할 수 있는 산술 연산자

1씩 증가하거나 감소 시키는 증감연산자

피 연산자가 1개인 연산자는 단항 연산자

부호 연산자와, 증감연산자는 단항 연산자 이다.

    //부호 연산자 
    int i1 = -5;
    int i2 = +i1;
    int i3 = -i1;

    //증감 연산자 
    int i4 = ++i3;
    int i5 = i3++;
    int i6 = --i3;
    int i7 = i3--;
피연 산자 하나로 연산할 수 없는 연산자 이항 연산자

    int i = 5;
    int j = 2;  
2개의 변수 이용한 산술 연산

    System.out.println(i +  j);
    System.out.println(i -  j);
    System.out.println(i *  j);
    System.out.println(i /  j);  
    System.out.println(i %  j);  
    */
/////////////// 부호 연산자 ///////////////
package javaStudy;
public class OperatorExam {
    public static void name(String[]args) {
    //숫자 앞에 '+'는 숫자의 부호를 유지시켜주고, 
    //'-'가 숫자의 부호 바꿈 : 양수는 음수로, 음수는 양수로
        int i1=-5;
        int i2=+1;
        int i3=-i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3;//==>i3=i3+1으로 더한 후 i4에 넣어줌
        System.out.println(i4); // ==>6

        //'++','--'가 뒤에 붙으면
        int i5= i3++; //i3을 i5에 넣고, i3은 i3에 1을 더한 값으로 변함
        System.out.println(i5);


        /////////////// 산술 연산자 ///////////////
        int j =5;
        int k =2;

        System.out.println(j+k); //==>7
        System.out.println(j-k); //==>3
        System.out.println(j*k); //==>10
        System.out.println(j%k); //==>1
        System.out.println(j/k); //==>2
        System.out.println(j/(double)k); //==>casting 형변환 연산으로 2.5가 결과값


        /////////////// 비교 연산자 ///////////////
        
        int h=10; 
        int l=10;
        //'='는 단순 대입 연산자,'=='비교 연산자

        //h와 l이 같은지 
        System.out.println(h==l);//True 값 리턴
        //h와 l이 다른지 
        System.out.println(h!=l);//False 값 리턴
        //h가 l보다 작거나 같은지
        System.out.println(h<=l);//True 값 리턴

        //복합대입 연산자 : 연산 결과를 좌항의 변수에 대입까지
        h+=10; //==> h=(h+10);
        System.out.println(h); //h는 10에서 10 더해서 20 리턴
        System.out.println(h-=5); //h는 15
    }
}

/*
연산자 우선순위
최우선연산자 ( ., [], () )

단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)

산술연산자 ( *,/,%,+,-,shift) < 시프트연산자 ( >>,<<,>>> ) >

비교연산자 ( >,<,>=,<=,==,!= )

비트연산자 ( &,|,,~ )

논리연산자 (&& , || , !)

삼항연산자 (조건식) ? :

대입연산자 =,*=,/=,%=,+=,-=


    int a = 5;
    int b = 10;
    int c = 5
    System.out.println(  a - b * c );
    //결과는 -45가 나오게 됩니다

곱셈이 우선순위가 높기 때문에 b와c를 먼저 곱한다. 그런 다음 a에서 b와 c를 곱한 값을 뺀다.

비교연산자가 논리 연산자 보다 우선순위가 높다.

단 증감 연산자일 경우에 전위 연산자인지 후위 연산자 인지에 따라서 우선 순위가 바뀔 수 있다.


            int a = 5; 
            System.out.println(++a - 5); 
            //결과는 1 
단항 연산자이면서, 전위 연산자인 ++ 가 먼저 연산된다. a가 6으로 바뀐 후 5 를 빼게 되므로 결과는 1

        int a = 5; 
        System.out.println(a++ - 5); 
        //결과는 0
        System.out.println(a); 
        //결과는 6
단항 연산자이면서, 후위 연산자인 ++ 가 나중에 연산된다. a가 5인 상태에서 5를 뺀 후에 a++(a=a+1) 이 실행되므로 출력결과는 0
논리연산자 중 and 연산과 or 연산이 나왔을 경우 and 연산이 먼저 수행 됩니다.
*/
