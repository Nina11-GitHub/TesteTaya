package testes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class emprestimoComGarantiaImovelPFisicaResidencial extends Executa {

	Metodos metodos = new Metodos();
	Executa executa = new Executa();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Test
	public void emprestimoConsorcioPFPositivo() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.consorcio);
		metodos.aguardarElemento(el.consorcio, 10);
		metodos.clicar(el.PFisica);
		metodos.aguardarElemento(el.PFisica, 10);
		metodos.clicar(el.buttonProximaEtapa);
		Thread.sleep(5000);
		metodos.clicar(el.veiculoLeve);
		Thread.sleep(5000);
		metodos.escrever(el.dataNascimento, "11/10/1988");
		metodos.escrever(el.valorImovel, "50000000");
		metodos.escrever(el.valorEmprestimo, "50000000");
		metodos.escrever(el.prazoPagamento, "120");
		metodos.clicar(el.calcular);
		metodos.validarTitle("Taya Crédito Imobiliário");
		Thread.sleep(5000);
		metodos.capturarScreenshot("Consorcio", "GarantiaVeiculoLeve");
	}

	@After
	public void depoisTeste() {
		Executa.fecharNavegador();

	}
}
