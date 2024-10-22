package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public static By aquisicaoDeImovel = By.xpath("//div[@class='MuiContainer-root css-1y8acpc']");
	public static By buttonProximaEtapa = By.xpath("//*[contains(text(), 'PRÓXIMA ETAPA')]");
	public static By PFisica = By.xpath("//*[text()='PF']");
	public static By PJuridica = By.xpath("//*[text()='PJ']");
	public static By residencial = By.xpath("//*[contains(text(), 'Residencial')]");
	public static By comercial = By.xpath("//*[contains(text(), 'Comercial')]");	
	public static By dataNascimento = By.id(":rd:");
	public static By valorImovel = By.id(":re:");
	public static By valorEmprestimo = By.id(":rf:");
	public static By prazoPagamento = By.id(":ri:");
	public static By IOF = By.name(":rc:");
	public static By calcular =By.xpath("//*[contains(text(), 'CALCULAR')]");
	
	
	public static By consorcio = By.xpath("//*[text()='Consórcio']");
	public static By veiculoLeve = By.xpath("//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-uhifn3'][1]");
	
}