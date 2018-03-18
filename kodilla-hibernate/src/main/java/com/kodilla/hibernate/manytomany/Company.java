package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Company.searchCompanyByElement",
        query = "FROM Company WHERE COMPANY_NAME LIKE CONCAT(CONCAT('%',:KEY_TEKST),'%')"
)

@NamedNativeQuery(
        name = "Company.retrieveCompanyByThreeChar",
        query = "SELECT * FROM COMAPNIES "+
                "WHERE SUBSTR(COMPANY_NAME FROM 1 FOR 3) LIKE :THIS_COMPANY_NAME",
        resultClass = Company.class
)

@Entity
@Table(name = "COMAPNIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column (name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column (name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany (cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
