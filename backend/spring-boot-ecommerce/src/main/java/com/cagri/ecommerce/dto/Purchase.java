package com.cagri.ecommerce.dto;

import com.cagri.ecommerce.entity.Address;
import com.cagri.ecommerce.entity.Customer;
import com.cagri.ecommerce.entity.Order;
import com.cagri.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}
