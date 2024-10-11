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
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
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
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
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
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_7() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_8() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_9() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testSelectMail_10() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.selectMail();
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
}

// ModifTableStockage_3Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_3Test {
		
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	public void testColonneMail_1() {
		TableStockage ts = new TableStockage();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbLignes(), 0);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table contains only one line.
	*/
	@Test
	public void testColonneMail_2() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table contains only one line and the mail is not selected.
	*/
	@Test
	public void testColonneMail_3() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testColonneMail_4() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.colonneMail();
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testColonneMail_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, "jean.dupont@gmail.com");
		ModifTableStockage mts = new ModifTableStockage(ts);
		mts.colonneMail();
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbLignes(), 1);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table contains only one line and the mail is selected.
	*/
	@Test
	public void testColonneMail_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("E-Mail", String.class);
		ts.ajouterLigne();
