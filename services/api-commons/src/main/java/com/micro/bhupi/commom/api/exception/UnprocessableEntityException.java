package com.micro.bhupi.commom.api.exception;

import javax.ws.rs.ClientErrorException;

public class UnprocessableEntityException extends ClientErrorException {

    private static final int STATUS = 422;

    public UnprocessableEntityException() {
        super(STATUS);
    }

    public UnprocessableEntityException(String message) {
        super(message, STATUS);
    }

    public UnprocessableEntityException(Throwable cause) {
        super(STATUS, cause);
    }

    public UnprocessableEntityException(String message, Throwable cause) {
        super(message, STATUS, cause);
    }
}
