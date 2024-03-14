package com.example.day03;

public class DoWhileExam1 {
    public static void main(String[] args) {
        int i = 1; //변수 초기화
        do {
            System.out.println(i); //탈출 조건식이 참일 경우 실행되는 코드(한 번은 무조건 실행되어서 참이 아니더라도 1까진 나온다)
            i++; //변수의 증감식
        } while (i <= 10); //while(탈출 조건식)
    }
}
