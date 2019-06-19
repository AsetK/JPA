package com.epam.jpa.jpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="department")
public class Department {
    @Id
    int departmentID;

    @Column(name="name")
    String name;

    @Column(name="head_id")
    int headID;

    @ManyToMany
    @JoinTable(name = "user_department", joinColumns = {@JoinColumn(name = "department_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> userSet = new HashSet<User>();

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeadID() {
        return headID;
    }

    public void setHeadID(int headID) {
        this.headID = headID;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
