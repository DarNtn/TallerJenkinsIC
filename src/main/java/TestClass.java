import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	/* Pruebas Statement */
	// Prueba 1
	@Test
	void testPrueba1() {	
		Prima p = new Prima();
		assertEquals(600, p.getPrima("18", "M", "Soltero/a"));
	}
	
	// Prueba 2
	@Test
	void  testPrueba2() {
	    Prima p = new Prima();
		assertEquals(400, p.getPrima("61", "M", "Soltero/a"), "Result");
	}
	
	// Prueba 3
	@Test
	void  testPrueba3() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("16", "M", "Soltero/a"), "Result");
	}
	
	
	/* Pruebas Branch */
	// Prueba 4
	@Test
	void testPrueba4() {
		Prima p = new Prima();
		assertEquals(500, p.getPrima("19", "F", "Soltero/a"), "Result");
	}
	
	// Prueba 5
	@Test
	void testPrueba5() {
		Prima p = new Prima();
		assertEquals(200, p.getPrima("32", "F", "Casado/a"), "Result");
	}
	
	
	/* Pruebas Múltiple Condición */
	// Prueba ID=2
	@Test
	void testPrueba6() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("61", "X", "Soltero/a"), "Result");
	}
	
	// Prueba ID=3
	@Test
	void testPrueba7() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("18", "M", "Nulo"), "Result");
	}
	
	// Prueba ID=4
	@Test
	void testPrueba8() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("18", "X", "Nulo"), "Result");
	}
	
	// Prueba ID=5
	@Test
	void testPrueba9() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("83", "M", "Soltero/a"), "Result");
	}
	
	// Prueba ID=6
	@Test
	void testPrueba10() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("83", "X", "Casado/a"), "Result");
	}
	
	// Prueba ID=7
	@Test
	void testPrueba11() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("83", "F", "Nulo"), "Result");
	}
	
	// Prueba ID=8
	@Test
	void testPrueba12() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("83", "X", "Nulo"), "Result");
	}
	
	// Prueba ID=9
	@Test
	void testPrueba13() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("15", "F", "Soltero/a"), "Result");
	}
	
	// Prueba ID=10
	@Test
	void testPrueba14() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("15", "X", "Soltero/a"), "Result");
	}
	
	// Prueba ID=11
	@Test
	void testPrueba15() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("15", "F", "Nulo"), "Result");
	}
	
	// Prueba ID=12
	@Test
	void testPrueba16() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("15", "X", "Nulo"), "Result");
	}
	
	// Prueba ID=13
	@Test
	void testPrueba17() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("X", "F", "Soltero/a"), "Result");
	}
	
	// Prueba ID=14
	@Test
	void testPrueba18() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("X", "X", "Soltero/a"), "Result");
	}
	
	// Prueba ID=15
	@Test
	void testPrueba19() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("X", "M", "Nulo"), "Result");
	}
	
	// Prueba ID=16
	@Test
	void testPrueba20() {
		Prima p = new Prima();
		assertEquals(-1, p.getPrima("X", "X", "Nulo"), "Result");
	}

}
