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
		///<summary>
          @Test
        public void testCalculeStockage() throws Exception {
        
            // On construit les stocks
            final TableStockage Stock_1 = new TableStockage();
            final TableStockage Stock_2 = new TableStockage();
            
            // On calcul le stockage de E-Mail
            assertEquals(1,  Stock_1.colonneEmail.length());
            
            // Etalon la table stockée
            assertEquals(0,  Stock_2.colonneMail.length());
        }
		///</summary>
}
// ModifTableStockage_2Test.java