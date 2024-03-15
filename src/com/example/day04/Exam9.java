package com.example.day04;

public class Exam9 {
    //String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요. 마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};

        String temp = words[3];
        for(int i = words.length - 1; i >= 1; i--) {
            words[i] = words[i - 1];
         }
        words[0] = temp;

        for (String c : words) {
            System.out.println(c);
        }
    }
}
