package com.pe.automatizacion.selenium.utils;

import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;

import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

    private EnvironmentVariables environmentVariables;
    private static Scenario scenario;

    public static void saveVariablesOnSession(String key,Object value){
        Serenity.setSessionVariable(key).to(value);

    }

    public static <T> T getVariablesOnSession(String key){
        return (T) Serenity.sessionVariableCalled(key);
    }

    public static void screenShotAddCucumber(){
        scenario=Utils.getVariablesOnSession(Constant.SCENARIO);
        byte[] evidence= ((TakesScreenshot) Serenity.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(evidence,"image/png","evidence");
    }


}
