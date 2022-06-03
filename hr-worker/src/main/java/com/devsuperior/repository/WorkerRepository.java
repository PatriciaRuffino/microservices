package com.devsuperior.repository;

import com.devsuperior.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long> {
}
