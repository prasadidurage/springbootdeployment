package com.example.springbootdeployment.controller;

import com.example.springbootdeployment.dto.CustomerDTO;
import com.example.springbootdeployment.servirce.CustomerService;
import com.example.springbootdeployment.util.APIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;


    @GetMapping
    public String getCustomers() {
        return "List of customers";
    }


    @PostMapping
    public ResponseEntity<APIResponse> addJob(@RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return ResponseEntity.ok(new APIResponse(
                200,
                "User logged in successfully!",
                null
        ));
    }
    }
