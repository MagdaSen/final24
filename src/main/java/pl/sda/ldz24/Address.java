package pl.sda.ldz24;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address extends BaseEntity {

    private String country;
    private String city;
    private String street;
    private String zipcode;
}
