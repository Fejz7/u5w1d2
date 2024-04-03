package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class Menu extends MenuItem {
	private List<Pizza> pizzaList;
	private List<Drink> drinkList;
	private List<Topping> toppingList;

	public Menu(String name, double price) {
		super(name, price);
	}

	public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingsList) {
		super();
	}

	public void printMenu() {
	}
}
