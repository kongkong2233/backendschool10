package com.example.day04;

public class Exam5 {
    //int 타입의 이차원 배열 matrix를 선언하고, 다음과 같은 형태로 초기화하세요.
    //이차원 배열 matrix의 모든 요소를 for 루프를 사용하여 출력하는 코드를 작성하세요. 출력 형태는 위와 같아야 합니다.
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
