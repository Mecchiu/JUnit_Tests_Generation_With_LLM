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
	/** 
	 * Test method for {@link java.util.AbstractMap#equals(java.util.Object)}.
	 */
	public void testEquals() {
		DefaultTableColumnModel tm1 = new DataTableColumnModel();
		List<TableColumn> columns = new ArrayList<>(1);
		tm1.addColumn(new DataTableColumn("Name1", -1));
		tm1.addColumn(new DataTableColumn("Name2", -1));
		tm1.setAutoResizeMode(0);
		tm1.setColumnCount(2);
		tm1.setColumnHeaderCreator(new TableColumnCreator() {
			@Override
			public TableColumn createColumn() {
				return new TableColumn(null, -1);
			}
		});
		tm1.setVisible(false);

		// create 2 column models
		List<TableColumnModel> models = new ArrayList<>();
		models.add(tm1);		
		models.add(tm1);
		
		// make sure that models are equal
		assertFalse(tm1.equals(tm1));
		assertEquals(tm1, tm1);
		assertEquals(tm1, models.iterator().next());
		
		tm1.setAutoResizeMode(0);
		assertEquals(tm1, models.iterator().next());
		assertFalse(tm1.equals(models.iterator().next()));
		assertEquals(tm1, models.iterator().next());
		
		tm1.setAutoResizeMode(ModelOrientation.HORIZONTAL.id());
		tm1.setColumnCount(2);
		assertNotEquals(tm1, models.iterator().next());
		assertEquals(tm1, models.iterator().next());
		models.add(tm1);
		
		// make sure that models are equal
		assertFalse(tm1.equals(tm1));
		assertEquals(tm1, tm1);
		assertEquals(tm1, models.iterator().next());
}
}