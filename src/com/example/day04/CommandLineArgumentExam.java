package com.example.day04;

public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ...");
            return;
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
