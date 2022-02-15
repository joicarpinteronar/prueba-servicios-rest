package com.rest.automation.utils.enums;

public enum RestServices {

    CREATE_EMPLOYEE("/api/v1/create"),
    CONSULT_EMPLOYEE("/api/v1/employees"),
    CONSULT_A_EMPLOYEE("/api/v1/employee/"),
    DELETE_EMPLOYEE("/api/v1/delete/");


    private final String uri;

    RestServices(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }

}
