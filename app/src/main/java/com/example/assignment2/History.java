package com.example.assignment2;

public class History {
    private  String No;
    private final String product;
    private final String price;
    public History(String No, String product,  String price) {
        this.No = No;
        this.product = product;
        this.price = price;
    }

    public String getNo() {
        return No;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return Integer.parseInt(price);
    }
}
