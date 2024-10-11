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
		private TableStockage_0 test;

        /**
         * JUnit setUp() allows the class to contain a JUnit test before each
         * test method.
         */
        @Override
        protected void setUp(){
                test = ajouterLigne();
        }

    /**
     * Test of aJOptionPane.showWelcomeDialog()
     * This method is called when the first dialog box is opened.
    * It calls the super method with a JOptionPane.
     * It sets a table to the new table.
     *
     * @throws java.lang.Exception
     */
		@SuppressWarnings("boxing")
		@Test
		public void testForth_1() throws Exception{
				setUp();
				super.testForth_1();
        }
}