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
			|First Name			| Last Name| Email 		     				 | Password | Mobile Number | Country | Address 1  | Address 2 | Status  | Add 	 | Edit   | Remove    |
			|	Matheus				| Ferreira | testecelso@teste.com.br| 123456   | 11986596778   | Brazil  | Rua Jandira| Casa 2		 | Enabled | Tours |  Cars  | Locations |
		Então administrador cadastrado com sucesso
		
		
		@IncluirAdminstradores
		Esquema do Cenário: Inclusão de usuários
			Dado que eu esteja na tela Admins Management
			Quando incluo o administrador "<First Name>", "<Last Name>", "<Email>", "<Password>", "<Mobile Number>", "<Country>", "<Address 1>", "<Address 2>", "<Status>", "<Add>", "<Edit>" e "<Remove>"
			Então administrador  "<Email>" cadastrado com sucesso
			
			Exemplos:
				|First Name			| Last Name| Email 		     				  | Password | Mobile Number | Country   | Address 1  | Address 2 | Status  | Add 	 | Edit   | Remove    |
			  |	Matheus  			| Ferreira | testeticox@teste.com.br| 123456   | 11986596778   | Algeria   | Rua Jandira| Casa 2		 | Enabled | Tours |  Cars  | Locations |
			  |	Matheus  			| Ferreira | testemarco@teste.com.br| 123456   | 11986596778   | Brazil    | Rua Jandira| Casa 2		 | Enabled | Tours |  Cars  | Locations |
				|	Matheus  			| Ferreira | testeamand@teste.com.br| 123456   | 11986596778   | Australia | Rua Jandira| Casa 2		 | Enabled | Tours |  Cars  | Locations |
		