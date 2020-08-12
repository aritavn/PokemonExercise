package com.pokemon.api.model;

public class ErrorHandler {

    private String errorMessage;

    public ErrorHandler() {
        this.errorMessage = "";
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
