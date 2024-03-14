package com.example.day03;

public class DoWhileExam2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 1); //조건이 거짓이 되어도 1까지는 출력됨
    }
}
