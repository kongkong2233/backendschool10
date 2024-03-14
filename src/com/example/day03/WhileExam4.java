package com.example.day03;

public class WhileExam4 {
    public static void main(String[] args) {
        //1-100까지의 짝수의 합을 구해라.
        int i = 1;
        int sum = 0;

        while(i++ <= 100) {
            if(i % 2 != 0)
                continue;
            sum += i;
        }

        System.out.println(sum);
    }
}
