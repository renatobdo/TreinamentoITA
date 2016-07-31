import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {
		
	@Test
	public void testGetTratamento() {
		Autoridade nomeAutoridade = new Autoridade("Ana", "Fonseca");
		assertEquals("Ana Fonseca", nomeAutoridade.getTratamento());
	}
	
	@Test
	public void testGetTratamentoInformal() {
		Autoridade nomeInformal = new Informal("Ana", "Fonseca");
		assertEquals("Ana", nomeInformal.getTratamento());
	}
	
	@Test
	public void testGetTratamentoRespeitoso() {
		Autoridade nomeRespeitoso = new Respeitoso("Ana", "Fonseca", "F");
		assertEquals("Sra. Fonseca", nomeRespeitoso.getTratamento());
	}
	
	@Test
	public void testGetTratamentoComTitulo() {
		Autoridade nomeComTitulo = new ComTitulo("Ana", "Fonseca", "Excelentíssima");
		assertEquals("Excelentíssima Ana Fonseca", nomeComTitulo.getTratamento());
	}
	

}
