// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockageTest {
		
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object.
	*/
	@Test
	void testColonneMail() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertTrue(tableS instanceof TableStockage);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail2() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getColumnCount(), nbColonnes + 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail3() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getRowCount(), nbLignes);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail4() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getColumnCount(), nbColonnes + 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail5() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getRowCount(), nbLignes);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail6() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getColumnCount(), nbColonnes + 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail7() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getRowCount(), nbLignes);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail8() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getColumnCount(), nbColonnes + 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of rows.
	*/
	@Test
	void testColonneMail9() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getRowCount(), nbLignes);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests if the method returns a {@link TableStockage} object with the right number of columns.
	*/
	@Test
	void testColonneMail10() {
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = new TableStockage(nbLignes, nbColonnes);
		tableS = mt.colonneMail();
		assertEquals(tableS.getColumnCount(), nbColonnes + 1);
	}
}