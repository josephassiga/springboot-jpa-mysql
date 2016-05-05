package com.joseph.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joseph on 01/05/2016.
 */
@Entity
@Table(name = "ACCOUNT_TABLE")
public class Account implements Serializable{

    @Id
    @Column(name="ID_ACCOUNT")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="account_first_name")
    private String  accountFirstName;

    @Column(name="account_last_name")
    private String accountLastName;

    protected Account() {
    }

    public Account(String accountFirstName, String accountLastName) {
        this.accountFirstName = accountFirstName;
        this.accountLastName = accountLastName;
    }

    public Long getId() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAccountFirstName() {
        return accountFirstName;
    }

    public Account setAccountFirstName(String accountFirstName) {
        this.accountFirstName = accountFirstName;
        return this;
    }

    public String getAccountLastName() {
        return accountLastName;
    }

    public Account setAccountLastName(String accountLastName) {
        this.accountLastName = accountLastName;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountFirstName='" + accountFirstName + '\'' +
                ", accountLastName='" + accountLastName + '\'' +
                '}';
    }
}
