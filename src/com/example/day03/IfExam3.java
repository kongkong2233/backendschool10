package com.example.day03;

public class IfExam3 {
    public static void main(String[] args) {
        int score = 70;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else { //else는 따로 조건문이 붙지 않는다.
            System.out.println("F");
        }
    }
}
