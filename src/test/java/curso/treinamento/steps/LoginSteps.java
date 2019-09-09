package curso.treinamento.steps;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	public WebDriver driver;
	
	@Dado("que eu deseje realizar login")
	public void que_eu_deseje_realizar_login() {

		System.setProperty("webdriver.chrome.driver", "src"+ File.separator +"test" + 
		File.separator + "resources" + 	File.separator + "mac" + File.separator + "chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/admin");
		
		
		
	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faço_login_com_o_usuário_e_senha(String string, String string2) {

	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() {
	
	}



}
