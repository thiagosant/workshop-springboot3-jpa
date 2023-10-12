package com.sansoft.springcourse.services.exceptions;

import com.sansoft.springcourse.resources.exceptions.ResourceExceptionHandler;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
