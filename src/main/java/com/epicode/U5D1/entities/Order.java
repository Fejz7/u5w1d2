package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    private static int nextOrderId = 1;

    private int orderId;
    private OrderStatus status;
    private int tableNumber;
    private int numberOfGuests;
    private LocalDateTime acquisitionTime;
    private List<MenuItem> items = new ArrayList<>();

    public Order(int tableNumber, int numberOfGuests) {
        this.orderId = nextOrderId++;
        this.status = OrderStatus.IN_PROGRESS;
        this.tableNumber = tableNumber;
        this.numberOfGuests = numberOfGuests;
        this.acquisitionTime = LocalDateTime.now();
    }

    public double calculateTotalCost(double coverCharge) {
        double totalCost = coverCharge;
        for (MenuItem item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }
}
