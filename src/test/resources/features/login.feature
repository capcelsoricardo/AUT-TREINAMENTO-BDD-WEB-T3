# language: pt

Funcionalidade: Login

	Cenário: Realizar login com sucesso
		Dado que eu deseje realizar login
		Quando faço login com o usuário "xpto" e senha "senha"
		Então sou autenticado com sucesso 