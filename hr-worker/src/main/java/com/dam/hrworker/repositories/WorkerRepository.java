package com.dam.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
