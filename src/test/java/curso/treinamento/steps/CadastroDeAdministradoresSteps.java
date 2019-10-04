package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;

public class CadastroDeAdministradoresSteps {
	
	MenuPage menuPage = new MenuPage(Hooks.get_driver());
	
	
	
	@Dado("que eu esteja na tela Admins Management")
	public void que_eu_esteja_na_tela_Admins_Management() {
		menuPage.clicar_menu("ACCOUNTS");
		menuPage.clicar_submenu("ACCOUNTS", "Admins");
	}

	@Quando("incluo um administrador")
	public void incluo_um_administrador(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	}

	@Então("administrador cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso() {

	}



}
