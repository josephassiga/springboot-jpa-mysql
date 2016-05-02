package com.joseph.web.controller;

import com.joseph.web.dao.AccountRepository;
import com.joseph.web.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by joseph on 02/05/2016.
 */
@Controller
public class BootController {

    private final AccountRepository accountRepository;

    @Autowired
    public BootController(final AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value="/account",method = RequestMethod.GET)
    public String createAccount(final Model model)
    {
        model.addAttribute("account",new Account());
        return "account";
    }

    @RequestMapping(value="/account",method = RequestMethod.POST)
    public String createAccount(final Model model,final Account account)
    {
        final Account accounCreated = accountRepository.save(account);
        final List<Account> accounts = accountRepository.findAll();
        model.addAttribute("accounts",accounts);
        model.addAttribute("account",new Account());
        return "account";
    }
}


