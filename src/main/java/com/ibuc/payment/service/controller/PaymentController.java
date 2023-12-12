package com.ibuc.payment.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/payment-service")
public class PaymentController {

    @Value("${stripe.apikey}")
    String apiKey;
    @GetMapping("/getKey")
    public String getKey() {
        return "hello " + apiKey;
    }
}
