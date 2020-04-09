package javastudy;

import java.util.Scanner;
public class ForExam{
    public static void main(String[] args) {
        int total=0;
        for (int i =1; i <=100; i++){
            if(i%2!==0){
                continue;
            }
            /*if(i==50){
                break;  //50이 되면 반복문 빠져나옴
            }*/
            total+=i;
            // for(for 구문 자체에서 초기화; 조건; i증감)
        }
        System.out.println(total);
    }
}