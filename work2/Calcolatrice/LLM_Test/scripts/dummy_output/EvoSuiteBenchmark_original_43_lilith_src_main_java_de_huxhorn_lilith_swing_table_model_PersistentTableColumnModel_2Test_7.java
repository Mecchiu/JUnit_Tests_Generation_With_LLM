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
			 * This is the single test case for the {@link #getColumns(boolean)} method.
			 */
		@Test
		public void testGetColumns() {
			//Test fixture:
		    PersistentTableColumnModel model = new PersistentTableColumnModel();

			//Columns:
		    @SuppressWarnings("unused")
		    TableColumn column = new TableColumn(0);
		    Iterator<TableColumn> columnIterator = model.getColumns(false);

			//Expected result:
		    List<TableColumn> result = new ArrayList<>();
		    while (columnIterator.hasNext()) {
		        result.add(columnIterator.next());
		    }
		    assertEquals(result.size(), 0);
		}
}