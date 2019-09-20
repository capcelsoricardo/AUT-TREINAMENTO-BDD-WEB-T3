package curso.treinamento.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;

public class Helper {

	public static void aguardar_elemento(WebElement elemento, int timeout) { 
		
		WebDriverWait aguardar = new WebDriverWait(Hooks.get_driver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));
					
	}
			
	public static boolean elemento_existe(WebElement elemento, int timeout) { 
		
		aguardar_elemento(elemento, timeout);
		
		return elemento.isDisplayed();
		
	}
}
