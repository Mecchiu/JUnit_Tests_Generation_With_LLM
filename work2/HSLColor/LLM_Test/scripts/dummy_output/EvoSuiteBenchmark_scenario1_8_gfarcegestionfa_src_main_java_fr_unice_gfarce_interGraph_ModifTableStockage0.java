// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockageTest {
		
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has no column.
	*/
	@Test
	void testAjouterLigne_noColumn() {
		TableStockage ts = new TableStockage(0, 0);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts, ts2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has one column.
	*/
	@Test
	void testAjouterLigne_oneColumn() {
		TableStockage ts = new TableStockage(0, 1);
		ts.setColumnName(0, "colonne1");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getValueAt(0, 0), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has two columns.
	*/
	@Test
	void testAjouterLigne_twoColumns() {
		TableStockage ts = new TableStockage(0, 2);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has three columns.
	*/
	@Test
	void testAjouterLigne_threeColumns() {
		TableStockage ts = new TableStockage(0, 3);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has four columns.
	*/
	@Test
	void testAjouterLigne_fourColumns() {
		TableStockage ts = new TableStockage(0, 4);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has five columns.
	*/
	@Test
	void testAjouterLigne_fiveColumns() {
		TableStockage ts = new TableStockage(0, 5);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getColumnName(4), "colonne5");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
		assertEquals(ts2.getValueAt(0, 4), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has six columns.
	*/
	@Test
	void testAjouterLigne_sixColumns() {
		TableStockage ts = new TableStockage(0, 6);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setColumnName(5, "colonne6");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getColumnName(4), "colonne5");
		assertEquals(ts2.getColumnName(5), "colonne6");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
		assertEquals(ts2.getValueAt(0, 4), "");
		assertEquals(ts2.getValueAt(0, 5), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has seven columns.
	*/
	@Test
	void testAjouterLigne_sevenColumns() {
		TableStockage ts = new TableStockage(0, 7);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setColumnName(5, "colonne6");
		ts.setColumnName(6, "colonne7");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getColumnName(4), "colonne5");
		assertEquals(ts2.getColumnName(5), "colonne6");
		assertEquals(ts2.getColumnName(6), "colonne7");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
		assertEquals(ts2.getValueAt(0, 4), "");
		assertEquals(ts2.getValueAt(0, 5), "");
		assertEquals(ts2.getValueAt(0, 6), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has eight columns.
	*/
	@Test
	void testAjouterLigne_eightColumns() {
		TableStockage ts = new TableStockage(0, 8);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setColumnName(5, "colonne6");
		ts.setColumnName(6, "colonne7");
		ts.setColumnName(7, "colonne8");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getColumnName(4), "colonne5");
		assertEquals(ts2.getColumnName(5), "colonne6");
		assertEquals(ts2.getColumnName(6), "colonne7");
		assertEquals(ts2.getColumnName(7), "colonne8");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
		assertEquals(ts2.getValueAt(0, 4), "");
		assertEquals(ts2.getValueAt(0, 5), "");
		assertEquals(ts2.getValueAt(0, 6), "");
		assertEquals(ts2.getValueAt(0, 7), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has nine columns.
	*/
	@Test
	void testAjouterLigne_nineColumns() {
		TableStockage ts = new TableStockage(0, 9);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setColumnName(5, "colonne6");
		ts.setColumnName(6, "colonne7");
		ts.setColumnName(7, "colonne8");
		ts.setColumnName(8, "colonne9");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
		assertEquals(ts2.getColumnName(4), "colonne5");
		assertEquals(ts2.getColumnName(5), "colonne6");
		assertEquals(ts2.getColumnName(6), "colonne7");
		assertEquals(ts2.getColumnName(7), "colonne8");
		assertEquals(ts2.getColumnName(8), "colonne9");
		assertEquals(ts2.getValueAt(0, 0), "");
		assertEquals(ts2.getValueAt(0, 1), "");
		assertEquals(ts2.getValueAt(0, 2), "");
		assertEquals(ts2.getValueAt(0, 3), "");
		assertEquals(ts2.getValueAt(0, 4), "");
		assertEquals(ts2.getValueAt(0, 5), "");
		assertEquals(ts2.getValueAt(0, 6), "");
		assertEquals(ts2.getValueAt(0, 7), "");
		assertEquals(ts2.getValueAt(0, 8), "");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has ten columns.
	*/
	@Test
	void testAjouterLigne_tenColumns() {
		TableStockage ts = new TableStockage(0, 10);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setColumnName(5, "colonne6");
		ts.setColumnName(6, "colonne7");
}
}