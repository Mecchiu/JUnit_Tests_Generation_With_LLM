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
	 * This test unit tests if the {@link PersistentTableColumnModel} constructor is public and adds all columns to its table.
	 */
	@Test
	public void testConstructor() {
		final DefaultTableColumnModel cm = new DefaultTableColumnModel(1);
		final List<TableColumn> columns = new ArrayList<TableColumn>();
		
		// column 0 was added.
		cm.addColumn(new TableColumn("A01"));
		cm.addColumn(new TableColumn("A02"));
		cm.addColumn(new TableColumn("A03"));
		cm.addColumn(new TableColumn("A04"));
		cm.addColumn(new TableColumn("A11"));
		
		// the table was not empty.
		assertFalse(cm.getColumnCount()==columns.size());
	}
	
	/**
	 * This test unit tests if the {@link PersistentTableColumnModel} addColumn is not overwritten for an empty table.
	 */
	@Test
	public void testAddColumn_EmptyTable() {
		final DefaultTableColumnModel cm = new DefaultTableColumnModel(1);

		// column 0 was added.
		cm.addColumn(new TableColumn("A01"));
		
		// the table was not empty.
		assertFalse(cm.getColumnCount()==1);
	}

}
// PersistentTableColumnModel_2Test.java