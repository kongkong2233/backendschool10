package com.example.day04;

public class ItemForArray {
    private int price; //속성, 필드
    private String name; //속성, 필드
    public ItemForArray(int price, String name) { //생성자
        this.price = price; // = private int price = int price
        this.name = name; // = private String name = String name
    }

    public int getPrice() { //getter(속성 값을 받음)
        return price;
    }

    public String getName() { //getter(속성 값을 받음)
        return name;
    }
}
