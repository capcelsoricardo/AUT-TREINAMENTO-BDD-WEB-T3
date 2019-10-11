package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import curso.treinamento.utils.Helper;

public class AddAdminPage {
	
	public AddAdminPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (xpath = "//div[text()='Add Admin']")
	private WebElement tituloPagina;
	
	@FindBy(name = "fname")
	private WebElement cmpFirstName;
	
	@FindBy(name = "lname")
	private WebElement cmpLastName;
	
	@FindBy(name = "email")
	private WebElement cmpEmail;

	@FindBy(name = "password")
	private WebElement cmpPassword;
	
	@FindBy(name = "mobile")
	private WebElement cmpMobile;
	
	@FindBy(name = "country")
	private WebElement comboBoxCountry;
	
	@FindBy(name = "address1")
	private WebElement cmpAddress1;
	
	@FindBy(name = "address2")
	private WebElement cmpAddress2;
	
	@FindBy(name = "status")
	private WebElement comboBoxStatus;
	
	public void preencher_first_name(String firstName) { 
		cmpFirstName.sendKeys(firstName);
	}
	
	public void preencher_last_name(String lastName) { 
		cmpLastName.sendKeys(lastName);
	}
	
	public void preencher_email(String email) { 
		cmpEmail.sendKeys(email);
	}

	public void preencher_password(String password) { 
		cmpPassword.sendKeys(password);
	}

	public void preencher_mobile(String mobile) { 
		cmpMobile.sendKeys(mobile);
	}
	
	public void selecionar_country(String country) { 
		Select comboBox = new Select(comboBoxCountry);
		comboBox.selectByVisibleText(country);

		//new Select(comboBoxCountry).selectByValue(country);
	}
	
	public void preencher_campo_address1(String address1) {
		cmpAddress1.sendKeys(address1);
	}
	
	public void preencher_campo_address2(String address2) {
		cmpAddress2.sendKeys(address2);
	}
	
	
	public void selecionar_status(String status) { 
		Select comboBox = new Select(comboBoxStatus);
		comboBox.selectByValue(status);

		//new Select(comboBoxStatus).selectByValue(status);
	}
	
	
	public boolean validar_pagina() { 
		return Helper.elemento_existe(tituloPagina, 10);
	}	
}