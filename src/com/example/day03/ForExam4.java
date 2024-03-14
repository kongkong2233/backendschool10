package com.example.day03;

public class ForExam4 {
    public static void main(String[] args) {
        //짝수만 합치기
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
