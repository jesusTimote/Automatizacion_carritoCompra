package com.pe.automatizacion.selenium.Steps;

import com.pe.automatizacion.selenium.Page.carritoCompraPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;



public class carritoSteps {
    carritoCompraPage carritoPage;

    @Steps(shared = true)
    PageObject urls;

    @Step("Navegar sitio Web")
    public void navigateTo(String url){
        urls.setDefaultBaseUrl(url);
        urls.open();
    }

    @Step("Validar Pagina Principal")
    public Boolean validacioPagePrincipal(){
        return carritoPage.Lbl_validateTitle.isDisplayed();
    }

    @Step("Registro de un nuevo Usuario")
    public void RegistroUsuario(String username,String lastname,String email,String phoneNumber,String password){
        carritoPage.Lbl_InputName.sendKeys(username);
        carritoPage.Lbl_InputLastName.sendKeys(lastname);
        carritoPage.Lbl_InputEmail.sendKeys(email);
        carritoPage.Lbl_InputPhoneNumber.sendKeys(phoneNumber);
        carritoPage.Lbl_InputPassword.sendKeys(password);
        carritoPage.Lbl_InputConfirmPassword.sendKeys(password);
    }

    @Step("Guardo el nuevo registro de Usuario")
    public void guardoRegistroUsuario(){
        carritoPage.chck_PrivacyPolity.click();
        carritoPage.Lbl_Btn_submit.click();

    }
    @Step("Validar Registro exito")
    public  void ValidarRegistroExitoso(){
        carritoPage.Lbl_success.isDisplayed();
    }


    @Step("Valido que estoy en la pagina principal")
    public void ValidarPaginaPrincipal(){
        carritoPage.Lbl_principal.isDisplayed();
    }

    @Step("Agregar productos en el carrito de compra")
     public void AgregarProductos(int quantity){
        for(int i=0; i<quantity;i++){
            carritoPage.Btn_AddCart.click();
        }
    }

    @Step("Dar click en ver Carrito")
    public void VerCarrito(){
        carritoPage.Btn_ListCart.click();

    }
    @Step("Ver detalle del carrito")
    public void VerDetalleCarrito(){
        carritoPage.Lbl_ViewCart.click();
    }

    @Step("ContinuarCompra")
    public void ContinuarCompra(){
        carritoPage.Btn_checkout.click();
    }
    @Step("Agreagr cuenta de invitado")
    public void CuentaInvitado(){
        carritoPage.Check_accountGuest.click();
    }
    @Step("Agreagr cuenta de invitado")
    public void ContinuarCuentaInvitado(){
        carritoPage.Btn_account.click();
    }

    @Step("Registrar cuenta de invitado")
    public void CuentaInvitado(String nombre, String apellido, String correo, String telefono){
        carritoPage.input_firstName.sendKeys(nombre);
        carritoPage.input_lastName.sendKeys(apellido);
        carritoPage.input_email.sendKeys(correo);
        carritoPage.input_phoneNumber.sendKeys(telefono);
    }

    @Step("Registrar cuenta invitado 2")
    public void CuentaInvitado2(String company, String address1, String address2, String city, String postcode, String country, String region){
        carritoPage.input_company.sendKeys(company);
        carritoPage.input_address1.sendKeys(address1);
        carritoPage.input_address2.sendKeys(address2);
        carritoPage.input_paymentCity.sendKeys(city);
        carritoPage.input_postcode.sendKeys(postcode);
        carritoPage.input_country.selectByVisibleText(country);
        carritoPage.input_region.selectByVisibleText(region);
        carritoPage.Btn_registarInvitado.click();
        carritoPage.chck_PrivacyPolity.click();
        carritoPage.Btn_payment_method.click();
        carritoPage.confirmarOrden.click();
    }
    @Step("Validar orden de compra")
    public Boolean ValidarOrden(){
     return carritoPage.Lbl_succes_Order.isDisplayed();
    }



}
