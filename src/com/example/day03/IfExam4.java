package com.example.day03;

public class IfExam4 {
    public static void main(String[] args) {
        //삼항연산자 조건식? 반환값1(참) : 반환값2(거짓)
        int a = 10;

        int value = (a > 5) ? 20: 30;
        System.out.println(value);
        //if문으로 쓴다면?
        if(a > 5) {
            System.out.println("20");
        } else {
            System.out.println("30");
        }
    }
}
