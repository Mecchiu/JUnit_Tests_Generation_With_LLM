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
         * Test of selectMail() method, of class ModifTableStockage.
         */
		@Test
		void testModifTableStockage_1() {

		}
		/**
         * Test of select() method, of class ModifTableStockage.
         * @date
         * @product
         * @since 0.1.0
         * @author
         * @see fr.unice.gfarce.interGraph.SelectMail
         */
		@Test
		void testModifTableStockage_2() {

			final TableStockage objTableStockage = ModifTableStockage.selectMail();
			assertNotNull(objTableStockage);
			assertTrue(objTableStockage.getRows().isEmpty());
			assertEquals(0, objTableStockage.getColumnDimensionY(), 0.001);
			assertEquals(0, objTableStockage.getColumnDimensionY(), 0.001);
			
			assertEquals(0, objTableStockage.getColumnDimensionX(), 0.001);
			assertEquals(1, objTableStockage.getRows().size());
			assertEquals(0, objTableStockage.getRows().get(0).getColumnDimensionX(), 0.001);
			assertEquals(1, objTableStockage.getRows().get(0).getRowDimensionY(), 0.001);
		}
}

// End ModifTableStockage.java