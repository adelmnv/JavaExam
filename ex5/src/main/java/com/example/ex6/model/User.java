package com.example.ex6.model;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;


}
