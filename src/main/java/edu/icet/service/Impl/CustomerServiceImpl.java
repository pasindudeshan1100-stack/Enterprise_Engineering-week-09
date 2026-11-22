package edu.icet.service.Impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustmerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
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
        Iterable<CustomerEntity> all=customerRepository.findAll();
        ArrayList<Customer>customerArrayList=new ArrayList<>();
        all.forEach(customerEntity ->customerArrayList.add(new ModelMapper().map(customerEntity, Customer.class)) );
        return  customerArrayList;
    }

    @Override
    public boolean deleteById(Integer id) {
        customerRepository.deleteById(id);
        return true;
    }

    @Override
    public Customer serchById(Integer id) {
        return new ModelMapper().map(customerRepository.findById(id),Customer.class);
    }
}
