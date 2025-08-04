package com.example.springbootdeployment.servirce.imp;

import com.example.springbootdeployment.Entity.Customer;
import com.example.springbootdeployment.dto.CustomerDTO;
import com.example.springbootdeployment.repo.CustomerRepo;
import com.example.springbootdeployment.servirce.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServirceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    @Override
    public void save(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .id(customerDTO.getId())
                .name(customerDTO.getName())
                .address(customerDTO.getAddress())
                .phone(customerDTO.getPhone())
                .build();
        customerRepo.save(customer);


    }


}
