package com.gaurav.gaurav_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Laptop {

    @Id
    private Long id;

    private String name;
    private String brand;

//    @ManyToOne
//    private Student student;

}
