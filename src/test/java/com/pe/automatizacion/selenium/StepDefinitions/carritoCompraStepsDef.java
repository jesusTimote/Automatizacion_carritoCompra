package com.pe.automatizacion.selenium.StepDefinitions;

import com.pe.automatizacion.selenium.Steps.carritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.Assert;


public class carritoCompraStepsDef {

    @Steps
    carritoSteps carritoStep;
    EnvironmentVariables environmentVariables;

    @Given("que estoy en la pagina de registro")
    public void que_estoy_en_la_pagina_de_registro() {
        String url= EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("carrito.web.register.url");
        carritoStep.navigateTo(url);
    }

    @And("valido que estoy en la pagina de registro")
    public void validoLaPaginaRegistro() {
        Assert.assertTrue("Elemento no Encontrado",carritoStep.validacioPagePrincipal());
    }

    @Then("ingreso un {string}, {string}, {string}, {string}, {string}")
    public void registroDatosUsuario(String username, String lasname, String email, String phoneNumber, String password) {
      carritoStep.RegistroUsuario(username,lasname,email,phoneNumber,password);
    }

    @Then("registro el nuevo usuario")
    public void registroElNuevoUsuario() {
        carritoStep.guardoRegistroUsuario();
        carritoStep.ValidarRegistroExitoso();
    }


    @And("valido que estoy en la pagina principal")
    public void validoQueEstoyEnLaPaginaPrincipal() {
        String url= EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("carrito.web.principal.url");
        carritoStep.navigateTo(url);

    }

    @And("agrego los productos al carrito")
    public void agregoLosProductosAlCarrito() {
        carritoStep.ValidarPaginaPrincipal();
        carritoStep.AgregarProductos(2);
    }

    @And("selecciono el detalle del carrito")
    public void seleccionoElDetalleDelCarrito() {
        carritoStep.VerCarrito();
    }

    @And("le doy click en ver carrito")
    public void leDoyClickEnVerCarrito() {
        carritoStep.VerDetalleCarrito();
    }

    @Then("valido los productos en el carrito")
    public void validoLosProductosEnElCarrito() {
        carritoStep.ContinuarCompra();
    }

    @And("continuo con la compra")
    public void continuoConLaCompra() {
        carritoStep.CuentaInvitado();
    }

    @And("selecciono cuenta como invitado")
    public void seleccionoCuentaComoInvitado() {
        carritoStep.ContinuarCuentaInvitado();
    }

    @Then("ingreso los datos de la cuenta invitado {string},{string},{string},{string}")
    public void ingresoLosDatosDeLaCuentaInvitado(String nombre, String apellido, String correo, String telefono) {
        carritoStep.CuentaInvitado(nombre,apellido,correo,telefono);
    }

    @And("continuo ingresando los demas datos {string},{string},{string},{string},{string},{string},{string}")
    public void continuoIngresandoLosDemasDatos(String company, String address1, String address2, String city, String postcode, String country, String region) {
        carritoStep.CuentaInvitado2(company,address1,address2,city,postcode,country,region);
    }
    @Then("valido los estados de compra realizada")
    public void validoLosEstadosDeCompraRealizada() {
        Assert.assertTrue("No se encontro la validacio",carritoStep.ValidarOrden());
    }
}
