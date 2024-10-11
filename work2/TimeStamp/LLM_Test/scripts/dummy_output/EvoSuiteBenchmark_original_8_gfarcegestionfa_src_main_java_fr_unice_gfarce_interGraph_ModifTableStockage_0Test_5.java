// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_0Test {
		
	@Test
	public void ajouterLigneTest() {
		TableStockage tblStockage = new TableStockage();
        tblStockage.ajouterLigne();
		assertFalse(validateInput(""));   // On l'ouverture de la tâche par défaut n'affiche les infos qui sont pris
		assertTrue(tblStockage.hasDuplicateElements(tblStockage));
		assertTrue(validateInput("")); // L'on est invoqué un probleme si l'on est invoqué un input incorrect
	}
}