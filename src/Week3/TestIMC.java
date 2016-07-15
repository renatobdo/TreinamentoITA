package Week3;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestIMC {

	@Test
	public void testBaixoPesoMuitoGrave() {
		// 1,72*1,72 = 2,9584
		// 46.5 / 2,9584 = 15,717955651703623580313683071931
		Paciente p1 = new Paciente(46.5, 1.72);
		assertEquals("Baixo peso muito grave ", p1.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 15.9 - 15.717955651703626 =
		// 0.18204434829637428
		// 0.18204434829637428 < 0.189
		assertEquals(15.9, p1.calcularIMC(), 0.189);

	}

	@Test
	public void testBaixoPesoGrave() {
		// 1,72*1,72 = 2,9584
		// 48.5 / 2,9584 = 16,393996755002704164413196322336
		Paciente p2 = new Paciente(48.5, 1.72);
		assertEquals("Baixo peso grave ", p2.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 16.4 - 16,393996755002704164413196322336 =
		// 0,006003244997295835586803677664
		// 0,006003244997295835586803677664 < 0.0061
		assertEquals(16.4, p2.calcularIMC(), 0.0061);

	}

	@Test
	public void testBaixoPeso() {
		// 1,72*1,72 = 2,9584
		// 54.5 / 2,9584 = 18,422120064899945916711736073553
		Paciente p3 = new Paciente(54.5, 1.72);
		assertEquals("Baixo peso ", p3.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 18.4 - 18,422120064899945916711736073553 =
		// -0,02212006489994591671173607355327
		// -0,02212006489994591671173607355327 < 0,0222
		// Repare que não precisa colocar valor negativo. Teste a linha acima
		// com o valor 0,0220 irá dar erro
		assertEquals(18.4, p3.calcularIMC(), 0.0222);

	}

	@Test
	public void testPesoNormal() {
		// 1,72*1,72 = 2,9584
		// 64.5 / 2,9584 = 21,802325581395348837209302325581
		Paciente p4 = new Paciente(64.5, 1.72);
		assertEquals("Peso normal ", p4.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 21.80233 - 21,802325581395348837209302325581 =
		// 0,000004418604651162790697674419
		// 0,000004418604651162790697674419 < 0,00000442
		assertEquals(21.80233, p4.calcularIMC(), 0.00000442);

	}

	@Test
	public void testSobrePeso() {
		// 1,72*1,72 = 2,9584
		// 84.5 / 2,9584 = 28,562736614386154678204434829638
		Paciente p5 = new Paciente(84.5, 1.72);
		assertEquals("Sobrepeso ", p5.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 28.6 - 28,562736614386154678204434829638 =
		// 0,03726338561384532179556517036236
		// 0,03726338561384532179556517036236 < 0,038
		assertEquals(28.6, p5.calcularIMC(), 0.038);

	}

	@Test
	public void testObesidade1() {
		// 1,72*1,72 = 2,9584
		// 94.5 / 2,9584 = 31,942942130881557598702001081666
		Paciente p6 = new Paciente(94.5, 1.72);
		assertEquals("Obesidade grau 1: ", p6.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 32 - 31,942942130881557598702001081666 =
		// 0,05705786911844240129799891833423
		// 0,05705786911844240129799891833423 < 0,058
		assertEquals(32, p6.calcularIMC(), 0.058);

	}

	@Test
	public void testObesidade2() {
		// 1,72*1,72 = 2,9584
		// 104.5 / 2,9584 = 35,323147647376960519199567333694
		Paciente p7 = new Paciente(104.5, 1.72);
		assertEquals("Obesidade grau 2: ", p7.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 35,32315 - 35,323147647376960519199567333694 =
		// 0,000002352623039480800432666306
		// 0,000002352623039480800432666306 < 0,0000024
		assertEquals(35.32315, p7.calcularIMC(), 0.0000024);

	}

	@Test
	public void testObesidade3() {
		// 1,72*1,72 = 2,9584
		// 124.5 / 2,9584 = 42,08355868036776636019469983775
		Paciente p8 = new Paciente(124.5, 1.72);
		assertEquals("Obesidade grau 3 mórbida: ", p8.diagnostico());
		// assertEquals(valor esperado, valor atual, tolerância)
		// Math.abs(esperado - atual) < tolerancia
		// No nosso exemplo seria 42.1 - 42,08355868036776636019469983775 =
		// 0,01644131963223363980530016224986
		// 0,01644131963223363980530016224986 < 0.02
		assertEquals(42.1, p8.calcularIMC(), 0.02);

	}
	
}
