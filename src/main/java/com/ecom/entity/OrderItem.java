package com.ecom.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Product product;

    private Integer quantity;

    @ManyToOne
    private Order order;

    public OrderItem(Product product, Integer quantity, Order order) {
        this.product = product;
        this.quantity = quantity;
        this.order = order;
    }
}
