package com.example.day03;

import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Scanner는 빈 괄호로 둘 수 없다. 어디서 입력받을지 확실히 입력해줘야한다.
        System.out.println("단을 입력하세요:");
        int dan = keyboard.nextInt(); //사용자가 입력한 내용을 담을 변수

        for(int i = 1; i < 10; i++) {
            System.out.println(dan + "단");
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
