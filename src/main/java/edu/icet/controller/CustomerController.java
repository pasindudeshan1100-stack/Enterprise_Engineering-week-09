package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    final CustmerService service;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);

    }
    @GetMapping("/get-all")
    public List<Customer>getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return service.deleteById(id);
    }
    @GetMapping("/search-by-id/{id}")
    public Customer searchById(@PathVariable Integer id){
        return service.serchById(id);
    }
}
