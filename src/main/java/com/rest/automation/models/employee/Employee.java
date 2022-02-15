package com.rest.automation.models.employee;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

public class Employee {

    @Setter @Getter
    private int id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private int salary;
    @Setter @Getter
    private int age;
    @Setter @Getter
    private String status;
    @Setter @Getter
    private String message;
    @Setter @Getter
    private int estado;

    public Employee(int id, String name, int salary, int age, String status, String message, int estado) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.status = status;
        this.message = message;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "{" +
                "\"name\": \"" + name + "\"," +
                "\"salary\":" + salary+ RandomStringUtils.randomNumeric(3) + "," +
                "\"age\":" + age +
                "}";
    }
}
