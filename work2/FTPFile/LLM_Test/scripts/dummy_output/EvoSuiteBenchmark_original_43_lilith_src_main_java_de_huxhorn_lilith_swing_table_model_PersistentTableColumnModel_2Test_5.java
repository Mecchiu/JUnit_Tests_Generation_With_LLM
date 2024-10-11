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
		 
	TestTableColumnModel table;

	/**
	 * This is an empty constructor test, to see if it satisfies unit testing.
	 */
	public PersistentTableColumnModel_2Test() {
	}

	/**
	 * This is only required for unit testing.
	 * @param name of the unit test test in the format
	 *  {@link PersistentTableColumnModel#PersistentTableColumnModel(
	 *      String, int, DefaultTableModel)}}
	 */
	public PersistentTableColumnModel_2Test( String name) {
		this.table =
			new TestTableColumnModel( name, TestTableModel.columns);
	}
		 
	/**
	 * @see PersistentTableColumnModel_1Test#getColumns()
	 */
	@Test
	public void testGetColumns() {
		List<TableColumn> l;
		
		l = this.table.getColumns();
		assertTrue(l.getClass().isArray());
		assertEquals(1, l.length);
		assertEquals(1, (l).getClass().getComponentType().getPrimitiveSize());
	}
	
	/**
	 * @see PersistentTableColumnModel_1Test#insertColumn(int, TableColumnModel, int)
	 */
	@Test
	public void testInsertColumn() {
		
		List<TableColumnModel> l;
		int i;
		
		l = this.table.getColumns();
		i = l.size();
		assertTrue(l.contains(this.table.getColumnModel(i-1)));
		assertTrue(l.contains(this.table.getColumnModel(i)));
		assertFalse(l.contains(this.table.getColumnModel(i+1)));

		l = this.table.getColumns();
		l.set(0, this.table.getColumnModel(i-1));
		l.add(this.table.getColumnModel(i-1));
		l.set(i-1, this.table.getColumnModel(i));
		l.set(i, this.table.getColumnModel(i));
		l.set(i+1, this.table.getColumnModel(i));
		
		int index = l.indexOf(this.table.getColumnModel(i-1));
		assertEquals(index + 1, l.size());
		
		l = this.table.getColumns();
		l.set(0, this.table.getColumnModel(i-1));
		l.add(this.table.getColumnModel(i-1));
		l.set(i-1, this.table.getColumnModel(i));
		l.set(i, this.table.getColumnModel(i));
		l.set(i+1, this.table.getColumnModel(i));
		
		index = l.indexOf(this.table.getColumnModel(i-1));
		assertEquals(index + 1, l.size());
		
		l = this.table.getColumns();
		l.set(0, this.table.getColumnModel(i-1));
		l.add(this.table.getColumnModel(i-1));
		l.set(i-1, this.table.getColumnModel(i));
		l.set(i, this.table.getColumnModel(i));
		l.set(i+1, this.table.getColumnModel(i));
		
		index = l.indexOf(this.table.getColumnModel(i-1));
		assertEquals(index + 1, l.size());
		
	}

	public class TestTableColumnModel extends DefaultTableColumnModel implements Serializable {

		int row;
		int column;
		DefaultTableModel model;
		List<TableCellRenderer> rendererList = new ArrayList();
		
		TestTableColumnModel( String name, List<TableColumnModel> columnModels) {
			super(name,
					 new DefaultTableColumnHeader(name, columnModels));
			this.row = 0;
			this.column = 0;
			this.model = (DefaultTableModel) this.getColumnModel(column) ;
		}
	}
		
	public static class TestTableModel extends DefaultTableModel {
		public static final String COLUMN_DESCRIPTION = "COLUMN_DESCRIPTION";
		public static final String COLUMN_NAME = "COLUMN_NAME";
		public static final String CELL_KEY = "CELL_KEY";
		public static final String COLUMN_KEY = "COLUMN_KEY";
		public static final String COLUMN_CLASS = "COLUMN_CLASS";
		public static final int TOTAL_ROWS = 1;
		public static final int TOTAL_COLUMNS = 1;
		public static final String[] COLUMN_DESCRIPTIONS = {
			"A1",
			COLUMN_DESCRIPTION,
			COLUMN_NAME + COLUMN_DESCRIPTION
		};
		
		public String[] getColumnDescription() {
			return COLUMN_DESCRIPTIONS;
		}
	}
}