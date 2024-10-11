// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {
		
	/**
	 * Le testet doit être utilis &egrave; la chaine d'origine, &agrave; le ligne d'origine,
	 * &agrave; si l'existance deux lignes &eacute; 0,... ou &eacute; 4, seule... pour le TableStockage &eacute;.
	 *
	 * @throws Exception 
	 */
	@Test
	public void test() throws Exception {
		// Vérification des tests de modifTableStockage.java pour les cases d'origine (de ligne E/M)
		
		TableStockage stockage = new ModifTableStockage().selectMail();
		assertNotNull(stockage);
		assertEquals(3, (int)stockage.getElems());
		
		assertEquals(7, (int)stockage.getNodes());
		assertTrue((int)stockage.getElems()<=2); // le table stockage contient les tables
		assertTrue((int)stockage.getNodes()<=5); // le table stockage contient la table de tous les e-mails
		assertEquals(1, (int)stockage.getElems());
		
		// test de la chaine d'origine
		String chaine = "Teste de table stockage est";
		assertEquals(chaine, stockage.getText());
		try {
			stockage.setText("Nombre de 2 et un");
			FatalAssert.assertTrue("table chaine must end in \"Nombre de 2 + un\"", false);
		} 
		catch (Exception e) {
			assertEquals("Chaine non vide", e.getMessage());
		}
		
		// test de la table d'origine (du table chaine le nombre de 2 et un)
		String tableStockage2 = "Nombre de 2 et un";
		assertEquals(tableStockage2, stockage.getText());
		try {
			stockage.setText(tableStockage2);
			FatalAssert.assertTrue("table chaine dont les 2 et un nombres et un", false);
		} 
		catch (Exception e) {
			assertEquals("Chaine non vide", e.getMessage());
		}
		
	}
	
}