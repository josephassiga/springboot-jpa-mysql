package com.joseph.web.service;

import com.joseph.web.model.Account;

import java.util.List;

/**
 * Created by joseph on 05/05/2016.
 */
public interface AccountService {


    Account findByAccountLastName(final String accountLastName);
    Account findByAccountFirstName(final String accountFirstName);
    Account  saveAccount(final Account account);
    Account findByAccountFirstNameAndAccountLastName(final String accountFirstName,final String accountLastName);
    List<Account> findAllAccount();
}
