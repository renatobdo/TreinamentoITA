import static org.junit.Assert.*;

import org.junit.Test;

public class TestesAutoridade {

	@Test
	public void testeInformal() {
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade("Pedro", "Cabral", fn);
		assertEquals(a.getTratamento(), "Pedro");
	}
	
	@Test
	public void testeRespeitosoSexoMasculino() {
		FormatadorNome fn = new Respeitoso("masculino");
		Autoridade a = new Autoridade("Pedro", "Cabral", fn);
		assertEquals(a.getTratamento(), "Sr. Pedro Cabral");
	}
	
	@Test
	public void testeRespeitosoSexoFeminino() {
		FormatadorNome fn = new Respeitoso("feminino");
		Autoridade a = new Autoridade("Maria", "Cabral", fn);
		assertEquals(a.getTratamento(), "Sra. Maria Cabral");
	}
	
	@Test
	public void testeRespeitosoSexoNaoDefinido() {
		FormatadorNome fn = new Respeitoso(null);
		Autoridade a = new Autoridade("Pedro", "Cabral", fn);
		assertEquals(a.getTratamento(), "Pedro Cabral");
	}
	
	@Test
	public void testeComTitulo() {
		FormatadorNome fn = new ComTitulo("Magnífico");
		Autoridade a = new Autoridade("Pedro", "Cabral", fn);
		assertEquals(a.getTratamento(), "Magnífico Pedro Cabral");
	}

}