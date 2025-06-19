#language: pt
#encoding: UTF-8

Funcionalidade: Criar nota
 
  Contexto: clicar no botao skip
    Dado que o usuario clicou no botao skip

	Cenario: Criar uma nota de texto
		Quando o usuario clicar no botao mais
		E o usuario selecionar a opcao text
		E o usuario escrever na nota "TextoNota"
		E o usuario acionar o botao voltar do dispositivo tres vezes
		Entao o sistema apresenta a nota "TextoNota" na tela
		
	Cenario: Criar uma checklist com 3 itens
		Quando o usuario clicar no botao mais
		E o usuario selecionar a opcao checklist
		E o usuario adicionar tres itens
		E o usuario acionar o botao voltar do dispositivo tres vezes
		Entao o sistema apresenta a nota na tela
		
	Cenario: alterar cor
		Quando o usuario clicar no botao mais
		E o usuario selecionar a opcao text
		E o usuario escrever na nota "TextoNota"
		E clicar na cor da nota
		Entao o sistema apresenta as opcoes de cores
		
	Cenario: Enviar nota para lixeira
		Quando o usuario clicar no botao mais
		E o usuario selecionar a opcao text
		E o usuario escrever na nota "TextoNota"
		E o usuario acionar o botao voltar do dispositivo tres vezes
		Entao o sistema apresenta a nota "TextoNota" na tela
		Quando o usuario clicar na nota
		E o usuario clicar nas opcoes
		E o usuario clicar no botao deletar
		E o usuario acionar o botao ok
		E o usuario acessar o menu
		E o usuario clicar na lixeira
		Entao o sistema apresenta a nota "TextoNota" na tela
		
	Cenario: excluir nota e limpar lixeira
		Quando o usuario clicar no botao mais
		E o usuario selecionar a opcao text
		E o usuario escrever na nota "TextoNota"
		E o usuario acionar o botao voltar do dispositivo tres vezes
		Entao o sistema apresenta a nota "TextoNota" na tela
		Quando o usuario clicar na nota
		E o usuario clicar nas opcoes
		E o usuario clicar no botao deletar
		E o usuario acionar o botao ok
		E o usuario acessar o menu
		E o usuario clicar na lixeira
		E o usuario clicar na nota
		E o usuario clicar nas opcoes
		E o usuario clicar em deletar permanente
		E o usuario acionar o botao ok
		Entao o sistema apresenta a lixeira vazia
		
