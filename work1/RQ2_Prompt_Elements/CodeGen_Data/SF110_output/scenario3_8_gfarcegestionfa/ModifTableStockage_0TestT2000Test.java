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
final static ListSelectionModel lsModif = null;
		
		/**
		 *
		 *
		 * @throws Exception
		 */
		@Test
		public void test() throws Exception {
			
			// ModifTableStockage_0.java --> ModifTableStockage
	        final ModifTableStockage modifTableStockage = new ModifTableStockage();
			assertEquals("ajouterLigne()", new String(modifTableStockage.ajouterLigne().getAux(), "UTF-8"), "La premiere lettre de la liste a été retournée");
			JOptionPane pane = JOptionPane.showConfirmDialog(null,"Ajout de la lettre ","Question de retournement", JOptionPane.YES_NO_OPTION);
			assertEquals("La valeur du champ \"Liste de lettres\" est:\"" + pane.getValue()+"\"",0,JOptionPane.showConfirmDialog(null,"Vérification de la valeur du champ \"Liste de lettres\"", "Question", JOptionPane.YES_NO_OPTION));
		}
}
// ModifTableStockage_0.java