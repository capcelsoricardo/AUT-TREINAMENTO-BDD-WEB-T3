# language: pt

Funcionalidade: Login

	Cenário: Realizar login com sucesso
		Dado que eu deseje realizar login
		Quando faço login com o usuário "admin@phptravels.com" e senha "demoadmin"
		Então sou autenticado com sucesso 