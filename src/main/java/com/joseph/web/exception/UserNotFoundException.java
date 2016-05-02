package com.joseph.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Created by joseph on 01/05/2016.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(String userId) {
        super("Could not found  user " + userId);
    }
}

