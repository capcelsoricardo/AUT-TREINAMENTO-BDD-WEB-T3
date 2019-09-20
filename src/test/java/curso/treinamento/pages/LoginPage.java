package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;

public class LoginPage {
	
	public LoginPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement campoEmail;
	
	@FindBy (name = "password")
	private WebElement campoSenha;
	
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy (xpath = "//span[text()='Remove Frame']")
	private WebElement linkRemoveFrame;
	
	@FindBy (xpath = "//strong[text()='Login Panel']")
	private WebElement tituloPagina;
	
	
	public Boolean validar_pagina() { 
				
		return Helper.elemento_existe(tituloPagina, 10);
	}
	
	public void clicar_btn_remove_frame() throws InterruptedException {
		
		if (Helper.elemento_existe(linkRemoveFrame, 10))
			linkRemoveFrame.click();
	}
	
	
	public void preencher_email(String email) {
		
		campoEmail.sendKeys(email);
	}
	
	public void preencher_senha(String senha) { 
		campoSenha.sendKeys(senha);		
	}
	
	public void clicar_btn_login() {
		btnLogin.click();
	}
}
