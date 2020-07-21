package gr.codehub.crmInnovative.repository;

import gr.codehub.crmInnovative.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//opou zhtaw repository tha mou dinei
@Repository
//JpaRepository=etoimo repo pou sundeetai me thn h2 bash
//entyty=customer, primary key tou =String
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
