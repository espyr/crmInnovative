package gr.codehub.crmInnovative.controller;

import gr.codehub.crmInnovative.model.Customer;
import gr.codehub.crmInnovative.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrmController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("hello")
    public String getHello() {
        return "<b>Hello</b>";
    }

    @RequestMapping("customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping("add/{name}")
    public Customer addCustomers(@PathVariable String name) {
        return customerService.addCustomer(new Customer(name));
    }

    @PostMapping("addcustomer")
    public Customer addCustomerAllDetails(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("remove/{id}")
    public boolean deleteCustomers(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }

}
