package com.dvsuperior.hrpayroll.services;

import com.dvsuperior.hrpayroll.entities.Payment;
import com.dvsuperior.hrpayroll.entities.Worker;
import com.dvsuperior.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//registra a classe como componete do serviço
@Service
public class PaymentService {


    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}

