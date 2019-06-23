package pl.sda.kurs.JDBC_HIBERNATE.sobota_22_06_2019;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity //must have
public class Customer {
    @Id //must have
    @GeneratedValue(strategy = GenerationType.AUTO) //must have
    private Integer id;

    private String firstName;
    private String lastName;
    private Integer age; //int Integer
    private String city;
    private String postalCode;

    @Transient //to nie bedzie sie zapisywac
    private String string;


}
//POJO plain old java object
