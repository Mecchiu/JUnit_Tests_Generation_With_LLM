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
		
	@Test
	public void test(){
		
		assertEquals("La table stocka",JOptionPane.showInputDialog("Veuillez vérifier la fonction", "Input", JOptionPane.QUESTION_MESSAGE), "valeur en table Stocka");
		
}
}