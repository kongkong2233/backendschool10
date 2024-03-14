package com.example.day02;

public class Rectangle {

//    int s; //필드(초기화 할 필요가 없다)
    public static void main(String[] args) {
        int i = 1; //지역변수 초기화(지역변수는 초기화하지 않으면 오류가 발생할 수 있음)
        while (i <= 10){ //while은 예약어 while(조건->true or false 값만 나오는 조건만 넣을 수 있다) {구현}
            System.out.println("**********");
            i = i + 1; // 첫 번째 실행 시 -> 1 + 1의 값(2)을 i에 저장 / 두 번째 실행 시 -> 2 + 1의 값(3)을 i에 저장 ...
        }
    }
}
