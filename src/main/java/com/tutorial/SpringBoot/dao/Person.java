package com.tutorial.SpringBoot.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String Address;
}
