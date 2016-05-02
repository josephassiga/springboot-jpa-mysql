package com.joseph.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joseph on 01/05/2016.
 */
@Entity
@Table(name = "ACCOUNT_DERBY_TABLE")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="account_first_name")
    public String  accountFirstName;

    @Column(name="account_last_name")
    public String accountLastName;

    public Account() {
    }

    public Account(final String accountFirstName, final String accountLastName) {
        this.accountFirstName = accountFirstName;
        this.accountLastName = accountLastName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountFirstName='" + accountFirstName + '\'' +
                ", accountLastName='" + accountLastName + '\'' +
                '}';
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
}
