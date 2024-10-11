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
		/**
		* Test method for {@link fr.unice.gfarce.interGraph.ModifTableStockage#colonneMail()}.
		* Validate that the {@link ResultTableStockage#getListe()} method yields the correct values.
		*/
		@Test
		public void testColonneMail() {
			TableStockage tableStockage =  new TableStockage_1().getListe(); 
			System.out.println(tableStockage.getListe());
			assertTrue(tableStockage.getListe().size() > 0);
			assertTrue(tableStockage.getListe().containsAll(tableE_Mail_1));
		}
		
		/**
		 * A valid table e the table E-Mail1.
		 * 
		 * @return tableE_Mail_1
		 */
		private TableStockage_1 getListe() {
				TableStockage tableStockage = 
				new TableStockage_1();
			TableStockage_1 tableE_Mail_1 = new TableStockage_1();
			tableE_Mail_1.setListe("mail");
			tableE_Mail_1.setDefaultIndex("mail");
			tableStockage.setListe(tableE_Mail_1);
			return tableStockage;
		}
}
