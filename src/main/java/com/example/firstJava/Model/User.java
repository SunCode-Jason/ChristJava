package com.example.firstJava.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private int age;

    public User() {
        super();
    }

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

}
