package com.example.day03;

public class LabelExam1 {
    public static void main(String[] args) {
        outter: //Label(어떻게 쓰든 상관없다)
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < 3; k++) {
                if(i == 0 && k == 2)
                    continue outter; // break + Label or continue + Label
                System.out.println(i + ", " + k);
            }
        }
    }
}
