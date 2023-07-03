package com.phoneShopping.phone.Controller;


import com.phoneShopping.phone.Model.Customer;
import com.phoneShopping.phone.Model.Product;
import com.phoneShopping.phone.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins  ="*",allowedHeaders = "*")
@RestController
@RequestMapping("/customer")




public class customerController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/list")
    public List<Customer> getcustomer(){
        return customerRepo.findAll();
    }


    @PostMapping("/save")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepo.save(customer);
    }

    @PutMapping(value ="/update/{cust_id}")
    public String updatecustomer(@PathVariable Long cust_id,@RequestBody Customer customer){
        Customer updatetedCustomer=customerRepo.findById(cust_id).get();
        updatetedCustomer.setMobile(customer.getMobile());
        updatetedCustomer.setAddres(customer.getAddres());
        updatetedCustomer.setFirst_name(customer.getFirst_name());
        updatetedCustomer.setLast_name(customer.getLast_name());
        updatetedCustomer.setPassword(customer.getPassword());
        customerRepo.save(updatetedCustomer);
        return "updated";




    }
    @DeleteMapping(value = "/delete/{cust_id}")
    public String deleteCustomer(@PathVariable Long cust_id) {
        Customer deleteCustomer = customerRepo.findById(cust_id).get();
        customerRepo.delete(deleteCustomer);
        return "delete";

    }


    @GetMapping("/getbyId/{cust_id}")
            public Optional<Customer> getCustomer (@PathVariable Long cust_id){
            return customerRepo.findById(cust_id);

    }


}





