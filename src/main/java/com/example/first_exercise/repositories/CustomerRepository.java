package com.example.first_exercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.first_exercise.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

    
} 
