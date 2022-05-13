package com.ecom.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ecom_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String orderStatus;

    private String paymentStatus;

    private Date orderCreated;

    private double totalAmount;

    private String billingAddress;


    private Date orderDelivered;

    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    Set<OrderItem> items = new HashSet<>();

    public Order() {
    }
}
