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
    void test() {
        /* ModifTableStockage_0Test.java:6:: */
        // Si on peut déclarer 2 colonnes
        modifTableStockage = new ModifTableStockage(2);
		
        // On passe directement la modification (modifTableStockage.ajouterLigne())
        modifTableStockage.ajouterLigne();
        
        assertEquals(2, modifTableStockage.getNbLignes());
        assertEquals(modifTableStockage.getNbColonnes(), modifTableStockage.nbLignes + modifTableStockage.nbColonnes +1);
    }
}