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
	public void test() {

        JOptionPane.showMessageDialog(null, "test");

        TableStockage tableStockage = ajouterLigne();
        assertEquals("Aux ajoutage à ajouter la ligne existe déjà", 1, tableStockage.getNbLigneAvant());
        assertEquals("Aux ajoute vers le point ajout", 1, tableStockage.getNbPointNecrit());
        assertTrue("Ajout de Point ajout, point nb", tableStockage.ajoutPointNecrite(1, 0));
        assertTrue("Ajout de Point ajout, point nb en plus qu'une ligne existe déjà", tableStockage.ajoutPointNecrite(1, 1) > 0 && tableStockage.ajoutPointNecrite(1, 2) > 0);
	}

}