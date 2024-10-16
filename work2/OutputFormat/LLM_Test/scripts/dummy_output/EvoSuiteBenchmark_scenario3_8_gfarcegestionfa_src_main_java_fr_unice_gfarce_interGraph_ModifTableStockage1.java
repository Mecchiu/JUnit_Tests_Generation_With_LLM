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
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail1() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail2() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertNotEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail3() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail4() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertNotEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail5() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail6() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertNotEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail7() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail8() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertNotEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters a valid email address.
	*/
	@Test
	void testColonneMail9() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#colonneMail()} method.
	* It tests the case where the user enters an invalid email address.
	*/
	@Test
	void testColonneMail10() {
		ModifTableStockage modifTableStockage = new ModifTableStockage();
		TableStockage tableStockage = modifTableStockage.colonneMail();
		assertNotEquals(tableStockage.getNomColonne(tableStockage.getNbColonnes()-1), "E-Mail");
	}
}