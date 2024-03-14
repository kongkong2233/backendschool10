package com.example.day03;

public class WhileExam3 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) { //후위 증가식이 붙을 경우 변수가 사용된 이후 값이 증가된다.
            System.out.println(i);
        }
    }
}
