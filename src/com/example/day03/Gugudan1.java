package com.example.day03;

public class Gugudan1 {
    public static void main(String[] args) {
        System.out.println("구구단");
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
