package com.example.ExampleProject;

public class Product {
    int id;
    String name;
    int price;

    public Product(){}

    public Product(int id,String name,int price)
    {
       this.id=id;
       this.name=name;
       this.id=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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