package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends MenuItem {
	private String name;

	public Drink(String name, int calories, double price) {
		super(name, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				//", calories=" + calories +
				", price=" + price +
				'}';
	}
}
