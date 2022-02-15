package com.rest.automation.tasks;

import com.rest.automation.interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class ConsultEmployeesRest implements Task {

    public static ConsultEmployeesRest with() {
        return Tasks.instrumented(ConsultEmployeesRest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.GetEmployee());
    }
}
