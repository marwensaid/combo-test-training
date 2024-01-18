package com.testtraining.testtraining.myservice;

public class OrderProcessor {
    private PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean processOrder(double amount) {
        // Logique de traitement de la commande avec la dépendance externe (PaymentService)
        return this.paymentService.processPayment(amount);
    }
}
