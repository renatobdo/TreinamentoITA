package Week3.ExerciciosTesteIMC;
import static org.junit.Assert.*;

import org.junit.Test;





public class TestIMC_review {
	
	 private Paciente_review p;
	
//	Baixo peso muito grave = IMC abaixo de 16 kg/m²
//			Baixo peso grave = IMC entre 16 e 16,99 kg/m²
//			Baixo peso = IMC entre 17 e 18,49 kg/m²
//			Peso normal = IMC entre 18,50 e 24,99 kg/m²
//			Sobrepeso = IMC entre 25 e 29,99 kg/m²
//			Obesidade grau I = IMC entre 30 e 34,99 kg/m²
//			Obesidade grau II = IMC entre 35 e 39,99 kg/m²
//			Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²

	@Test
	public void testPesoMuitoGrave() {
		p = new Paciente_review(1.90, 50);
		assertEquals(Mensagens_review.getMuitoGrave(), p.diagnostico());
	}
	
	@Test
	public void testPesoGrave() {
		p = new Paciente_review(1.75, 50);
		assertEquals(Mensagens_review.getGrave(), p.diagnostico());
	}
	
	@Test
	public void testPesoMuitoBaixo() {
		p = new Paciente_review(1.70, 50);
		assertEquals(Mensagens_review.getBaixo(), p.diagnostico());
	}
	
	@Test
	public void testPesoNormal() {
		p = new Paciente_review(1.70, 60);
		assertEquals(Mensagens_review.getNormal(), p.diagnostico());
	}
	
	@Test
	public void testSobrePeso() {
		p = new Paciente_review(1.70, 80);
		assertEquals(Mensagens_review.getSobrePeso(), p.diagnostico());
	}

	@Test
	public void testObesidadeG1() {
		p = new Paciente_review(1.83, 110);
		assertEquals(Mensagens_review.getObesidadeG1(), p.diagnostico());
	}
	
	@Test
	public void testObesidadeG2() {
		p = new Paciente_review(1.80, 120);
		assertEquals(Mensagens_review.getObesidadeG2(), p.diagnostico());
	}
	
	@Test
	public void testObesidadeG3() {
		p = new Paciente_review(1.80, 150);
		assertEquals(Mensagens_review.getObesidadeG3(), p.diagnostico());
	}
}
