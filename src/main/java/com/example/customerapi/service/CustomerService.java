package com.example.customerapi.service;

import com.example.customerapi.model.Customer;
import com.example.customerapi.model.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {

    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer customerId);
    void insertCustomer(CustomerRegistrationRequest customer);
    boolean existsCustomerWithEmail(String email);
    boolean existsCustomerById(Integer customerId);
    void deleteCustomerById(Integer customerId);
    void updateCustomer(Integer customerId, Customer update);

    void updateCustomer(Customer update);

    Customer selectUserByEmail(String email);
    void updateCustomerProfileImageId(String profileImageId, Integer customerId);

}
