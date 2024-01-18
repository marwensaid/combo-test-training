package com.testtraining.testtraining.myservice;

public class PaymentService {
    public boolean processPayment(double amount) {
        // Logique de traitement de paiement simulée
        amount = Math.random();
        return amount < 0.9; // Simule un paiement réussi dans 90% des cas
    }
}
