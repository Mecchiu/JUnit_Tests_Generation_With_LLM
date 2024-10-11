// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {

	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table is empty.
	*/
	@Test
	void testColonneMail_1() {
		TableStockage ts = new TableStockage();
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 1);
		assertEquals(ts2.getNbLignes(), 0);
		assertEquals(ts2.getNomColonne(0), "E-Mail");
		assertEquals(ts2.getTypeColonne(0), Boolean.class);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has only one column.
	*/
	@Test
	void testColonneMail_2() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 2);
		assertEquals(ts2.getNbLignes(), 1);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "E-Mail");
		assertEquals(ts2.getTypeColonne(1), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has only one column and one row.
	*/
	@Test
	void testColonneMail_3() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 2);
		assertEquals(ts2.getNbLignes(), 1);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "E-Mail");
		assertEquals(ts2.getTypeColonne(1), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has only one column and two rows.
	*/
	@Test
	void testColonneMail_4() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Durand");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 2);
		assertEquals(ts2.getNbLignes(), 2);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "E-Mail");
		assertEquals(ts2.getTypeColonne(1), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), false);
		assertEquals(ts2.getValeur(1, 0), "Durand");
		assertEquals(ts2.getValeur(1, 1), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has two columns and one row.
	*/
	@Test
	void testColonneMail_5() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 3);
		assertEquals(ts2.getNbLignes(), 1);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "Prenom");
		assertEquals(ts2.getTypeColonne(1), String.class);
		assertEquals(ts2.getNomColonne(2), "E-Mail");
		assertEquals(ts2.getTypeColonne(2), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), "Jean");
		assertEquals(ts2.getValeur(0, 2), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has two columns and two rows.
	*/
	@Test
	void testColonneMail_6() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Durand");
		ts.setValeur(1, 1, "Pierre");
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 3);
		assertEquals(ts2.getNbLignes(), 2);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "Prenom");
		assertEquals(ts2.getTypeColonne(1), String.class);
		assertEquals(ts2.getNomColonne(2), "E-Mail");
		assertEquals(ts2.getTypeColonne(2), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), "Jean");
		assertEquals(ts2.getValeur(0, 2), false);
		assertEquals(ts2.getValeur(1, 0), "Durand");
		assertEquals(ts2.getValeur(1, 1), "Pierre");
		assertEquals(ts2.getValeur(1, 2), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has three columns and one row.
	*/
	@Test
	void testColonneMail_7() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("Age", Integer.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, 25);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 4);
		assertEquals(ts2.getNbLignes(), 1);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "Prenom");
		assertEquals(ts2.getTypeColonne(1), String.class);
		assertEquals(ts2.getNomColonne(2), "Age");
		assertEquals(ts2.getTypeColonne(2), Integer.class);
		assertEquals(ts2.getNomColonne(3), "E-Mail");
		assertEquals(ts2.getTypeColonne(3), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), "Jean");
		assertEquals(ts2.getValeur(0, 2), 25);
		assertEquals(ts2.getValeur(0, 3), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has three columns and two rows.
	*/
	@Test
	void testColonneMail_8() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("Age", Integer.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, 25);
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Durand");
		ts.setValeur(1, 1, "Pierre");
		ts.setValeur(1, 2, 30);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 4);
		assertEquals(ts2.getNbLignes(), 2);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "Prenom");
		assertEquals(ts2.getTypeColonne(1), String.class);
		assertEquals(ts2.getNomColonne(2), "Age");
		assertEquals(ts2.getTypeColonne(2), Integer.class);
		assertEquals(ts2.getNomColonne(3), "E-Mail");
		assertEquals(ts2.getTypeColonne(3), Boolean.class);
		assertEquals(ts2.getValeur(0, 0), "Dupont");
		assertEquals(ts2.getValeur(0, 1), "Jean");
		assertEquals(ts2.getValeur(0, 2), 25);
		assertEquals(ts2.getValeur(0, 3), false);
		assertEquals(ts2.getValeur(1, 0), "Durand");
		assertEquals(ts2.getValeur(1, 1), "Pierre");
		assertEquals(ts2.getValeur(1, 2), 30);
		assertEquals(ts2.getValeur(1, 3), false);
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the table has three columns and three rows.
	*/
	@Test
	void testColonneMail_9() {
		TableStockage ts = new TableStockage();
		ts.ajouterColonne("Nom", String.class);
		ts.ajouterColonne("Prenom", String.class);
		ts.ajouterColonne("Age", Integer.class);
		ts.ajouterLigne();
		ts.setValeur(0, 0, "Dupont");
		ts.setValeur(0, 1, "Jean");
		ts.setValeur(0, 2, 25);
		ts.ajouterLigne();
		ts.setValeur(1, 0, "Durand");
		ts.setValeur(1, 1, "Pierre");
		ts.setValeur(1, 2, 30);
		ts.ajouterLigne();
		ts.setValeur(2, 0, "Martin");
		ts.setValeur(2, 1, "Paul");
		ts.setValeur(2, 2, 35);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.colonneMail();
		assertEquals(ts2.getNbColonnes(), 4);
		assertEquals(ts2.getNbLignes(), 3);
		assertEquals(ts2.getNomColonne(0), "Nom");
		assertEquals(ts2.getTypeColonne(0), String.class);
		assertEquals(ts2.getNomColonne(1), "Prenom");
		assertEquals(ts2.getTypeColonne(1), String.class);
		assertEquals(ts2.getNomColonne(2), "Age");
		assertEquals(ts2.getTypeColonne(2), Integer.class);
		assertEquals(ts2.getNomColonne(3), "E-Mail");
		assertEquals(ts2.getTypeColonne(3), Boolean.class);
		assertEquals(ts2.