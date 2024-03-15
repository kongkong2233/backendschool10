package com.example.day04;

public class Exam10 {
    //int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고, 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        int[] temp = new int[array1.length + array2.length]; //모든 배열 요소들을 잠깐 담아둘 배열 생성
        int n = 0;
        for(int i = 0; i < array1.length; i++) {
            temp[n] = array1[n];
        }

        for(int i = 0; i < array2.length; i++) {
            boolean flag = false;

            for(int j = 0; j < array1.length; j++) {
                if (array1[j] == array2[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            temp[n] = array2[i];
            n++;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }
}
