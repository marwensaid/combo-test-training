package com.testtraining.testtraining.myservice;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

public class OrderProcessorIT {
    @Test
    public void testProcessOrderWithPaymentSuccess() {
        PaymentService paymentServiceMock = mock(PaymentService.class);
        when(paymentServiceMock.processPayment(anyDouble())).thenReturn(true);

        OrderProcessor orderProcessor = new OrderProcessor(paymentServiceMock);
        boolean result = orderProcessor.processOrder(100.0);

        assertTrue(result);
        verify(paymentServiceMock).processPayment(100.0);
    }

    @Test
    public void testProcessOrderWithPaymentFailure() {
        PaymentService paymentServiceMock = mock(PaymentService.class);
        when(paymentServiceMock.processPayment(anyDouble())).thenReturn(false);

        OrderProcessor orderProcessor = new OrderProcessor(paymentServiceMock);
        boolean result = orderProcessor.processOrder(500.0);

        assertFalse(result);
        verify(paymentServiceMock).processPayment(500.0);
    }
}
