package com.joseph.web.controller;

import com.joseph.web.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joseph on 01/05/2016.
 */
@RestController
public class BootRestController
{

    @RequestMapping(value = "/user")
    public  Person show(final Model model)
    {
         return new Person("SEVERIN","ASSSIGA");
    }

}
