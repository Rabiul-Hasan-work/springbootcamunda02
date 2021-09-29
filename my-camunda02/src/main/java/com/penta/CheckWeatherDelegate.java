package com.penta;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Random;

@Named
public class CheckWeatherDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {

        Random rando =new Random();

        execution.setVariable("name","Naim");
        execution.setVariable("weatherOk",rando.nextBoolean());
    }
}
