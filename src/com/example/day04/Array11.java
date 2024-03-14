package com.example.day04;

public class Array11 {
    public static void main(String[] args) {
        // 아래 배열에서 최대값과 최소값을 찾아서 출력하세요
        double[] doubles = {1.5, 3.7, 9.5, 3.1};

        double max_value = doubles[0]; //최대값 기준 초기화
        double min_value = doubles[0]; //최소값 기준 초기화

        for (double n : doubles) {
            if(max_value < n) max_value = n; //현재 최대값보다 크면 업데이트
            if(min_value > n) min_value = n; //현재 최소값보다 작으면 업데이트
        }

        System.out.println("최대값: " + max_value);
        System.out.println("최소값: " + min_value);
    }
}
