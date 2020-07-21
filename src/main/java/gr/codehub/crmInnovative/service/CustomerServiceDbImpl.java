package gr.codehub.crmInnovative.service;

import gr.codehub.crmInnovative.model.Customer;
import gr.codehub.crmInnovative.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CustomerServiceDbImpl implements CustomerService {

    @Autowired
    //create a new obj type CustomerRepository and it will do auto injection to var customerRepository
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(int customerIndex) {
        customerRepository.deleteById(customerIndex);
        return true;
    }
}
