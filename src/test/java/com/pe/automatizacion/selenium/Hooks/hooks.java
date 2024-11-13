package com.pe.automatizacion.selenium.Hooks;

import com.pe.automatizacion.selenium.utils.Constant;
import com.pe.automatizacion.selenium.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

    private Scenario scenario;

    @After
    public void closeDriver(){
        System.out.println("CLOSE DRIVER");
    }

    @Before
    public void setScenario(Scenario scenario){
        this.scenario=scenario;
        Utils.saveVariablesOnSession(Constant.SCENARIO,this.scenario);
    }

    @AfterStep
    public void screenshot(){
        Utils.screenShotAddCucumber();
    }
}
