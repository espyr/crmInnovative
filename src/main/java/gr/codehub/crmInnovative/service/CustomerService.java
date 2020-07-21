package gr.codehub.crmInnovative.service;

import gr.codehub.crmInnovative.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer addCustomer(Customer customer);
    boolean deleteCustomer(int customerIndex);
}
