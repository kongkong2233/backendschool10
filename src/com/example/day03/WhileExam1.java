package com.example.day03;

public class WhileExam1 {
    public static void main(String[] args) {
        int i = 1; //변수의 초기화

        while (i <= 10) { //while(탈출조건식) {탈출조건식이 참일 경우 실행되는 코드 + 변수의 증감식(i++)}
            System.out.println(i);
            i = i + 1; //i++, i += 1
        }
    }
}
