package com.joseph.web.config;

import com.joseph.web.dao.AccountRepository;
import com.joseph.web.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.joseph.web.controller,com.joseph.web.model,com.joseph.web.exception"})
@EnableJpaRepositories(basePackageClasses = AccountRepository.class)
@EntityScan(basePackageClasses = Account.class)
public class SpringMvcApplication {



    public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}


}
