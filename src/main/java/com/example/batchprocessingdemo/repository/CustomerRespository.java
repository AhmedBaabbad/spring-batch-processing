package com.example.batchprocessingdemo.repository;

import com.example.batchprocessingdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, Integer> {
}
