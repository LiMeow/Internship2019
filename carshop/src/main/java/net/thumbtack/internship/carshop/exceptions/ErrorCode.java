package net.thumbtack.internship.carshop.exceptions;

public enum ErrorCode {

    CAR_NOT_EXISTS("", "Car with id '%s' not exists."),
    EMPTY_REQUEST_BODY("json", "Empty request body."),
    INTERNAL_SERVER_ERROR("", "'%s'"),
    REQUEST_NOT_FOUND("", "Customer with id '%s' not found."),
    TRANSACTION_NOT_EXISTS("transactionId","Transaction with id '%s' not exists" ),
    USER_ALREADY_EXISTS("username", "User with username '%s' already exists."),
    USER_NOT_FOUND("username", "User with username '%s' not found."),
    USER_NOT_EXISTS("id", "User with id '%s' not exists."),
    WRONG_OR_EMPTY_REQUEST("json", "Wrong or empty request"),
    WRONG_PASSWORD("password", "Wrong password."),
    WRONG_URL("url", "Wrong URL");


    private String field;
    private String message;

    ErrorCode() {
    }

    private ErrorCode(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }

}