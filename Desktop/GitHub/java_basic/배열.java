/*
배열 만들기
1차원 배열
배열은 같은 데이터 타입을 가진 연속된 메모리 공간으로 이루어진 자료구조이다.
같은 데이터 타입을 가진 여러개의 변수가 필요할 때 사용한다.
배열 생성 방법
정수를 4개 저장 할 수 있는 배열을 생성 하는 방법
        int[] array1 = new int[4];
배열에 값을 저장하는 방법
    array1[0] = 1;
    array1[1] = 2;
    array1[2] = 3;
    array1[3] = 4;
    //자바에서 배열의 인덱스는 0번 부터 사용한다. 4개짜리 배열은 0부터 3까지의 인덱스를 가지게 된다.
    //배열인덱스 0번부터 3번까지 차례로 1,2,3,4 값을 저장한다. 
배열에 저장된 값을 꺼내서 사용하는 방법
    int value = array1[2]; 
    //array1 이 참조하는 배열의 2번 인덱스에 해당하는 값 3을 꺼내서 int형 변수 value에 담는다. 
    System.out.println(array1[1]); 
    //array1 이 참조하는 배열의 1번 인덱스에 해당하는 값 2가 콘솔에 출력된다. 
선언과 동시에 초기화하는 방법
    int[] array2 = new int[]{1,2,3,4,5};
    //int 값을 5개저장 할 수 있는 배열이며, 해당 배열에는 1,2,3,4,5가 순서대로 저장되게 된다.
*/


package javastudy;

public class ArrayExam{
    public static void main(String[] args ){
        // 배열 선언.1 : array1이름으로 int형 배열 선언. int형 데이터 100개 담을 수 있음.    
        int[] array1 = new int[100];
        array1[0]=50;
        array1[10]=100;
        
        // 배열 선언.2 : int형 배열 만들고 4개 숫자 담음.    
        int[]array2=new int[](1,2,3,4);
                
        // 배열 선언.3
        int[]array2={1,2,3,4};

        //배열 값 꺼내기
        System.out.println(array[3]);   //array[3]=4
        int value=array3[0];    //array[0]의 값을 value에 넣기

    } 

/////////// 배열의 활용 ///////////
package javastudy;

public class ArrayExam1{
    public static void main(String[] args ){
        int[] array=new int[100];
        iarray[0]=1;
        iarray[1]=2;

        for(int i =0; i<iarray.length;i++){
            iarray[i]=i+1;
        }
        //for문 끝나면 for안에서 선언된 i는 다시 사라짐.
        //새로운 for문에서는 새롭게 i 선언 필요
        for(int i =0; i<iarray.length;i++){
            int sum=sum+i;
        }
        System.out.println(sum)
    }
}    

/////////// 다차원 배열 ///////////
/*
2차원배열
2차원 배열
2차원 배열이란 배열의 배열이다.
2차원 배열 생성 방법
정수를 4개씩 담을 수 있는 배열이 3개 생성된다.
        int[][] array4 = new int[3][4];
2차원 배열에 값을 저장하는 방법
만약 array4[1] = 10 ; 이렇게 사용하면 오류!!
array4[1] 은 또 다른 1차원 배열을 가리킬 수 있는 참조형 변수이기 때문에 값을 담을수는 없다.
     array4[0][0] = 10; 
가변크기의 2차원 배열을 생성하는 방법
    int[][] array5 = new int[3][];
    //위와 같이 선언하면 array5는 3개짜리 배열을 참조한다. 3개짜리 배열은 아직 참조하는 배열이 없다는 것을 의미.

    array5[0] = new int[1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5 의 0 번째 인덱스가 참조한다.  
    array5[1] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성해서 array5 의 1 번째 인덱스가 참조한다.  
    array5[2] = new int[3]; //정수를 세개 담을 수 있는 배열을 생성해서 array5 의 2 번째 인덱스가 참조한다. 
선언과 동시에 초기화하는 방법
    int[][] array6 = {{1}, {2,3}, {4,5,6}};
    //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다.
*/


package javastudy;

public class ArrayExam2{
    public static void main(String[] args ){
        int[][]array4=new int[3][4];
        array4[0][1]=10;    // 0번째 인덱스의 1번 칸에 10을 넣음
                            
        //크기가 다른 배열을 생성 가능
        int[][]array5=new int[3][]; //인덱스는 있는데 크기가 정해지지 않음
        //2차원 배열의 세로길이는 아는데 가로는 얼만지 모름.
        array5[0]=new int[1];   //0번째 인덱스에 1개짜리 배열로 만듬
        array5[1]=new int[2];   //1번째 인덱스에 2개짜리 배열로 만듬
        array5[2]=new int[3];   //2번째 인덱스에 3개짜리 배열로 만듬
        array5[0][0]=10;

    }
