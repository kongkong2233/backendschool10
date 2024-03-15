package com.example.day04;

public class Exam7 {
    //double 타입의 배열 doubles에서 최대값과 최소값을 찾아 출력하는 코드를 작성하세요.
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double max_value = Double.MIN_VALUE;
        double min_value = Double.MAX_VALUE;

        for(double n : doubles) {
            if (n > max_value) max_value = n;
            if (n < min_value) min_value = n;
        }

        System.out.println("최대값 : " + max_value);
        System.out.println("최소값 : " + min_value);
    }
}
