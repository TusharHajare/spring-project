package com.example.springproject.controller;

import com.example.springproject.entity.Customer;
import com.example.springproject.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController
{
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("customer")
    public Customer saveData(@RequestBody Customer customer)
    {
        return customerRepo.save(customer);
    }

    @GetMapping("customer")
    public List<Customer> getData()
    {
        return customerRepo.findAll();
    }
}
