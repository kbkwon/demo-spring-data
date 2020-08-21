package com.github.kbkwon.demo.spring.data.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EmpUserTest {

    @Id
    private String no;

    @Column(unique = true, length = 1024, nullable = false)
    private String name;

    @Column
    private int age;

    @Column
    private String sex;

    @Column
    private int grade;

}
