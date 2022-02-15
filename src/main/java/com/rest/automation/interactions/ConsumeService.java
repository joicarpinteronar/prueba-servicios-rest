package com.rest.automation.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {

    public static PostEmployee  PostEmployee(String body) {
        return Tasks.instrumented(PostEmployee.class, body);
    }
    public static GetEmployee  GetEmployee() {
        return Tasks.instrumented(GetEmployee.class);
    }

    public static GetIdEmployee  GetIdEmployee(int idEmployee) {
        return Tasks.instrumented(GetIdEmployee.class, idEmployee);
    }

    public static DeleteEmployee  DeleteEmployee() {
        return Tasks.instrumented(DeleteEmployee.class);
    }
}
