package com.example.day04;

public class Array13 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', '0', '!'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 3); //문자열 복사는 copyOfRange, 어디부터 어디까지 복사하겠다

        for(char c : copyTo) {
            System.out.println(c);
        }
    }
}
