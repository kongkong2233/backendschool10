package com.example.day03;

import java.util.Scanner;

public class Exam2 {
    //실습 문제 2: 짝수와 홀수 판별기
    //사용자로부터 정수 하나를 입력받아, 그 수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요. if-else 문을 사용하여 구현하세요.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int num = keyboard.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + "은(는) 짝수입니다");
        } else {
            System.out.println(num + "은(는) 홀수입니다");
        }
    }
}
