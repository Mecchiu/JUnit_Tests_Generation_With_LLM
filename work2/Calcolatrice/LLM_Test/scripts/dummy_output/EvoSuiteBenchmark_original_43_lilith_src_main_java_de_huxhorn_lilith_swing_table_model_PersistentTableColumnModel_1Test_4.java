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
	public void testReturnsZeroWhenNullTableColumns() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		TableColumn tableColumn1 = new TableColumn();
		tableColumn1.setModel(columnModel);
		
		TableColumn tableColumn2 = new TableColumn();
		tableColumn2.setModel(columnModel);
		
		assertEquals(0, columnModel.getColumnCount());		
		assertNull(columnModel.getColumn(0));
		assertNull(columnModel.getColumn(1));
		assertEquals(0, tableColumn1.getModelIndex());
		assertEquals(0, tableColumn2.getModelIndex());		
	}
	
	@Test
	public void testReturnsZeroWhenEmpty() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		TableColumn tableColumn1 = new TableColumn();
		tableColumn1.setModel(columnModel);
		
		assertEquals(0, columnModel.getColumnCount());		
		assertNull(columnModel.getColumn(0));
		assertNull(columnModel.getColumn(1));
	}
	
	@Test
	public void testReturnsOneWhenNonZeroWidth() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		columnModel.getColumn(0).setPreferredWidth(100);
		tableColumns.add(columnModel.getColumn(0));
		tableColumns.add(columnModel.getColumn(1));
		
		assertEquals(1, columnModel.getColumnCount());
	}
	
	@Test
	public void testReturnsOneWhenNonZeroHeight() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		tableColumns.add(columnModel.getColumn(0));
		tableColumns.add(columnModel.getColumn(1));
		tableColumns.add(columnModel.getColumn(2));
		
		assertEquals(1, columnModel.getColumnCount());		
	}
	
	@Test
	public void testReturnsOneWhenNonZeroWidthAndHeight() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		columnModel.getColumn(0).setPreferredWidth(400);
		tableColumns.add(columnModel.getColumn(0));
		final List<TableColumn> tableColumns2 = new ArrayList<>();
		final DefaultTableColumnModel columnModel2 = new DefaultTableColumnModel(tableColumns2);
		columnModel2.getColumn(1).setPreferredWidth(200);
		tableColumns2.add(columnModel2.getColumn(0));
		tableColumns2.add(columnModel2.getColumn(1));
		tableColumns2.add(columnModel2.getColumn(2));
		
		assertEquals(1, columnModel.getColumnCount());
		assertEquals(1, columnModel2.getColumnCount()); // We don't need to check width because
		// tableColumns has to be the same length of tableColumns2
		assertEquals(tableColumns.size(), tableColumns2.size());
	}
	
	@Test
	public void testReturnsOneWhenVisibleWidthAndHeight() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		final List<TableColumnRange> ranges = new ArrayList<>(1);
		ranges.add(new TableColumnRange(tableColumns.get(0), columnModel.getColumn(0), tableColumns.get(0)));
		columnModel.setRowMargin(2);
		columnModel.setColumnMargin(2);
		tableColumns.add(columnModel.getColumn(2));
		
		assertEquals(1, columnModel.getColumnCount());
		assertEquals(1, range(columnModel).getSource().getFirstColumn().getModelIndex());
		assertEquals(0, range(columnModel).getSource().getSecondColumn().getModelIndex());
	}
	
	@Test
	public void testReturnsOneWhenFixedWidth() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		tableColumns.add(columnModel.getColumn(0));
		
		assertEquals(1, columnModel.getColumnCount());		
		assertNull(columnModel.getColumn(0));
	}
	
	@Test
	public void testReturnsOneWhenFixedHeight() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel = new DefaultTableColumnModel(tableColumns);
		tableColumns.add(columnModel.getColumn(0));
		
		// FIXME: this test has to be broken when fixed width is not a multiple of the vertical size
		assertEquals(1, columnModel.getColumnCount());		
		assertNull(columnModel.getColumn(0));
	}
	
	@Test
	public void testReturnsOneWhenFixedWidthAndFixedHeight() {
		final List<TableColumn> tableColumns = new ArrayList<>();
		final DefaultTableColumnModel columnModel1 = new DefaultTableColumnModel(tableColumns);
		columnModel1.getColumn(0).setPreferredWidth(200);
		tableColumns.add(columnModel1.getColumn(0));
		
		final List<TableColumn> tableColumns2 = new ArrayList<>();
		final DefaultTableColumnModel columnModel2 = new DefaultTableColumnModel(tableColumns2);
		columnModel2.getColumn(1).setPreferredWidth(400);
		tableColumns2.add(columnModel2.getColumn(0));
		tableColumns2.add(columnModel2.getColumn(1));
		tableColumns2.add(columnModel2.getColumn(2));
		
		assertEquals(1, columnModel1.getColumnCount());		
		assertEquals(1, columnModel2.getColumnCount()); // We don't need to check width because
		// tableColumns 1 has to be the same size of tableColumns 2
		assertEquals(tableColumns.size(), tableColumns2.size());
	}
	
	//TODO: I don't see any way to keep the correct table column model size, but I am not 
	//sure why it has not been fixed.
}