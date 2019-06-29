package pl.sda.jdbcjpa;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter //opcjonalne - hibernate poradzi sobie bez setterów i getterów
@Setter
@ToString(exclude = "transientField")
@Entity //must have
@Table(name = "Customers") //opcjonalne -> zmiana nazwy tabeli
public class Customer {

    @Id //must have
    @GeneratedValue(strategy = GenerationType.AUTO) //must have
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Integer age; //int Integer

    private String pesel;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = Lists.newArrayList();

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)  // zapisujemy wartosc "słowną" enuma
    private CustomerStatus customerStatus;

    @ElementCollection
    private Set<String> nickname = new HashSet<String>();

    @OneToOne(mappedBy = "customer")
    private Cart cart;

    @Transient //to nie bedzie sie zapisywac
    private String transientField;
}
//POJO plain old java object
