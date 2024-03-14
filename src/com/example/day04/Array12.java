package com.example.day04;

public class Array12 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length); //copyFrom배열의 내용과 크기를 모두 copyTo에 복사하겠다

        for(int c : copyTo) {
            System.out.println(c);
        }
        System.out.println("-----------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5); //copyFrom배열의 내용을 5의 크기로 복사하겠다.(1, 2, 3, 0, 0)

        for(int c : copyTo2) {
            System.out.println(c);
        }
    }
}
