package com.spring_cloud.eureka.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;
    public String getOrder(String orderId) {
        if (orderId.equals("1")) {
            String productId = "2";
            String productInfo = productClient.getProduct(productId);
            return "Your order is " + orderId + " and " + productInfo;
        }
        return "Not exist order...";

    }

}