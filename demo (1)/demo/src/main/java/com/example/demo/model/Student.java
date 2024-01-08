package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    Integer id;

    String name;

    String lastname;

    Integer age;

    String phone;

    String studentStatus;

    String subscriptionStatus;


}
