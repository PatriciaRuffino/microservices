package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//registra a classe como comopnete do serviço
@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}
