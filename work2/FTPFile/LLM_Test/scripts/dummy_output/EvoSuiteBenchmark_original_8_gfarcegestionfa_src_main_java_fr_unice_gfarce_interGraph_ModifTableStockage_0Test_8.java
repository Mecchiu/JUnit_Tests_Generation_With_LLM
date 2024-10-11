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
		 * Test of  ajouterLigne method, of class ModifTableStockage.
		 */
		 @Test
		public void test_ajouterLigne(){
    		assertEquals(false, ModifTableStockage.ajouterLigne());
			ModifTableStockage.ajouterLigne();
		}

}//class ModifTableStockage_0Test