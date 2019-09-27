package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage(Hooks.get_driver());
	HomePage   homePage = new HomePage(Hooks.get_driver());
	
	@Quando("que eu esteja na tela de login")
	public void que_eu_deseje_realizar_login() throws InterruptedException {
		
		loginPage.clicar_btn_remove_frame();
		
		Assert.assertTrue("Página login não foi apresentada.", loginPage.validar_pagina());
		
	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faco_login_com_o_usuario_e_senha(String user, String pass) throws InterruptedException {

		
		loginPage.preencher_email(user);
		loginPage.preencher_senha(pass);
		loginPage.clicar_btn_login();
	
	}

	@Quando("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		
		Assert.assertTrue("Login não realizado com sucesso.", homePage.validar_pagina());
		
	}

	@Quando("é apresentado a mensagem {string}")
	public void é_apresentado_a_mensagem(String mensagem) throws InterruptedException {
		Assert.assertTrue("Mensagem " + mensagem +" não apresentada.", loginPage.validar_msg_email_invalido());
			
	}

}
