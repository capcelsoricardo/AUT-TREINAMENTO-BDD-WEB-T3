package curso.treinamento.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.AddAdminPage;
import curso.treinamento.pages.AdminsManagementPage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;
import io.cucumber.datatable.DataTable;

public class CadastroDeAdministradoresSteps {
	
	MenuPage menuPage = new MenuPage(Hooks.get_driver());
	AdminsManagementPage adminsManagementPage  = new AdminsManagementPage(Hooks.get_driver());		
	AddAdminPage	addAdminPage = new AddAdminPage(Hooks.get_driver());
	
	@Dado("que eu esteja na tela Admins Management")
	public void que_eu_esteja_na_tela_Admins_Management() {
		menuPage.clicar_menu("ACCOUNTS");
		menuPage.clicar_submenu("ACCOUNTS", "Admins");
		Assert.assertTrue("Tela Admins Management não apresentada.", adminsManagementPage.validar_pagina());
	}

	@Quando("incluo um administrador")
	public void incluo_um_administrador(DataTable dataTable) {		
		adminsManagementPage.clicar_btn_add();
		
		Assert.assertTrue("Página Add Admin não apresentada.", addAdminPage.validar_pagina());
		
		List<Map<String, String>> listDataTable = dataTable.asMaps(String.class, String.class);
		
		addAdminPage.preencher_first_name(listDataTable.get(0).get("First Name"));
		addAdminPage.preencher_last_name(listDataTable.get(0).get("Last Name"));
	
		addAdminPage.selecionar_country(listDataTable.get(0).get("Country"));

	}

	@Então("administrador cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso() {

	}



}
