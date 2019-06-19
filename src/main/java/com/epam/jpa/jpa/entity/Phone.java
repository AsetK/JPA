package com.epam.jpa.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    int phoneID;

    @Column(name="type")
    String type;

    @Column(name="value")
    String value;

    @Column(name="user_id")
    int userID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
