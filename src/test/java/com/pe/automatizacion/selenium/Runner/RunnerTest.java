package com.pe.automatizacion.selenium.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","json:target/build/cucumber.json"},
        glue = {"com.pe.automatizacion.selenium.StepDefinitions","com.pe.automatizacion.selenium.Hooks"},
        features = "src/test/resources/features",
        tags = "@Carrito"

)
public class RunnerTest {


}
