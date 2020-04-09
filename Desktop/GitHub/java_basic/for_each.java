package javastudy;

public class ForeachExam{
    public static void main(String[] args ) {
        int[] iarray = {10,20,30,40,50};

        for(int i=0; i<iarr.length;i++){
            int value=iarray[i];    //value가 iarray값 받음
            System.out.println(value);
        }
        
        //:뒤에는 반복되는 자료구조(출력하고 싶은 자료구조:iarray) 넣기, 
        //for each는 반복하면서 iarray의 값을 뱉어냄. 앞에는 값을 담아줄 변수
        //iarry의 길이 몰라도 사용 가능        
        for(int value:iarray){
            System.out.println(value);
        }
        
    }