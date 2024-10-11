// PersistentTableColumnModel_2Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {
		/**
		 * Test method for {@link PersistentTableColumnModel#getColumns(boolean)}.
		 */
		@Test
		public void testGetColumns() {
			final PersistentTableColumnModel test = new PersistentTableColumnModel();
					test.addColumn(new TableColumn(1, "1"));
            test.addColumn(new TableColumn(2, "2"));
            test.addColumn(new TableColumn(3, "3"));
            test.addColumn(new TableColumn(4, "4"));
            test.addColumn(new TableColumn(5, "5"));
			final Iterator<TableColumn> columns = test.getColumns(true);
			final Iterator<TableColumn> expected = Arrays.asList(test.getColumn(0),
        test.getColumn(2), test.getColumn(3), test.getColumn(4));
			assertEquals(expected, columns);
			
			final DefaultTableColumnModel mm = new DefaultTableColumnModel();
    mm.addColumn(new TableColumn(5, "5-4"));
    expected = Arrays.asList(new TableColumn(5, "5-2"), new TableColumn(5, "5-1"));
    	columns = mm.getColumns(true);
    assertEquals(expected, columns);
			}
}