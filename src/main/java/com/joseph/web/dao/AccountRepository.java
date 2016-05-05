package com.joseph.web.dao;

import com.joseph.web.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by joseph on 01/05/2016.
 */

public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByAccountLastName(final String accountLastName);
    Account findByAccountFirstName(final String accountFirstName);
    Account findByAccountFirstNameAndAccountLastName(final String accountFirstName,final String accountLastName);

}
