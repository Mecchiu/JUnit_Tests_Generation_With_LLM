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
	* Tests the {@link ModifTableStockage#selectMail()} method.
	*/
	@Test
	public void testSelectMail() {
        // Création du fichier de données de test.
        TestFiles dir = new TestFiles();
		
		// Création de la variable tableStockage
        TableStockage tableStockage = new TableStockage(); 
        tableStockage.insertTable(dir.getTableFile(0));
        
		// Création de la variable tableStockage si cté 0 est déjà pris et c'est du table en cours
		boolean isFirstTable = tableStockage.isFirstTable();
		
		// Création de la variable tableStockage si cté 1 est déjà pris et c'est du table en cours
		boolean isSecondTable = tableStockage.isSecondTable();
		
		JOptionPane.showConfirmDialog(null, "Vous confirches que vous voulez r&omeacute;s vous une table au bon temps?", 
				 "Question des créées", JOptionPane.YES_NO_OPTION);
		
		// Attributs à créer
		String message = tableStockage.checkTable(isFirstTable);
		
		assertTrue(isFirstTable);
		assertTrue(isSecondTable);
		
		// Le test est terminé
		assertFalse(isFirstTable);
		assertFalse(isSecondTable);
		
		// Tester d'autres tests
		
	}

}
/** END OF CLASS */
