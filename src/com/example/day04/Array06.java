package com.example.day04;

public class Array06 {
    public static void main(String[] args) {
        int[][] array1 = new int[2][3]; //타입[][] 변수명 = new 타입[행][열];
        array1[0][1] = 10; //변수명[행인덱스][열인덱스] = 값;

        int[][] array2 = new int[3][]; //열의 수 생략 가능

        array2[0] = new int[3]; //0번째 인덱스에 다시 3크기의 배열을 만들어주면 열 인덱스 사용가능
        array2[1] = new int[2]; //1번째 인덱스에는 2크기의 배열을
        array2[2] = new int[10]; //2번째 인덱스에는 10크기의 배열을
        array2[0][0] = 10; //위 과정없이 이렇게 입력해버리면 열의 인덱스는 존재하지 않으니 오류 발생 NullPointerException
    }
}
