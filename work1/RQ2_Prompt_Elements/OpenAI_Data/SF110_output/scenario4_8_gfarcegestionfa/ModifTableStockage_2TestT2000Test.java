// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {

	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	public void testSelectMail_1() {
		TableStockage ts = new TableStockage();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line.
	*/
	@Test
	public void testSelectMail_2() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, true);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is not selected.
	*/
	@Test
	public void testSelectMail_3() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, false);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_4() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, true);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only two lines and the mail is not selected.
	*/
	@Test
	public void testSelectMail_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, false);
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Dupont");
		ts.setValeur(1, 1, "Jean");
		ts.setValeur(1, 2, false);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only two lines and the mail is selected.
	*/
	@Test
	public void testSelectMail_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, true);
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Dupont");
		ts.setValeur(1, 1, "Jean");
		ts.setValeur(1, 2, true);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 2);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only two lines and the mail is selected in the first line.
	*/
	@Test
	public void testSelectMail_7() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, true);
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Dupont");
		ts.setValeur(1, 1, "Jean");
		ts.setValeur(1, 2, false);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only two lines and the mail is selected in the second line.
	*/
	@Test
	public void testSelectMail_8() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", Boolean.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.set