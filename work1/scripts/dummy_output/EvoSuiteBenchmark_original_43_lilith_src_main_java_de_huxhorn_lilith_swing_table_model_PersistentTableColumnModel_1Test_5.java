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
		

    public PersistentTableColumnModel_1Test() {
		}
		
		@Test
	public void serialVersionHack() {
		assertEquals(1, PersistentTableColumnModel.PROTOCOL_VERSION);
	}

	@Test
	public void testGetColumnByIndex() {
		TableColumn col1 = new TableColumn("foo");
		TableColumn col2 = new TableColumn("bar");
		
		TableColumn[] columnArray = new TableColumn[2];
		assertArrayEquals(new TableColumn[] { col1, col2 },
				PersistentTableColumnModel.getColumns(columnArray));

		assertArrayEquals(new TableColumn[] { col1, col2 },
				PersistentTableColumnModel.getConsecutiveColumns(columnArray));

		int numVisibleColumns = getNumberOfCols(columnArray);
		assertEquals(numVisibleColumns, 2);
		
		Iterator<TableColumn> iterator = getVisibleColumnsIterator(columnArray);
		iterator.next();
		iterator.previous();
		int firstVisibleIndex = iterator.nextIndex();
		int numNewVisibleCols = getNumberOfCols(iterator.next());
		assertEquals(numNewVisibleCols, numVisibleColumns - 1);
		
		assertArrayEquals(columnArray, PersistentTableColumnModel.getColsSorted(columnArray));
	}
	
	@Test
	public void testAddColumn() {
		TableColumn col1 = new TableColumn("a");
		TableColumn col2 = new TableColumn("b");
		TableColumn col3 = new TableColumn("c");
		
		TableColumn[] columnArray = new TableColumn[2];
		// add column
		// assertColumnAdded(col1, col2);
		int colCount = getColumnCount(true);
		assertEquals(columnArray.length, colCount);
		
		createColumns(columnArray);
		ArrayList<TableColumn> toAdd = new ArrayList<TableColumn>();
		List<TableColumn> list = new ArrayList<TableColumn>(columnArray);
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
		
		list = new ArrayList<TableColumn>();
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
		createColumns(columnArray);
		assertEquals(columnArray.length, getColumnCount(true));
		// check that column was added
		getColumns(columnArray);
		assertArrayEquals(columnArray, PersistentTableColumnModel.getConsecutiveColumns(columnArray));
		
		createColumns(columnArray);
		list = new ArrayList<TableColumn>();
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
		createColumns(columnArray);
		list = new ArrayList<TableColumn>();
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
		
		list = new ArrayList<TableColumn>();
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
		
		// assertColumnAdded(col1, col2);
		// assertColumnAdded(col2, col3);
		
		list = new ArrayList<TableColumn>();
		list.add(col2);
		list.add(col3);
		list.add(col1);
		toAdd.addAll(list);
		addColumns(toAdd);
	}
  
  @Test
  public void testColumnChanged() {
    TableColumn col1 = new TableColumn("a");
    List<TableColumn> newCols = new ArrayList<TableColumn>();
    newCols.add(col1);
    TestUtils.setCols(col1, newCols);

    assertTrue(PersistentTableColumnModel.isColumnsChanging(col1));
    TestUtils.clearCols(col1);
    assertFalse(PersistentTableColumnModel.isColumnsChanging(col1));
  }
  
  @Test
  public void testGetNumberOfVisibleColumns() {
    assertEquals(0, getNumberOfVisibleColumns(null));
    assertEquals(1, getNumberOfVisibleColumns("header"));
    assertEquals(1, getNumberOfVisibleColumns("first"));
    assertEquals(1, getNumberOfVisibleColumns("first-hidden"));
    assertEquals(-1, getNumberOfVisibleColumns("noselect"));

    assertEquals(2, getNumberOfColumns("header", "first"));
    assertEquals(-1, getNumberOfVisibleColumns("header", "first-hidden"));
    assertEquals(-1, getNumberOfVisibleColumns("first", "header"));
    assertEquals(-1, getNumberOfVisibleColumns("header", "first-hidden", "first"));
    
    assertEquals(2, getNumberOfVisibleColumns("header", "first"));
    assertEquals(1, getNumberOfVisibleColumns("header", "first-hidden"));
    assertEquals(-1, getNumberOfVisibleColumns("first", "header", "first"));
    assertEquals(-1, getNumberOfVisibleColumns("header", "first-hidden", "first-hidden"));
  }

	private Integer getNumberOfVisibleColumns(String type) {
		TableColumn col = new TableColumn();
		List<TableColumn> currCols = new ArrayList<TableColumn>();
		currCols.add(col);
		TableColumnModel cm = new DefaultTableColumnModel(currCols);

		List<TableColumn> currVisibleCols = PersistentTableColumnModel.getVisibleColumns(cm);
		Iterator<TableColumn> it = currVisibleCols.iterator();
		while (it.hasNext()) {
			TableColumn tc = it.next();
			if (tc.getValue(type) == null) {
				it.remove();
			}
		}

		if (!currVisibleCols.isEmpty())
			return -1;
		return currVisibleCols.size();
	} 


	@SuppressWarnings( { "unchecked", "rawtypes" })
	private void assertFalse(boolean val) {
}
}