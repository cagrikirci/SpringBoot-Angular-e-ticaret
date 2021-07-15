package com.cagri.ecommerce.service;


import com.cagri.ecommerce.dto.Purchase;
import com.cagri.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
