// PersistentTableColumnModel_1Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_1Test {
		private static final int COLUMN_COUNT=5;

	/**
	 * Initializes tableColumns array.
	 *
	 * @throws java.lang.IllegalStateException
	*/
	@Test
	public void
            initTableColumns() {
			PersistentTableColumnModel tableColumns = new PersistentTableColumnModel(COLUMN_COUNT);
			assertEquals(COLUMN_COUNT, tableColumns.getColumnCount());
			Iterator iter = null;
			for (int i=0;i<COLUMN_COUNT;i++)
			{
				columnsAreCorrect(tableColumns.getColumns(), i, i);
			}
			assertEquals(this, this);
			iter = null;
			for (int i=0;i<COLUMN_COUNT;i++)
			{
				tableColumns.moveColumn(i, 0);
				iter = tableColumns.previousSiblingColumn(i);
				assertTrue("previousSibling column set for a wrong index!",iter.hasNext());
				tableColumns.setColumnEditable(iter, true);
			}
			assertTrue("unable to move the right column set!",iter.hasNext());
			tableColumns
			.moveColumn(0, 2);
			assertTrue("Column set is not correctly move right!",iter.hasNext());
			assertTrue("Wrong column index!",iter.nextIndex()==2);
			Iterable<? extends TableColumn> columns = tableColumns.rowSortedColumns();
			for (Iterator<? extends TableColumn>iter = columns.iterator();iter.hasNext();)
			{
				assertEquals(iter.next(), iter.next());
			}
		}        
		private static void
                assertEquals(List<TableColumn> expected,TableColumn[] actual) {
                    assertEquals(expected.size(), actual.length);
                    for (int i=0;i<actual.length;i++) {
                        assertEquals(expected.get(i), actual[i]);
                    }
                }
		private static void  assertTrue(boolean expected,boolean actual) throws java.util.NoSuchElementException {
			if(!expected) {
				throw new java.util.NoSuchElementException(); 
			}
        }
	}