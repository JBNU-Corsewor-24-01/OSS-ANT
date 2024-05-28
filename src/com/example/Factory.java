package com.example;

public class Factory {
    public Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}

interface Product {
    String getName();
}

class ProductA implements Product {
    public String getName() {
        return "Product A";
    }
}

class ProductB implements Product {
    public String getName() {
        return "Product B";
    }
}
