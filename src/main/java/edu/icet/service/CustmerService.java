package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustmerService {
    boolean addCustomer(Customer customer);
    List<Customer> getAll();
    boolean deleteById(Integer id);
    Customer serchById(Integer id);
}
