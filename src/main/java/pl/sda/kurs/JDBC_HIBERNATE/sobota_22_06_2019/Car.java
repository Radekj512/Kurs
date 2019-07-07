package pl.sda.kurs.JDBC_HIBERNATE.sobota_22_06_2019;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;
}
