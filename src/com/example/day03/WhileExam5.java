package com.example.day03;

public class WhileExam5 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if(i % 2 != 0) //홀수일 때
                continue; //이하 문장을 실행하지 않고 넘어간다.
            System.out.println(i);
        }
    }
}
