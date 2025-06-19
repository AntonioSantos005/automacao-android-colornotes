package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ColorNotePage;

public class ColorNoteSteps {
	
	ColorNotePage colorPage = new ColorNotePage(driver);
	
	@Dado("^que o usuario clicou no botao skip$")
	public void queOUsuarioClicouNoBotaoSkip() throws Throwable {
		colorPage.clicarNoBotaoSkip();
	}

	@Quando("^o usuario clicar no botao mais$")
	public void oUsuarioClicarNoBotaoMais() throws Throwable {
		colorPage.clicarNoBotaoMais();
	}

	@E("^o usuario selecionar a opcao text$")
	public void oUsuarioSelecionarAOpcaoText() throws Throwable {
		colorPage.clicarNoAddText();
	}

	@E("^o usuario escrever na nota \"([^\"]*)\"$")
	public void oUsuarioEscreverNaNota(String texto) throws Throwable {
		colorPage.informarNota(texto);
	}

	@Entao("^o sistema apresenta a nota \"([^\"]*)\" na tela$")
	public void oSistemaApresentaANotaNaTela(String texto) throws Throwable {
		colorPage.validarNotaCriada(texto);
	}

	@E("^o usuario selecionar a opcao checklist$")
	public void oUsuarioSelecionarAOpcaoChecklist() throws Throwable {
		colorPage.clicarNoAddChecklist();
	}

	@E("^o usuario acionar o botao Add Item$")
	public void oUsuarioAcionarOBotaoAddItem() throws Throwable {
		colorPage.clicarBotaoAddItem();
	}

	@E("^o usuario escrever na campo texto \"([^\"]*)\"$")
	public void oUsuarioEscreverNaCampoTexto(String texto) throws Throwable {
		colorPage.informarTextoItem(texto);
	}

	@E("^o usuario acionar o botao ok$")
	public void oUsuarioAcionarOBotaoOk() throws Throwable {
		colorPage.acionarbotaoOk();
	}

	@E("^o usuario adicionar tres itens$")
	public void oUsuarioAadicionarTresItens() throws Throwable {
		colorPage.adicionar3Itens();
	}

	@E("^o usuario acionar o botao voltar do dispositivo tres vezes$")
	public void oUsarioAcionarOBotaoVoltarDoDispositivoTresVezes() throws Throwable {
		colorPage.acionarBotaoVoltarAndroid3vezes();
	}

	@Entao("^o sistema apresenta a nota na tela$")
	public void oSistemaApresentaANotaNaTela() throws Throwable {
		colorPage.validarCheckListCriado();
	}

	@E("^clicar na cor da nota$")
	public void clicarNaCorDaNota() throws Throwable {
		colorPage.clicarNoBotaoMudarCor();
	}

	@Entao("^o sistema apresenta as opcoes de cores$")
	public void oSistemaApresentaAsOpcoesDeCores() throws Throwable {
		colorPage.validarOpcoesCores();
	}

	@E("^o usuario clicar nas opcoes$")
	public void oUsuarioClicarNasOpcoes() throws Throwable {
		colorPage.clicarBotaoOpcoesNota();
	}

	@Quando("^o usuario clicar na nota$")
	public void oUsuarioClicarNaNota() throws Throwable {
		colorPage.clicarNaNota();
	}

	@E("^o usuario clicar no botao deletar$")
	public void oUsuarioClicarNoBotaoDeletar() throws Throwable {
		colorPage.clicarBotaoDeletarNota();
	}

	@E("^o usuario acessar o menu$")
	public void oUsuarioAcessarOMenu() throws Throwable {
		colorPage.clicarBotaoMenu();
	}

	@E("^o usuario clicar na lixeira$")
	public void oUsuarioClicarNaLixeira() throws Throwable {
		colorPage.clicarBotaoLixeira();
	}

	@E("^o usuario clicar em deletar permanente$")
	public void oUsuarioClicarEmDeletarPermanente() throws Throwable {
		colorPage.clicarBotaoExcluirPermanente();
	}

	@Entao("^o sistema apresenta a lixeira vazia$")
	public void oSistemaApresentaALixeiraVazia() throws Throwable {
		colorPage.validarNotaExcluida();
	}

}
