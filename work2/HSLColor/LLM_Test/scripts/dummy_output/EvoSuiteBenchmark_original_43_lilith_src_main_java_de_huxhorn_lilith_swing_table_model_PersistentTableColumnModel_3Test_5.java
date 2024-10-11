// PersistentTableColumnModel_3Test.java
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
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {
		@Test
		public void test1() {
				// the first and last column's index will be 0
				assertEquals(0, PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));

				Iterator<TableColumn> iterator = DefaultTableColumnModel.EMPTY_COLUMN_ARRAY.iterator();
				iterateColumn(iterator);
				listColumn(iterator);

				iterateColumn(PersistentTableColumnModel.getColumns(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
				listColumn(PersistentTableColumnModel.getColumns(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
				
				// The null iterator is not supported
				assertEquals(1, PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
				assertFalse(iterator.hasNext());
				assertFalse(iterator.hasPrevious());
				iterateColumn(iterator);
				listColumn(iterator);
				
				// the last column's index will be the number of columns 
				assertEquals(PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY), PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
				iterator = PersistentTableColumnModel.getColumns(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY).iterator();
				iterateColumn(iterator);
				listColumn(iterator);
				
				// The iterator is not supported for the null collection
				assertEquals(1, PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
				assertFalse(iterator.hasNext());
				assertFalse(iterator.hasPrevious());
				
				// The iterator and the last column's index will be the number of columns
				iterator = PersistentTableColumnModel.getColumns(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY).iterator();
				iterateColumn(iterator);
				listColumn(iterator);
				assertEquals(PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY), listColumn(iterator));
		}

	private void listColumn(Iterator<TableColumn> columns) {
		int columnCountPerCount = 0;
		while(columns.hasNext()) {
			TableColumn column = columns.next();
			columnCountPerCount++;
		}		
		assertEquals(columnCountPerCount, PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
		int columnCountPerColumns = 0;
		
		while(columns.hasNext()) {
			TableColumn column = columns.next();
			columnCountPerColumns++;
		}
		assertEquals(columnCountPerColumns, PersistentTableColumnModel.getColumnCount(DefaultTableColumnModel.EMPTY_COLUMN_ARRAY));
	}

	private void iterateColumn(Iterator<TableColumn> columns) {
		
		while(columns.hasNext()) {
			TableColumn column = columns.next();
			DefaultTableColumnModel columnModel = (DefaultTableColumnModel)column.getModel();
			
			assertEquals(column.getModelIndex(), PersistentTableColumnModel.getColumnIndex(column.getIdentifier(), false));
			
			assertEquals(column.getModelIndex(), PersistentTableColumnModel.getColumn(columnModel, column.getIdentifier()));
			// Check that the model's first column is always the first column when first in order
			if(columnModel.getColumnCount()!=1) {
				// the index of the first column is zero, therefore if we only look for the first one
				// we got a non-first entry
				assertEquals(columnModel.getColumn(0).getModelIndex(), PersistentTableColumnModel.getColumn(DefaultTableColumnModel.FIRST, DefaultTableColumnModel.FIRST).getModelIndex());
			}
			if(!"".equals(columnModel.getColumn(0).getTitle())) {
				assertEquals(columnModel.getColumn(0).getIndexAtPosition(column.getFirstCellPosition()),columnModel.getColumn(0).getModelIndex());
			}
		}
	}
}