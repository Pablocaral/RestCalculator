package com.uclm.restcalculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Illegal request parameter")
public class IllegalParameterException extends Exception {
    public IllegalParameterException() {
        super();
    }

    public IllegalParameterException(String msg) {
        super(msg);
    }
}