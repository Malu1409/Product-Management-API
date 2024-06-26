package com.exemplo.model;

public class Product {
    private Long id;
    private String name;
    private double price;

    // Getters e Setters omitidos para brevidade

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
