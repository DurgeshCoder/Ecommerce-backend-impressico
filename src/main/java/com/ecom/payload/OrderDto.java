package com.ecom.payload;

import com.ecom.entity.OrderItem;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class OrderDto {

    private Integer orderId;

    private String orderStatus;

    private String paymentStatus;

    private Date orderCreated;

    private double totalAmount;

    private String billingAddress;


    private Date orderDelivered;

    Set<OrderItemDto> items = new HashSet<>();


}
