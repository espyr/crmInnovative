package gr.codehub.crmInnovative.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// antistoixh kathe pedio me 1 column kai ftiaxnei pinaka Customer
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private int age;
    private Date date;

    public Customer(String name) {
        this.name = name;
    }
}

