package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class VisualizacaoMenuSteps {
	
	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
		System.out.println("teste");
	  
	}

	@Quando("acesso o menu Cars")
	public void acesso_o_menu_Cars() {
	 
	}

	@Então("são apresentados os itens {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String string, String string2, String string3) {

	}


}
