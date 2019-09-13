package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (name = "email")
	private WebElement campoEmail;
	
	@FindBy (name = "password")
	private WebElement campoSenha;
	
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement btnLogin;
	
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
