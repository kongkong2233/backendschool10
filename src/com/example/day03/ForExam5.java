package com.example.day03;

public class ForExam5 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*"); //행
            }
            System.out.println(); //열 (**위에 써버리면 줄바꿈이 먼저 시작돼서 한번만 찍고 내려가버려 이상한 모양이 될 수 있다. 주의!)
        }
    }
}
