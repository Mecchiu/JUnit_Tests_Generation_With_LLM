// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_0Test {

	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	void testAjouterLigne_0() {
		TableStockage ts = new TableStockage();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has one column.
	*/
	@Test
	void testAjouterLigne_1() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has one column and one row.
	*/
	@Test
	void testAjouterLigne_2() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has one column and two rows.
	*/
	@Test
	void testAjouterLigne_3() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 3);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has two columns and one row.
	*/
	@Test
	void testAjouterLigne_4() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has two columns and two rows.
	*/
	@Test
	void testAjouterLigne_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 3);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has two columns and three rows.
	*/
	@Test
	void testAjouterLigne_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 4);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has three columns and one row.
	*/
	@Test
	void testAjouterLigne_7() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterColonne("colonne3", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has three columns and two rows.
	*/
	@Test
	void testAjouterLigne_8() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterColonne("colonne3", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 3);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#ajouterLigne()} method.
	* It tests the case where the table has three columns and three rows.
	*/
	@Test
	void testAjouterLigne_9() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterColonne("colonne3", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.ajouterLigne();
		assertEquals(ts2.getNbLignes(), 4);
	}
}

// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#supprimerLigne(int)} method.
*/
class ModifTableStockage_1Test {
		
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table is empty.
	*/
	@Test
	void testSupprimerLigne_0() {
		TableStockage ts = new TableStockage();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has one column.
	*/
	@Test
	void testSupprimerLigne_1() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has one column and one row.
	*/
	@Test
	void testSupprimerLigne_2() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has one column and two rows.
	*/
	@Test
	void testSupprimerLigne_3() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has one column and three rows.
	*/
	@Test
	void testSupprimerLigne_4() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has two columns and one row.
	*/
	@Test
	void testSupprimerLigne_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has two columns and two rows.
	*/
	@Test
	void testSupprimerLigne_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has two columns and three rows.
	*/
	@Test
	void testSupprimerLigne_7() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has three columns and one row.
	*/
	@Test
	void testSupprimerLigne_8() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterColonne("colonne3", String.class);
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
	* It tests the case where the table has three columns and two rows.
	*/
	@Test
	void testSupprimerLigne_9() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("colonne1", String.class);
		ts.ajouterColonne("colonne2", String.class);
		ts.ajouterColonne("colonne3", String.class);
		ts.ajouterLigne();
		ts.ajouterLigne();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.supprimerLigne(0);
		assertEquals(ts2.getNbLignes(), 1);
	}
}

// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
*/
class ModifTableStockage_2Test {
		
	/**
	* Test case for the {@link ModifTableStockage#ajouter