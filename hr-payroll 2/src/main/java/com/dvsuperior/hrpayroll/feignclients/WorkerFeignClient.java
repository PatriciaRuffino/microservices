package com.dvsuperior.hrpayroll.feignclients;

import com.dvsuperior.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Componete gerenciado pelo spring
@Component
@FeignClient(name = "${hr-worker.name}", url = "${hr-worker.url}")

public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
