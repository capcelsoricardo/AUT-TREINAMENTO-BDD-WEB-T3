# language: pt


Funcionalidade: Cadastro de Administradores

	Contexto: 
			Dado que eu esteja na tela de login
			Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
			Dado que eu esteja na tela Home

	@IncluirAdministrador
	Cenário: Incluir Administrador
		Dado que eu esteja na tela Admins Management
		Quando incluo um administrador
			|First Name			| Last Name| Email 						 | Password | Mobile Number | Country | Address 1  | Address 2 | Status  | Add 	 | Edit   | Remove    |
			|	Matheus				| Ferreira | teste@teste.com.br| 123456   | 11986596778   | Brazil  | Rua Jandira| Casa 2		 | Enabled | Tours |  Cars  | Locations |
		Então administrador cadastrado com sucesso
		