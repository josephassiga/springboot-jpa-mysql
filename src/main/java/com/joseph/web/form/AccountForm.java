package com.joseph.web.form;

/**
 * Created by joseph on 05/05/2016.
 */
public class AccountForm {

    private String accountFirstName;

    private String accountLastName;



    public String getAccountFirstName() {
        return accountFirstName;
    }

    public AccountForm setAccountFirstName(String accountFirstName) {
        this.accountFirstName = accountFirstName;
        return this;
    }

    public String getAccountLastName() {
        return accountLastName;
    }

    public AccountForm setAccountLastName(String accountLastName) {
        this.accountLastName = accountLastName;
        return this;
    }
}
