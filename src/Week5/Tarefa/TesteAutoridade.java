package Week5.Tarefa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {
	

	@Test
	public void testaInformal() {
		Autoridade i = new Autoridade("Renato", null, new Informal());
		assertEquals("Renato", i.getTratamento());
	}
	@Test
	public void testaRespeitoso() {
		Autoridade r = new Autoridade("Renato", "Bueno", new Respeitoso("masculino"));
		assertEquals("Sr.Bueno", r.getTratamento());
	}
	@Test
	public void testaComTitulo() {
		Autoridade c = new Autoridade("Renato", "Bueno", new ComTitulo("professor"));
		assertEquals("professor Renato Bueno", c.getTratamento());
	}

}
