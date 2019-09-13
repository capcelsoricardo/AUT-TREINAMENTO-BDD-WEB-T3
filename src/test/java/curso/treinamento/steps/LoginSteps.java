package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage(Hooks.get_driver());
	
	@Dado("que eu esteja na tela de login")
	public void que_eu_deseje_realizar_login() {
		
		//validação
	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faco_login_com_o_usuario_e_senha(String user, String pass) {

		loginPage.preencher_email(user);
		loginPage.preencher_senha(pass);
		loginPage.clicar_btn_login();
	
	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		
		
	}

	@Então("é apresentado a mensagem {string}")
	public void é_apresentado_a_mensagem(String mensagem) throws InterruptedException {
		
			
	}

}
