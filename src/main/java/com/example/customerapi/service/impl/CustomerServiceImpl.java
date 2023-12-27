package com.example.customerapi.service.impl;

import com.example.customerapi.model.Customer;
import com.example.customerapi.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> selectAllCustomers() {
        return null;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer customerId) {
        return Optional.empty();
    }

    @Override
    public void insertCustomer(Customer customer) {

    }

    @Override
    public boolean existsCustomerWithEmail(String email) {
        return false;
    }

    @Override
    public boolean existsCustomerById(Integer customerId) {
        return false;
    }

    @Override
    public void deleteCustomerById(Integer customerId) {

    }

    @Override
    public void updateCustomer(Customer update) {

    }

    @Override
    public Optional<Customer> selectUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public void updateCustomerProfileImageId(String profileImageId, Integer customerId) {

    }
}
