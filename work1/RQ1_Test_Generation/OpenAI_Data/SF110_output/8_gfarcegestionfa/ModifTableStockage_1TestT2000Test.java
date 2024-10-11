// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_1Test {

	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	void testAjouterLigne_1() {
		TableStockage ts = new TableStockage(0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(1, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has one row.
	*/
	@Test
	void testAjouterLigne_2() {
		TableStockage ts = new TableStockage(1, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(2, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has two rows.
	*/
	@Test
	void testAjouterLigne_3() {
		TableStockage ts = new TableStockage(2, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(3, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has three rows.
	*/
	@Test
	void testAjouterLigne_4() {
		TableStockage ts = new TableStockage(3, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(4, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has four rows.
	*/
	@Test
	void testAjouterLigne_5() {
		TableStockage ts = new TableStockage(4, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(5, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has five rows.
	*/
	@Test
	void testAjouterLigne_6() {
		TableStockage ts = new TableStockage(5, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(6, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has six rows.
	*/
	@Test
	void testAjouterLigne_7() {
		TableStockage ts = new TableStockage(6, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(7, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has seven rows.
	*/
	@Test
	void testAjouterLigne_8() {
		TableStockage ts = new TableStockage(7, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(8, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has eight rows.
	*/
	@Test
	void testAjouterLigne_9() {
		TableStockage ts = new TableStockage(8, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(9, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has nine rows.
	*/
	@Test
	void testAjouterLigne_10() {
		TableStockage ts = new TableStockage(9, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterLigne();
		assertEquals(10, tableS.getRowCount());
	}
}

// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#supprimerLigne(int)} method.
*/
class ModifTableStockage_2Test {
		
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table is empty.
	*/
	@Test
	void testSupprimerLigne_1() {
		TableStockage ts = new TableStockage(0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.supprimerLigne(0);
		assertEquals(0, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has one row.
	*/
	@Test
	void testSupprimerLigne_2() {
		TableStockage ts = new TableStockage(1, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.supprimerLigne(0);
		assertEquals(0, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has two rows.
	*/
	@Test
	void testSupprimerLigne_3() {
		TableStockage ts = new TableStockage(2, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.supprimerLigne(0);
		assertEquals(1, tableS.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has three rows.
	*/
	@Test
	void testSupprimerLigne_4() {
		TableStockage ts = new TableStockage(3, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.