package com.abdulrahman.ems.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ErrorResponse {

    private String error;
    private String message;
    private List<String> details;

    // Constructor for simple error with message
    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    // Constructor for more complex errors with multiple details
    public ErrorResponse(String error, List<String> details) {
        this.error = error;
        this.details = details;
    }


}
