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

		List<TableColumn> tableColumns;
		PersistentTableColumnModel persistentTableColumnModel4;
		
		/**
		 * This method performs the following test.
		 * The test is done as follows:
		 * - Checks specified column visibility with list of columns.
		 * - Checks each column visibility.
		 * - Checks visibility of each column, in no particular order.
		 * - Checks the result of the visibility of column(s) of specified order.
		 * 
		 * @throws Exception if some problem occurs during test
		*/
		@Test
		public void checkColumnVisibility() throws Exception { 
			
			tableColumns = new ArrayList<>();
			tableColumns.add(new TableColumn("Label", 0));
			
			persistentTableColumnModel4 = new PersistentTableColumnModel(tableColumns); 
			
			assertNotNull(persistentTableColumnModel4.getTableHeaders());
			assertNotNull(persistentTableColumnModel4.getTableColumns());
			assertNotNull(persistentTableColumnModel4.getTableColumns());
			
			Iterator<TableColumn> tableColumnIter = persistentTableColumnModel4.getTableColumns().iterator();
			TableColumn tableColumn1;
			boolean tableColumn1Found = false;
			while (!tableColumn1Found && tableColumnIter.hasNext() )
				tableColumn1 = tableColumnIter.next();
			
			assertTrue(tableColumn1Found);
			
			Iterator<TableColumn> tableColumnIter2 = persistentTableColumnModel4.getTableHeaders().iterator();
			TableColumn tableColumn2;
			boolean tableColumn2Found = false;
			int indexOfTableHeaders = -1;
			while (tableColumnIter2.hasNext() &&!tableColumn2Found)	{
				tableColumn2 = tableColumnIter2.next();
				indexOfTableHeaders++;
				if (tableColumn2.getName().equalsIgnoreCase("first")) {
					tableColumn2Found = true;
				}
				tableColumnIter2 = persistentTableColumnModel4.getTableColumns().iterator();
			}
			
			assertTrue(tableColumn2Found);
			
			while (tableColumnIter.hasNext() ) {
				tableColumn1Found = false;
				assertTrue("The column is visible", persistentTableColumnModel4.isColumnVisible(tableColumnIter.next()));
			}
		}  
}

