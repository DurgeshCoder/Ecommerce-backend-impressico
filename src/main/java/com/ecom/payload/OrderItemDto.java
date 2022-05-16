package com.ecom.payload;

import com.ecom.entity.Product;
import lombok.Data;

import javax.persistence.OneToOne;

@Data
public class OrderItemDto {
    private Integer id;


    private Product product;

    private Integer quantity;
}
