package com.rest.automation.tasks;

import com.rest.automation.interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteEmployeeRest implements Task {

    public static DeleteEmployeeRest with() {
        return Tasks.instrumented(DeleteEmployeeRest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.DeleteEmployee());
    }
}
