package com.example.day04;

public class Array01 {
    public static void main(String[] args) {
        //배열선언 : 배열의 주소를 담을 수 있는 그릇이 만들어짐(값이 없기 때문에 생성하지 않고 사용하려 하면 에러가 남)
        int[] array1; //기본형타입[] 변수명;
        int array2[]; //기본형타입 변수명[];
        int array3[];
        //배열생성(선언 후 반드시 생성해주어야한다) : 값을 몇만큼 담을 수 있는 그릇이 만들어짐
        array1 = new int[5];
        array2 = new int[5];
        array3 = new int[0];
        //배열이용
        array1[0] = 10; //0번째 인덱스에 10을 넣는다
        array1[1] = 20; //1번째 인덱스에 20을 넣는다

        int i = array1[0];
        System.out.println(i);
        System.out.println(array1[0]);
    }
}
