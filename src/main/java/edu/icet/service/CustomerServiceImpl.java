package edu.icet.service;

import edu.icet.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustmerService{
    @Override
    public boolean addCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public Customer serchById(Integer id) {
        return null;
    }
}
