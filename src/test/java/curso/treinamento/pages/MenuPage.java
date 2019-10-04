package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;

public class MenuPage {
	
	public MenuPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	public void clicar_menu(String menu) { 
		WebElement linkMenu = Hooks.get_driver().findElement(By.xpath("//a[@href='#" + menu +"']"));
		linkMenu.click();			
	}
	
	public boolean validar_submenu(String menu, String submenu) {
		
		return Helper.elemento_existe(Hooks.get_driver().findElement(By.xpath("//a[@href='#" + menu +"']//following::a[text()='"+ submenu+"']")), 10);
		
	}
	
	public void clicar_submenu(String menu, String submenu) { 
		WebElement linkSubMenu = Hooks.get_driver().findElement(By.xpath("//a[@href='#" + menu +"']//following::a[text()='"+ submenu+"']"));
		linkSubMenu.click();		
	}
}