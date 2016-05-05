package com.joseph.web.service.impl;

import com.joseph.web.dao.AccountRepository;
import com.joseph.web.model.Account;
import com.joseph.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joseph on 05/05/2016.
 */
@Service
public class DefaultAccountService  implements AccountService{


    @Autowired
    private  AccountRepository accountRepository;


    @Override
    public Account findByAccountLastName(String accountLastName) {
        return accountRepository.findByAccountLastName(accountLastName);
    }

    @Override
    public Account findByAccountFirstName(String accountFirstName) {
        return accountRepository.findByAccountFirstName(accountFirstName);
    }

    @Override
    public Account findByAccountFirstNameAndAccountLastName(String accountFirstName, String accountLastName) {
        return accountRepository.findByAccountFirstNameAndAccountLastName(accountFirstName,accountLastName);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account saveAccount(final Account account){
        return accountRepository.save(account);
    }
}
