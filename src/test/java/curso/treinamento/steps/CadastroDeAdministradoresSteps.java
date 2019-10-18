package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.AddAdminPage;
import curso.treinamento.pages.AdminsManagementPage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;
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
		
		Helper.create_datatable(dataTable);
		
		addAdminPage.preencher_first_name(Helper.listDataTable.get(0).get("First Name"));
		addAdminPage.preencher_last_name(Helper.listDataTable.get(0).get("Last Name"));	
		addAdminPage.preencher_email(Helper.listDataTable.get(0).get("Email"));
		addAdminPage.preencher_password(Helper.listDataTable.get(0).get("Password"));
		addAdminPage.preencher_mobile(Helper.listDataTable.get(0).get("Mobile Number"));
		addAdminPage.selecionar_country(Helper.listDataTable.get(0).get("Country"));
		addAdminPage.preencher_address1(Helper.listDataTable.get(0).get("Address 1"));
		addAdminPage.preencher_address2(Helper.listDataTable.get(0).get("Address 2"));
		addAdminPage.selecionar_status(Helper.listDataTable.get(0).get("Status"));
		addAdminPage.selecionar_add(Helper.listDataTable.get(0).get("Add"));
		addAdminPage.selecionar_edit(Helper.listDataTable.get(0).get("Edit"));
		addAdminPage.selecionar_remove(Helper.listDataTable.get(0).get("Remove"));
		
		addAdminPage.clicar_btn_submit();
			
	}
	
	@Quando("incluo o administrador {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} e {string}")
	public void incluo_o_administrador_e(String firstName, String lastName, String email, String password, String mobileNumber, String country, 
			String address1, String address2, String status, String add, String edit, String remove) {
		
		adminsManagementPage.clicar_btn_add();
		
		Assert.assertTrue("Página Add Admin não apresentada.", addAdminPage.validar_pagina());
						
		addAdminPage.preencher_first_name(firstName);
		addAdminPage.preencher_last_name(lastName);	
		addAdminPage.preencher_email(email);
		addAdminPage.preencher_password(password);
		addAdminPage.preencher_mobile(mobileNumber);
		addAdminPage.selecionar_country(country);
		addAdminPage.preencher_address1(address1);
		addAdminPage.preencher_address2(address2);
		addAdminPage.selecionar_status(status);
		addAdminPage.selecionar_add(add);
		addAdminPage.selecionar_edit(edit);
		addAdminPage.selecionar_remove(remove);
		
		addAdminPage.clicar_btn_submit();
	   
	}

	@Então("administrador  {string} cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso(String email) {
		Assert.assertTrue("Usuário não cadastrado com sucesso.", 
				adminsManagementPage.validar_email_inserido(email));
	}
	
	@Então("administrador cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso() {
			
		Assert.assertTrue("Usuário não cadastrado com sucesso.", adminsManagementPage.validar_email_inserido(Helper.listDataTable.get(0).get("Email")));
	}
}
