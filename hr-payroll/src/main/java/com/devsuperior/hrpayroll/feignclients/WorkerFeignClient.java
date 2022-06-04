package com.devsuperior.hrpayroll.feignclients;


import com.devsuperior.hrpayroll.entities.Worker;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Componete gerenciado pelo spring
@Component
@FeignClient(name = "hr-worker", url = "localhost:8001/workers")

public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
