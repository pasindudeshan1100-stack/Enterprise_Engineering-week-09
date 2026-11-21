package edu.icet.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String name;
    private Integer age;
    private String adress;
    private String phoneNumber;
    private String email;
}
