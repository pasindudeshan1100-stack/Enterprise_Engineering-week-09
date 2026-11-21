package edu.icet.service.Impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustmerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustmerService {

    final CustomerRepository customerRepository;

    @Override
    public boolean addCustomer(Customer customer) {
        ModelMapper modelMapper=new ModelMapper();
        CustomerEntity customerEntity=modelMapper.map(customer, CustomerEntity.class);
        customerRepository.save(customerEntity);
        return true;
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
