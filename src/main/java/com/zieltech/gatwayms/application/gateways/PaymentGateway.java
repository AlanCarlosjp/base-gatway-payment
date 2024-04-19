package com.zieltech.gatwayms.application.gateways;


import com.zieltech.gatwayms.domain.PaymentMethod;

public interface PaymentGateway {

    Output execute(Input input);

    record Input(PaymentMethod paymentMethod) {
    }

    record Output(String transactionId) {
    }
}
