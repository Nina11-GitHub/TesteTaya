package runner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Driver {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://imobiliario.desenvolvimento.taya.com.br/calculadora/aai-controle");

	}
	

	public static void fecharNavegador() {
		driver.quit();
	}

}

