package com.manoriega.batchpersona.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identification;

    private String lastName;

    private String surName;

    private String firstName;
    private String middleName;

    private String roomPhone;

    private String cellPhone;

    private String birthday;

    private String civilStatus;

    private String gender;

    private String primaryEmail;

    private String secondaryEmai;

    private String childNumberl;

    private String address;

    private String avenue;

    private String building;

    private String floor;

    private String apartament;

    private String neighborhood;

    private String postalCode;

    private String bloodType;

    private String added;

    private String identificationType;

    private String gradeAcademy;

    private Integer age;

    private Double weight;

    private Double height;

    private Integer leftHand;

    private String profession;

}
