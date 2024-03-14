package com.example.day03;

public class SwitchExam1 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) { //switch (변수)
            case 1 : //case 변수값1 :
                System.out.println("1입니다.");
                break; //break가 없으면 이 이후 조건문까지 다 실행하게 되므로 이런 경우에는 break문을 사용해야한다.
            case 2 : //case 변수값2 :
                System.out.println("2입니다.");
                break;
            case 3 : //case 변수값3 :
                System.out.println("3입니다.");
                break;
        }
    }
}
