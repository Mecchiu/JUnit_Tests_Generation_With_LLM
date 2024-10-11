// PersistentTableColumnModel_0Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {
/** Creates a new instance of this class */
		public PersistentTableColumnModel_0Test() {
			super(new DefaultTableColumnModel());
		}
		/**
		* Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
		* Verify that all columns are visible.
		*/
		@Test
		public void isColumnVisible() {
			// Given
				TableColumnModel tcm = new TableColumnModel(2);
				TableColumn aColumn = c(5, 6);  // Column number 5
				TableColumn aOtherColumn = c(7, 8);  // Column number 7

				// Test
				assertEquals(true, tcm.isTableColumnVisible(aColumn));
				assertEquals(true, tcm.isTableColumnVisible(aOtherColumn));

				// Clearing test
				clear();
				assertFalse(tcm.isTableColumnVisible(aColumn));
				assertFalse(tcm.isTableColumnVisible(aOtherColumn));

				// Adding columns
				clear();
				c(2, 1);
				assertTrue(tcm.isTableColumnVisible(aColumn));
				assertTrue(tcm.isTableColumnVisible(aOtherColumn));

				// Adding other columns
				clear();
				c(3, 2);
				assertTrue(tcm.isTableColumnVisible(aColumn));
				assertTrue(tcm.isTableColumnVisible(aOtherColumn));

				// Clearing test
				clear();
				assertFalse(tcm.isTableColumnVisible(aColumn));
				assertFalse(tcm.isTableColumnVisible(aOtherColumn));

				// Adding columns
				clear();
				c(2, 1);
				assertTrue(!tcm.isTableColumnVisible(aColumn));
				assertTrue(!tcm.isTableColumnVisible(aOtherColumn));

				// Adding other columns
				clear();
				c(3, 2);
				assertTrue(!tcm.isTableColumnVisible(aColumn));
				assertTrue(!tcm.isTableColumnVisible(aOtherColumn));

			// When
				List l = new ArrayList();
				l.add(aColumn);
				l.add(aOtherColumn);
				Iterator it = l.iterator();
				while (it.hasNext()) {
					assertTrue(tcm.isTableColumnVisible(it.next()));
				}
		}
			/** Tests for removing a column. **/
		@Test
		public void removeColumn() {
				// Given
				DefaultTableColumnModel tcm = new DefaultTableColumnModel(2);
				TableColumn aColumn = c(5, 6);  // Column number 5
				TableColumn aOtherColumn = c(7, 8);  // Column number 7

				// When
				tcm.removeColumn(aColumn);

				// Then
				assertEquals(1, tcm.getColumnCount());
				assertTrue(tcm.isColumnVisible(aColumn));
				assertTrue(tcm.isColumnVisible(aOtherColumn));
		}
}