package curso.treinamento.utils;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import curso.treinamento.setup.Hooks;
import io.cucumber.datatable.DataTable;

public class Helper {
	
	public static List<Map<String, String>> listDataTable; 

	public static void aguardar_elemento(WebElement elemento, int timeout) { 
		
		WebDriverWait aguardar = new WebDriverWait(Hooks.get_driver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));
					
	}
			
	public static boolean elemento_existe(WebElement elemento, int timeout) { 
		
		try {			
			aguardar_elemento(elemento, timeout);
			
			return true;			
			
		} catch (Exception e) {
			System.out.println("O elemento não foi encontrado. Veja exceção abaixo:");
			System.out.println(e.getMessage());
			return false;
		}		
	}
	
	public static void create_datatable(DataTable dataTable_) { 
		listDataTable = dataTable_.asMaps(String.class, String.class);
	}
}
