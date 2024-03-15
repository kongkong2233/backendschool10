package com.example.day04;

public class Exam11 {
    //int 타입의 이차원 배열 matrix가 주어졌을 때, 두 대각선의 요소 합계를 구하는 코드를 작성하세요. 배열은 정사각형 배열이라고 가정합니다.
    //대각선 요소의 합계를 각각 구하고, 그 결과를 출력하세요.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (i == j) leftSum = leftSum + matrix[i][j];
                if (i + j == 3) rightSum = rightSum + matrix[i][j];
            }
        }

        System.out.println(leftSum);
        System.out.println(rightSum);
    }
}
