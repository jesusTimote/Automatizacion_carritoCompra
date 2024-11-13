package com.pe.automatizacion.selenium.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class carritoCompraPage extends PageObject {

    @FindBy(id = "input-firstname")
    public WebElementFacade Lbl_InputName;

    @FindBy(id = "input-lastname")
    public WebElementFacade Lbl_InputLastName;

    @FindBy(id = "input-email")
    public WebElementFacade Lbl_InputEmail;

    @FindBy(id="input-telephone")
    public WebElementFacade Lbl_InputPhoneNumber;

    @FindBy(id="input-password")
    public WebElementFacade Lbl_InputPassword;

    @FindBy(id="input-confirm")
    public WebElementFacade Lbl_InputConfirmPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElementFacade Lbl_Btn_submit;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElementFacade chck_PrivacyPolity;

    @FindBy(xpath = "//h1[contains(text(),'Account')]")
    public WebElementFacade Lbl_validateTitle;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
    public WebElementFacade Lbl_success;

    @FindBy(xpath = "//a[contains(text(),'Your Store')]")
    public WebElementFacade Lbl_principal;

    @FindBy(xpath = "//div[@class='button-group']/button/span[@class='hidden-xs hidden-sm hidden-md']")
    public  WebElementFacade Btn_AddCart;

    @FindBy(xpath = "//div[@id='cart']")
    public WebElementFacade Btn_ListCart;

    @FindBy(xpath = "//strong[contains(text(),' View Cart')]")
    public WebElementFacade Lbl_ViewCart;

    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    public WebElementFacade Btn_checkout;

    @FindBy(xpath = "//input[@name='account' and  @value='guest']")
    public WebElementFacade Check_accountGuest;

    @FindBy(xpath = "//input[@id='button-account']")
    public WebElementFacade Btn_account;

    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    public WebElementFacade input_firstName;

    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    public WebElementFacade input_lastName;

    @FindBy(xpath = "//input[@id='input-payment-email']")
    public WebElementFacade input_email;

    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    public WebElementFacade input_phoneNumber;

    @FindBy(xpath = "//input[@id='input-payment-company']")
    public WebElementFacade input_company;

    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    public WebElementFacade input_address1;

    @FindBy(xpath = "//input[@id='input-payment-address-2']")
    public WebElementFacade input_address2;

    @FindBy(xpath = "//input[@id='input-payment-city']")
    public WebElementFacade input_paymentCity;

    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    public WebElementFacade input_postcode;

    @FindBy(xpath = "//select[@id='input-payment-country']")
    public WebElementFacade input_country;

    @FindBy(xpath = "//select[@id='input-payment-zone']")
    public WebElementFacade input_region;

    @FindBy(xpath = "//input[@id='button-guest']")
    public WebElementFacade Btn_registarInvitado;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElementFacade Btn_payment_method;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElementFacade confirmarOrden;

    @FindBy(xpath = "//h1[contains(text(),'Your order has been placeddd!')]")
    public WebElementFacade Lbl_succes_Order;
}
