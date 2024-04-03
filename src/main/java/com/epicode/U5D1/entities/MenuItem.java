package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
    }

    public MenuItem() {

    }
}
