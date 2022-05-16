package com.ecom.service;

import com.ecom.payload.OrderRequest;

public interface OrderService {

    void createOrder(OrderRequest request,String username);
}
