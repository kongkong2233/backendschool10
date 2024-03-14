package com.example.day04;

public class Array02 {
    public static void main(String[] args) {
        //초기값이 있게 배열 선언해주기
        int[] array1 = new int[5]; //기본형타입[] 변수명 = new 기본형타입[배열의크기];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5; //변수명[index값] = 값;
        int[] array2 = new int[]{10, 20, 30, 40, 50}; //기본형타입[] 변수명 = new 기본형타입]{값1, 값2, ...};
        int[] array3 = {100, 200, 300, 400, 500}; //기본형타입[] 변수명 {값1, 값2, 값3, ...};

        System.out.println("array1의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("array2의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("array3의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }
    }
}
