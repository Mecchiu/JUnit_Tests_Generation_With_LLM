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
// TODO Auto-generated method stub
/**
*<pre>
*test case of test {@link ModifTableStockage#ajouterLigne()} method.
* </pre>
*/
	@Test
	public void ajouterLigne_Ok_true(){
		new ModifTableStockage().ajouterLigne();
	}
	//<pre>
	//test case of test {@link ModifTableStockage#ajouterLigne()} method.
	// </pre>
void ajouterLigne_false(){
		try {
		new ModifTableStockage().ajouterLigne();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}