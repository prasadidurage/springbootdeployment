package com.example.springbootdeployment.repo;

import com.example.springbootdeployment.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository<Customer,Integer> {
}
