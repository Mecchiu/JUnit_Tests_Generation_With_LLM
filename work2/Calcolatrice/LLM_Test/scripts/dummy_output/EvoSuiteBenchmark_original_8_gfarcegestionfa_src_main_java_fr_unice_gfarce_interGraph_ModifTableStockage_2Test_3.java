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
	 * Test case to check the method, that gets the table by its name, that returns, a TableStockage object
	 */
	@Test
	void test_1(){
	
		final int tableName; 		// deux variables

		tableName = JOptionPane.showConfirmDialog("Desea se creeu de l'identificatif?",
		                                         "Se d'identificatif",
		                                         JOptionPane.YES_NO_OPTION);

        assertTrue(tableName==2);	// test if the right button was correctly selected
	}

}
// ModifTableStockage.java