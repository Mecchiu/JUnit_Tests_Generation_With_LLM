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
		
	PersistentTableColumnModel_0Test(DefaultTableColumnModel original) {
		assertNotNull(original);
	}
	
	@javax.inject.Inject
	List<PersistentTableColumnModelListener> listeners;
    @Test
    public void isColumnVisible_aCol() {
		TableColumn col = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(col, listener);
		boolean result= instance.isColumnVisible(col);
		assertTrue(result);
	}
	
	@Test
	public void isColumnVisible_bCol() {
		TableColumn col = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(col, listener);
		boolean result= instance.isColumnVisible(col);
		assertFalse(result);
	}
	
	@Test
	public void getColumnCount_bCol() {
		TableColumn col = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(col, listener);
		int result= instance.getColumnCount(col);
		assertEquals(result, col.getModelIndex(), 0);
	}

	@Test
	public void getColumnCount_aCol() {
		TableColumn col = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(col, listener);
		int result= instance.getColumnCount(col);
		assertEquals(result, col.getModelIndex(), 0);
	}
	
	@Test
	public void clear_bCol() {
	    TableColumn col = new TableColumn("col", Column.RESET_MODE);
	    PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
	    PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
	    instance.addColumn(col, listener);
	    instance.clear();
	    assertNull(listener.getPrevCol());
	}
	
	@Test
	public void clear_aCol() {
	    TableColumn col = new TableColumn("col", Column.RESET_MODE);
	    PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
	    PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
	    instance.addColumn(col, listener);
	    instance.clear();
	    assertNull(listener.getPrevCol());
	}
	
	@Test
	public void setColumnName_bCol() {
		TableColumn aColumn = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(aColumn, listener);
		instance.setColumnName("colname");
		String nameValue = instance.getColumnName(aColumn);
		assertEquals(1, listeners.size());
		Iterator<TableColumn> it = listeners.iterator();
		if (it.next().getName().equals("colname")) {
			it.next().setStringValue(nameValue);
		}
	}

	@Test
	public void setColumnName_aCol() {
		TableColumn aColumn = new TableColumn("col", Column.RESET_MODE);
		PersistentTableColumnModel_0Test instance = new PersistentTableColumnModel_0Test(original);
		PersistentTableColumnModelListener listener = new PersistentTableColumnModelListenerAdapter(listeners);
		instance.addColumn(aColumn, listener);
		instance.setColumnName("colname");
		String nameValue = instance.getColumnName(aColumn);
		assertEquals(1, listeners.size());
		Iterator<TableColumn> it = listeners.iterator();
		if (it.next().getName().equals("colname")) {
			it.next().setStringValue(nameValue);
		}
	}
}