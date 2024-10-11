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
		 * Tests the constructor parameters
		 */
		PersistentTableColumnModel(TableColumnModel model);
		@Test
		void testGetColumns() {
			final List<TableColumn> columns = new ArrayList<>(1);
			model.getColumns(true);
			final List<Serializable> values = new ArrayList<>(model.lookupColumns(true));
			
			for (TableColumn column : (List<TableColumn>)columns) {
				System.out.println(column);
				assertEquals(values.get(column.getModelIndex()), 
						column.getModelIndex());
				values.remove(column.getModelIndex());
			}
		}
	}
// PersistentTableColumnModel_3Test.java