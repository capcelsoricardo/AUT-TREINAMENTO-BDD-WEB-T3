package curso.treinamento.setup;

import java.io.File;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private static WebDriver driver;
	public static ResourceBundle bundle = ResourceBundle.getBundle("project");
		
	@Before
	public void start_test(Scenario scenario) {
		
		System.setProperty("webdriver.chrome.driver", "src"+ File.separator +
				"test" + File.separator + "resources" + 	File.separator + 
				"mac" + File.separator + "chromedriver"); 
								
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(bundle.getString("env.url"));	
		driver.manage().window().fullscreen();
	}	
	
	@After
	public void tear_down(Scenario scenario) { 
		driver.close();
	}
		
	public static WebDriver get_driver() { 
		return driver;
	}

}