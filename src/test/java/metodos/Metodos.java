package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Driver;

public class Metodos extends Driver {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	public void validarTexto(By elemento, String textoEsperadado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperadado, textoCapturado);
	}

	public void validarMsgAlert(String TextoEsperado) {
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(TextoEsperado));
	}
	
	public void validarTitle(String textoEsperadado) {	
		String pegarTitle = driver.getTitle();
		assertEquals(pegarTitle, textoEsperadado);

	}
	public void validarMsgAlert3(String TextoEsperado) {
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(TextoEsperado));

	}

	public void capturarScreenshot(String historia, String nomeDoArquivo) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./evidencias/" + historia + "/" + nomeDoArquivo + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}

	public void validarUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.out.println("*** URL DIFERENTE DA DESEJADA ****");
			System.out.println("***** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("***** MENSAGEM DE ERRO *******" + e.getMessage());
		}

	}

	public void validarTexto2(By elemento, String msgEsperado) {
		try {
			assertEquals(msgEsperado, driver.findElement(elemento).getText());
		} catch (Exception e) {
			System.out.println("*** ERRO AO VALIDAR TEXTO ****");
			System.out.println("***** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("***** MENSAGEM DE ERRO *******" + e.getMessage());

		}
	}
	
	public void aguardarElemento(By localizador, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(localizador));
    }
}


