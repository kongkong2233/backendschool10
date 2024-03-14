package com.example.day02;

public class Book {
    /*
        title
        price를 필드로 선언
        중요한 속성
     */
    private String title; //나 자신만 접근 가능하다(알려줘야만 사용가능)
    private int price; // field price
    private String origin;

    //메소드 만들기(위에서 선언한 필드값 얻기 및 수정을 위한 메소드)
    //접근제한자 리턴타입 메소드명(매개변수들) {구현}
    public String getTitle() {
        return this.title; //내가 가르키는 나의 속성(this를 쓰지 않으면 그냥 가까운 title을 바라봄)
    }

    public void setTitle(String title) {
        this.title = title; //title 값 수정
    }

    //alt+insert => 자동메소드 생성
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
