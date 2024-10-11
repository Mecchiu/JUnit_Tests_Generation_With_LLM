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
		
	/**
	 * test case of {@link ModifTableStockage#ajouterLigne()}
	 */
    @Test
    void test_ajouterLigne(){
			// Création de l'objet TableStockage
			TableStockage objet_ajouter = new TableStockage();
		
			// Test de la création de l'objet TableStockage
			TableStockage get_table_stockage_0 = objet_ajouter.ajouterLigne();
			assertEquals("TableStockage.getLigne", get_table_stockage_0.getLigne(),0);
			
		}
}