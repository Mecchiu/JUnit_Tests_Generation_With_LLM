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
	 * Tests if Enumeration containing all columns
	 */
	@Test
	public void testAllColumnsEnumeration() {
		String[] columnNames = new String[] {"Foo", "Bar", "bam"};
		ColumnClass[] columnTypes = new ColumnClass[5];
		columnTypes[0] = ColumnClass.StringType;
		ColumnClass columnClass = new ColumnClass(ArrayList.class, Object.class);
		columnClass.addType(columnClass.StringType, true);
		columnClass.addProperty(0, true);

		int[] columnsOrder = new int[5];
		columnsOrder[columnsOrder.length - 1] = 0;
		DefaultTableColumnModel tableModel = new DefaultTableColumnModel(columnNames, columnTypes, columnOrder, tableColumnClass);

		// test getVisibleColumns
		List<TableColumn> visible = new ArrayList<>();
		Enumeration columns = tableModel.getColumns(true);
		Iterator<TableColumn> iterator = columns.iterator();
		TableColumn tableColumn = null;
		while (iterator.hasNext()) {
			tableColumn = iterator.next();
			if (tableColumn.getVisibleLength() > 0) {
				visible.add(tableColumn);
			}
		}

		// check visible
		assertTrue("no visible columns", visible.size() > 0);
		Iterator<TableColumn> visibleIterator = visible.iterator();
		TableColumn tableColumn = null;
		while (visibleIterator.hasNext()) {
			tableColumn = visibleIterator.next();
			assertTrue("the column" + tableColumn.getText()
				+ " is in fact Visible", tableColumn.getVisible());
		}

		// test getVisibleColumnOrder
		columns = tableModel.getVisibleColumns();
		iterator = columns.iterator();
		while (iterator.hasNext()) {
			tableColumn = iterator.next();
			assertTrue("the column" + tableColumn.getText()
				+ " is in fact Visible", tableColumn.getVisible());
		}

		// test getVisibleColumnOrder without the VisibleColumn
		columns = tableModel.getColumns(false);
		iterator = columns.iterator();
		tableColumn = null;
		while (iterator.hasNext()) {
			tableColumn = iterator.next();
			if (tableColumn.getVisibleLength() > 0) {
				assertTrue("the column" + tableColumn.getText()
					+ " is in fact Visible", tableColumn.getVisible());
			}
		}

		// test getAllColumns
		tableModel = new DefaultTableColumnModel(null, columnClass.ArrayElementType, null, tableColumnClass); 
		assertTrue("no column", tableModel.getColumnClass(4) == columnClass.ArrayElementType);
		assertEquals("Unexpected column", 4, tableModel.getColumnCount());

		// test getColumns
		DefaultTableColumnModel tableModel2 = new DefaultTableColumnModel(null, columnClass.ArrayElementType, null, tableColumnClass);

		TableColumn column = null;
		List<TableColumn> columns2 = tableModel2.getColumns(false);

		assertEquals("Unexpected column count", 6, columns2.size());

		tableModel = new DefaultTableColumnModel(null, columnClass.ArrayElementType, null, tableColumnClass);

		tableModel2 = new DefaultTableColumnModel(null, columnClass.ArrayElementType, null, tableColumnClass);

		columns = tableModel.getColumns(false);
		iterator = columns.iterator();
		row = 0;
		while (iterator.hasNext()) {
			column = iterator.next();
			assertEquals("the column" + column.getText() + " is in fact Visible", row++, tableModel.getColumnIndex
				(column.getClass()));
		}
		
		columns2 = tableModel2.getColumns(false);
		iterator = columns2.iterator();
		row = 0;
		while (iterator.hasNext()) {
			column = iterator.next();
			assertEquals("the column" + column.getText() + " is in fact Visible", row++, tableModel.getColumnIndex
				(column.getClass()));
		}
	}
}