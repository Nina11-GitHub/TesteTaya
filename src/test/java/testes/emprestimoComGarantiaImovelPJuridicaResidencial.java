package testes;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Driver;
import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class emprestimoComGarantiaImovelPJuridicaResidencial extends Driver {

	Metodos metodos = new Metodos();
	Executa executa = new Executa();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Test
	public void emprestimoComGarantiaImovelPFPositivotest() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.aquisicaoDeImovel);
		metodos.aguardarElemento(el.PFisica, 10);
		metodos.clicar(el.PFisica);
		metodos.aguardarElemento(el.buttonProximaEtapa, 10);
		metodos.clicar(el.buttonProximaEtapa);
		metodos.aguardarElemento(el.residencial, 10);
		metodos.clicar(el.residencial);
		metodos.escrever(el.dataNascimento, "11/10/1988");
		metodos.escrever(el.valorImovel, "100000,00");
		metodos.escrever(el.valorEmprestimo, "50000,00");
		metodos.escrever(el.prazoPagamento, "120");
		metodos.clicar(el.calcular);
		metodos.validarTitle("Taya Crédito Imobiliário");
		metodos.capturarScreenshot("GarantiaImovel", "EmprestimoPF");
	}

	@After
	public void depoisTeste() {
		Executa.fecharNavegador();
	}

}
