package com.example.day02;

public class Practice6 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; //묵시적 형변환 (byte의 크기보다 int의 크기가 더 크기 때문에 문제없이 담을 수 있음)

        b = (byte)i; //명시적 형변환 (b = i의 형태로는 컴파일에러가 나고 직접 형변환을 해달라고 입력을 해줘야 함.. int가 byte보다 크기 때문)

        float f = 10f;
        //long l = f; (실수 -> 정수는 명시적 형변환을 해줘야한다.. 아무리 정수형태의 그릇이 크더라도 소수값을 담지는 못하기때문)

        System.out.println(Float.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
