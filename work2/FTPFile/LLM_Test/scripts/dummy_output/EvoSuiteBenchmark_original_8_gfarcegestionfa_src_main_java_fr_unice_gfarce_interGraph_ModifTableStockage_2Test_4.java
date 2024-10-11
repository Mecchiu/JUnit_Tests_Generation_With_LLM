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
		* Test method for {@link fr.unice.gfarce.interGraph.ModifTableStockage#selectMail()}.
		*/
		@Test
		public void test() {
			// instance creation
				TableStockage tableStockage = new TableStockage();
				assertEquals("G&eacute;n&egrave;re",
						JOptionPane.showInputDialog("G&eacute;n&egrave;re?"));
				String mail = JOptionPane.showInputDialog("Mail");
				assertEquals("E-Mail", mail);
				// test selection pour mail
				assertEquals("E-Mail", tableStockage.selectMail());
				// test selection pour mail (non valid)
                JOptionPane._.showMessageDialog(null, String.format(
                        "%s is not valid", String.format(
                                           "%s is not valid", "Mail")));
		}
}
	
    // ModifTableStockage_3Test.java
    /**
     * Test class of {@link fr.unice.gfarce.interGraph.ModifTableStockage}.
     */
    public static class ModifTableStockage_3Test {

        /**
         * Test method for {@link fr.unice.gfarce.interGraph.ModifTableStockage#selectMail()}.
         */
        @Test
        public void testNoMail() {
            TableStockage tableStockage = new TableStockage();
            tableStockage.selectMail();
            assertEquals("E-Mail", tableStockage.getMail());
            assertEquals("", tableStockage.selectMail());
        }
}