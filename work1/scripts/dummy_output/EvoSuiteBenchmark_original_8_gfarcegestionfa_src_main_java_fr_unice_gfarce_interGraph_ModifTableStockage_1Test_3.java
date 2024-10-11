// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {
		
	private TableStockage_1Test getInstance(){
		return (TableStockage_1Test)TableStockage.colonneMail();
	}
	@Test
	public void test(){
		
		assertNotNull("The instance " + getInstance() + " should not be NULL!!", getInstance());
		assertNotNull("The instance " + getInstance() + " should not be null", getInstance());
		
		assertEquals("The instance " + getInstance() + " de type incorrect!!", "0", getInstance().NombreRessource());
		
		// Envoie une mail
		assertEquals("The instance " + getInstance() + " de type incorrect!!", "Avenue du mail ", getInstance().Avenue("Avenue du mail\r\n"));
		
		// Envoie de mois
		assertEquals("The instance " + getInstance() + " de type incorrect!!", "En vue de mois", getInstance().Avenue("En vue de mois\r\n"));
		
		// Test de la table de nouvelle colonne
		assertNotNull("The instance " + getInstance() + " de type incorrect!!", getInstance().NombreRessource());
		assertNotNull("The instance " + getInstance() + " de type incorrect!!", getInstance().TableStockage());
		assertNotNull("The instance " + getInstance() + " de type incorrect!!", getInstance().Date());
	}
}