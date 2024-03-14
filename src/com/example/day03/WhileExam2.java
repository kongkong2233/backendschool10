package com.example.day03;

public class WhileExam2 {
    public static void main(String[] args) {
        int i = 1;
        while (true) { //탈출 조건식에 true를 입력해놓으면 무한 루프를 할 수 있다.
            if(i == 6) break;
            System.out.println(i);
            i++;
        }
    }
}
