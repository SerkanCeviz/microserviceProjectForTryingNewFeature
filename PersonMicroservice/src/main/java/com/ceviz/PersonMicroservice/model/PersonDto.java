package com.ceviz.PersonMicroservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto implements Serializable {

    private UUID id;

    private String identificationNumber;

    private String name;

    private String surname;

    private BigDecimal salary;

    private String adress;

    private String phoneNumber;

    private RoleDto role;

    private DepartmentDto department;
}