package javastudy;
public class SwitchExam{
    public static void main(String[] args) {

        int value=1;
        switch(value) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("그 외 다른 숫자");
                //break 적어주면 맞는 조건에서 즉시 빠져나옴
            
        // Switch 구문에 문자열,int형도 들어올 수 있음
            
        int value=2;
        switch(value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
            }
    }
