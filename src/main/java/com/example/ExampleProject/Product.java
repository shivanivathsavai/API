package com.example.ExampleProject;

import org.springframework.stereotype.Component;


public class Product {
    String id;
    String name;
    int price;

    public Product(){}

    public Product(String id,String name,int price)
    {
       this.id=id;
       this.name=name;
       this.price=price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
