import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperation {

	@Test
	void testSomme1() {
		Operation o = new Operation(8, 9);
		assertEquals(17, o.somme());
	}
	
	@Test
	void testSomme2() {
		Operation o = new Operation(8, 9);
		assertNotEquals(19, o.somme());
	}
	
	@Test
	void testProduit() {
		Operation o = new Operation(8, 9);
		assertEquals(72, o.produit());
	}
	
	@Test
	void testDivision() {
		Operation o = new Operation(8, 4);
		assertEquals(2, o.division());
	}
	
	@Test
	void testSoustraction() {
		Operation o = new Operation(9, 8);
		assertEquals(1, o.soustraction());
	}
	
	@Test
	void testMaximum_1() {
		Operation o = new Operation(9, 8);
		assertEquals(9, o.maximum());
	}

	@Test
	void testSame() {
		Operation o1 = new Operation(9, 8);
		Operation o2 = new Operation(9, 8);
		assertSame(o1, o1);
	}

	
	

}
