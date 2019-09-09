package curso.treinamento.steps;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
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
	public void faço_login_com_o_usuário_e_senha(String user, String pass) {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(
				By.xpath("//a[@href='https://www.phptravels.net/admin/logout']")).isDisplayed());
	
	}



}
