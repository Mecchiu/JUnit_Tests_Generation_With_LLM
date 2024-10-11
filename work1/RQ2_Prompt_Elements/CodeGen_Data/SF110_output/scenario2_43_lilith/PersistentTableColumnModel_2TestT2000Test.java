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
// PersistentTableColumnModel.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 * This class is based on code and ideas from Stephen Kelvin (mail at StephenKelvin.de) and Thomas Darimont.
 */
public class PersistentTableColumnModel extends DefaultTableColumnModel {

    /**
     * Returns an <code>Enumeration</code> of all the columns in the model.
     *
     * @param onlyVisible if set all invisible columns will be missing from the enumeration.
     * @return an <code>Enumeration</code> of the columns in the model
     */
    public Iterator<TableColumn> getColumns(boolean onlyVisible) {
        return (onlyVisible? tableColumns.iterator() : allTableColumns.iterator());
    }
}

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
		
		private final static boolean[] all = new boolean[20];

		static {
			for (int i = 0; i < 20; i++) {
				all[i] = true;
			}
		}
		private static List<TableColumn> tableColumns = new ArrayList<>();
		private static List<TableColumn> allTableColumns = new ArrayList<>();

		private final int NUMBER_OF_COLUMNS = 2;
		
		@Test
		public void test() {
			testCases();
			allTableColumns.clear();
		}
		
		private void testCases() {
			assertEquals("Check the size of the table - only invisible columns not visible columns", NUMBER_OF_COLUMNS, getNumberOfColumns());
			assertEquals("Check the size of the table - same column names", NUMBER_OF_COLUMNS, getNumberOfColumnNamesSize());
	
			assertTrue("Check the enumeration doesn't contain the visible columns", tableColumns.contains(tableColumn.getTableHeader()));
			assertTrue("Check the enumeration doesn't contain the invisible columns", allTableColumns.contains(allTableHeader.getTableHeader()));
		}
		
		@SuppressWarnings("unchecked")
		public List<TableColumn> getAll() {
			return tableColumns;
		}
		
		@SuppressWarnings("unchecked")
		public List<TableColumn> getAllTableColumns() {
			return allTableColumns;
		}
	}
