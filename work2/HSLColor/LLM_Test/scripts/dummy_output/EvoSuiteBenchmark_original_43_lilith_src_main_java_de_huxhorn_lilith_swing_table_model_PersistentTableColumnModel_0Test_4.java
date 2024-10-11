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
		/**
		 * Test method for
		 * {@link de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel#isColumnHidden(TableColumn)}.
		 */
		@Test
		public void testIsColumnHidden() {
				TableColumnModel tcm = new TableColumnModel();
				assertFalse(tcm.isColumnHidden(new TableColumn("test1", 0, true)));
				assertFalse(tcm.isColumnHidden(new TableColumn("test2", 0, false)));
						tcm.addColumn(new TableColumn("test3"));
						assertTrue(tcm.isColumnHidden(new TableColumn("test3")));
						assertFalse(tcm.isColumnHidden(new TableColumn("test4", 0, true)));
		}

		/**
		 * Test method for
		 * {@link de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel#isVisible(TableColumn)}.
		 */
		@Test
		public void testIsVisible() {
				DefaultTableColumnModel tcm = new DefaultTableColumnModel();
				assertFalse(tcm.isColumnVisible(new TableColumn("test1", 0, false)));
				assertFalse(tcm.isColumnVisible(new TableColumn("test2", 0, true)));
						tcm.addColumn(new TableColumn("test3"));
						assertFalse(tcm.isColumnVisible(new TableColumn("test3")));
						assertTrue(tcm.isColumnVisible(new TableColumn("test4", 0, false)));
		}

		/**
		 * Test method for
		 * {@link de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel#removeColumn(TableColumn)}.
		 */
		@Test
		public void testRemoveColumn() {
				DefaultTableColumnModel tcm = new DefaultTableColumnModel();
				assertNull(tcm.removeColumn(new TableColumn("test1", 0, true)));
				assertNull(tcm.removeColumn(new TableColumn("test2", 0,  false)));
				assertNull(tcm.removeColumn(new TableColumn("test4", 0, false)));
	}
}