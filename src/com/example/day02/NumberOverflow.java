package com.example.day02;

public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt);
        System.out.println(maxInt + 1); //값을 지나쳐서 양수가 음수로 바뀌는(음수면 양수로) 오버플로우가 발생
    }
}
