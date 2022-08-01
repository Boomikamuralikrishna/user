package com.mytry.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class user {
@Id
    private String name;
    private String email;
    private String address;
    private String phone;
    private Integer Id;

    public user(Integer id, String name, String phone, String email, String address){

    }

    public user(String name, String email, String address, String phone, Integer id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.Id = id;
    }

    public Integer getId() {

        return Id;
    }

    public void setId(Integer id) {

        Id = id;
    }

    public String getName() {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", Id=" + Id +
                '}';
    }
}
