package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Utils;

public class ColorNotePage {
	
	public ColorNotePage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")
	private MobileElement botaoSkip;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement botaoMais;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text")
	private MobileElement botaoAddText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Checklist']")
	private MobileElement botaoAddChecklist;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement campoEditarNota;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/title")
	private MobileElement notaCriada;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text")
	private MobileElement botaoAddItem;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement campoTextoItem;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOk;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/color_btn")
	private MobileElement botaoMudarCor;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn1")
	private MobileElement botaoCorVermelho;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/menu_btn")
	private MobileElement botaoOpcoesNota;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	private MobileElement botaoDeletarNota;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/page_more")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trash Can']")
	private MobileElement botaoLixeira;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Permanently delete']")
	private MobileElement botaoExcluirPermanente;
	
	public void clicarNoBotaoMais() {
		botaoMais.click();
	}
	
	public void clicarNoBotaoSkip() {
		botaoSkip.click();
	}
	
	public void clicarNoAddText() {
		botaoAddText.click();
	}
	
	public void clicarNoAddChecklist() {
		botaoAddChecklist.click();
	}
	
	public void informarNota(String texto) {
		campoEditarNota.sendKeys(texto);
	}
	
	public void acionarBotaoVoltarAndroid3vezes() {
		Utils.driver.navigate().back();
		Utils.driver.navigate().back();
		Utils.driver.navigate().back();
	}
	
	public void clicarBotaoAddItem() {
		botaoAddItem.click();
	}
	
	public void validarNotaCriada(String texto) {
		assertEquals(texto, notaCriada.getText());
	}
	
	public void informarTextoItem(String texto) {
		campoTextoItem.sendKeys(texto);
	}
	
	public void acionarbotaoOk() {
		botaoOk.click();
	}
	
	public void adicionar3Itens() {
		clicarBotaoAddItem();
		informarTextoItem("item1");
		acionarbotaoOk();	
		
		clicarBotaoAddItem();
		informarTextoItem("item2");
		acionarbotaoOk();	
		
		clicarBotaoAddItem();
		informarTextoItem("item3");
		acionarbotaoOk();	
	}
	
	public void validarCheckListCriado() {
		assertTrue(notaCriada.isDisplayed());
	}
	
	public void clicarNoBotaoMudarCor() {
		botaoMudarCor.click();
	}
	
	public void validarOpcoesCores() {
		assertTrue(botaoCorVermelho.isDisplayed());
	}
	
	public void clicarBotaoOpcoesNota() {
		botaoOpcoesNota.click();
	}
	
	public void clicarNaNota() {
		notaCriada.click();
	}
	
	public void clicarBotaoDeletarNota() {
		botaoDeletarNota.click();
	}
	
	public void clicarBotaoMenu() {
		botaoMenu.click();
	}
	
	public void clicarBotaoLixeira() {
		botaoLixeira.click();
	}
	
	public void clicarBotaoExcluirPermanente() {
		botaoExcluirPermanente.click();
	}
	
	public void validarNotaExcluida() {
		boolean exist = Utils.driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/title']")).size() == 0;
		assertTrue(exist);
	}
}
