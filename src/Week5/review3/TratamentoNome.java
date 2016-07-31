package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import tratamento.Autoridade;

public class TratamentoNome {
	Autoridade a;
	
	@Test
	public void testeInformal() {
		a = new Autoridade("Jeferson", "Fadanelli");
		assertEquals("Jeferson", a.getTratamento());
	}
	
	@Test
	public void testeRespeitosoMasculino() {
		a = new Autoridade("Jeferson", "Fadanelli", false);
		assertEquals("Sr. Fadanelli", a.getTratamento());
	}
	
	@Test
	public void testeRespeitosoFeminino() {
		a = new Autoridade("Getulia", "Silva", true);
		assertEquals("Sra. Silva", a.getTratamento());
	}
	
	@Test
	public void testeComTitulo() {
		a = new Autoridade("Jeferson", "Fadanelli", "Lord");
		assertEquals("Lord Jeferson Fadanelli", a.getTratamento());
	}

}
