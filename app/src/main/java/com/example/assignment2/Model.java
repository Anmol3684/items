package com.example.assignment2;

public class Model {


        private  String No;
        private final String product;
        private final String price;

        public Model(String No, String product,  String price) {
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

        public String getPrice() {
            return price;
        }
    }

