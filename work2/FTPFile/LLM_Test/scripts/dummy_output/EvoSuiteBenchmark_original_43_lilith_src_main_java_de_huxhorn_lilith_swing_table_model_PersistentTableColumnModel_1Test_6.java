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
		
	@Test
	void getColumnCountReturnsNumberOfColumnsIn() {
		assertEquals(0, PersistentTableColumnModel.getColumnCount(true));
	}

	@Test
	void getColumnsReturnsAllColumns() {
		final List<TableColumn> columns = new ArrayList<>();
		
		final List<TableColumn> columnsNew = new ArrayList<>();
		columns.add(new TableColumn("NewColumn", TableColumn.CENTER));
		columns.add(new TableColumn("NewColumnNew", TableColumn.CENTER));
		columns.add(new TableColumn("NewColumnNewChanged", TableColumn.RIGHT));
		columnsNew.add(new TableColumn("NewColumnNewChanged", TableColumn.LEFT));
		
		final List<TableColumn> columnRemoved = new ArrayList<>();
		columnRemoved.add(new TableColumn("ColumnRemovedLeft"));
		columnRemoved.add(new TableColumn("ColumnRemovedRight"), TableColumn.RIGHT);
		columnRemoved.add(new TableColumn("ColumnRemovedNew", TableColumn.CENTER));
		columnRemoved.add(new TableColumn("ColumnRemovedChanged", TableColumn.LEFT));
		
		final List<TableColumn> newColumns = PersistentTableColumnModel.getColumns(columns);
		
		assertEquals(columnAdded, newColumns);
		
		assertEquals(columnsNew, PersistentTableColumnModel.getColumns(columnsNew));
	}
	
	@Test
	void addColumnRespectsTableColumns() {
		final List<TableColumn> columns = new ArrayList<>();
		columns.add(new TableColumn("NewColumn", TableColumn.CENTER));
		columns.add(new TableColumn("NewColumnNew", TableColumn.CENTER));
		columns.add(new TableColumn("NewColumnNewChanged", TableColumn.RIGHT));
		columns.add(new TableColumn("NewColumnNewChangedChanged", TableColumn.LEFT));
		
		final List<TableColumn> columnsChanged = new ArrayList<>();
		columnsChanged.add(new TableColumn("ColumnChangedLeft"));
		columnsChanged.add(new TableColumn("ColumnChangedRight"), TableColumn.RIGHT);
		columnsChanged.add(new TableColumn("ColumnChangedNew", TableColumn.CENTER));
		columnsChanged.add(new TableColumn("ColumnChangedChanged", TableColumn.LEFT));

		final List<TableColumn> columnsNew = PersistentTableColumnModel.getColumns(columns);
		final List<TableColumn> columnsChangedNew = PersistentTableColumnModel.getColumns(columnsChanged);
		
		assertEquals(columnChanged, columnsChanged);
		assertEquals(columnsChanged, PersistentTableColumnModel.getColumns(columnsChanged));

		final List<TableColumn> added = new ArrayList<>(columns);
		final List<TableColumn> addedNew = new ArrayList<>(columnsNew);
		final List<TableColumn> addedChanged = new ArrayList<>(columnsChanged);
		
		// Add some columns
		addColumns(added, addedNew, addedChanged);
		assertEquals(added, PersistentTableColumnModel.getColumns(added));
		
		// Not add same column twice
		addColumns(addedNew, addedChanged, addedChanged);
		assertEquals(added, PersistentTableColumnModel.getColumns(added));

		// Remove some columns
		removeColumns(addedChanged, columns);
		assertEquals(columnsChanged, PersistentTableColumnModel.getColumns(columnsChanged));
		
		// Remove everything
		removeColumns(addedChanged, columns);
		assertEquals(added, PersistentTableColumnModel.getColumns(added));

	}
		
	
	
	/**
	Takes the new columns and removes them from the old ones in the new columns.
	@param newColumns
	@param oldColumn
	*/
	private void removeColumns(List<TableColumn> newColumns, List<TableColumn> oldColumn) {
		final TableColumn toBeRemoved = oldColumn.remove(0);
		toBeRemoved.setResizable(false);
		newColumns.remove(toBeRemoved);
		
	}
	
	/**
	Takes the old columns and adds them the new ones in the new columns.
	@param newColumns
	@param oldColumn
	*/
	private void addColumns(final List<TableColumn> newColumns, final List<TableColumn> oldColumn, List<TableColumn> newColumnsToBeAdded) {
		for(TableColumn column : oldColumn ) {
			newColumnsToBeAdded.add(new TableColumn(column.getText(), column.getWidth(), column.getAlignment()));
		}
		newColumnsToBeAdded.addAll(newColumns);
		
	}

	@Test
	@SuppressWarnings("unchecked")
	void getRowForColumnWithIdReturnedCorrectly() {
		final Iterator<TableColumn> rows = getColumns(TableColumn.CENTER);
		int idCounter = 0;
		
		while(rows.hasNext()) {
			final TableColumn rowId = rows.next();
			TableColumn row = table.getColumnModel().getColumn(rowId.getModelIndex());
			assertEquals(rows.next().getText(), row.getText());
			assertEquals(rows.next().getWidth(), row.getWidth());
			assertEquals(rows.next().getRowAfter(), row.getRowAfter());
			idCounter++;
		}
		
		assertEquals(idCounter, table.getColumnModel().getColumnCount(TableColumn.CENTER)); 
	}

}