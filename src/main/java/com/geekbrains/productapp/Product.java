package com.geekbrains.productapp;

public class Product {
    private int id;
    private String name;
    private double cost;


    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + ") " + name + " " + cost + " р";
    }
}
