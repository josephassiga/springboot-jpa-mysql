package com.joseph.web.controller;

import com.joseph.web.form.AccountForm;
import com.joseph.web.model.Account;
import com.joseph.web.service.AccountService;
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

    @Autowired
    private AccountService accountService;


    @RequestMapping(value="/account",method = RequestMethod.GET)
    public String createAccount(final Model model)
    {
        model.addAttribute("accountForm",new AccountForm());
        return "account";
    }

    @RequestMapping(value="/account",method = RequestMethod.POST)
    public String createAccount(final Model model,final AccountForm accountForm)
    {
        final Account account = new Account(accountForm.getAccountFirstName(),accountForm.getAccountLastName());
        final Account accounCreated = accountService.saveAccount(account);
        final List<Account> accounts = accountService.findAllAccount();
        model.addAttribute("accounts",accounts);
        model.addAttribute("accountForm",new AccountForm());
        return "account";
    }
}


