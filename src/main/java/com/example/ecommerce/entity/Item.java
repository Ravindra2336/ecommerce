package com.example.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Column(name = "item_name")
    private String name;
    @Id
    @Column(name = "item_id")
    private String id;
    @Column(name = "item_price")
    private int price;

    public Item() {
    }

    public Item(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
