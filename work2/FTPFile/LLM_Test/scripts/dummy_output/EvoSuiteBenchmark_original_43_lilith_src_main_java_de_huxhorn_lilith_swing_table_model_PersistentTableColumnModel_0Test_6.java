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
		
  /**
   * @jbduc 2007-june-24
   * Creates a new <code>PersistentTableColumnModel</code>
   * with the specified width of <code>1</code> and makes it visible.
   *
   * @return a new <code>PersistentTableColumnModel</code>.
   */
  public DefaultTableColumnModel createPersistentTableColumnModel() {
    DefaultTableColumnModel dtm = new DefaultTableColumnModel();
    dtm.setColumnWidth(1, 10d);
    return dtm;
  }
	
  /**
   * @jbuc 2007-june-24
   * Calls {@link #createPersistentTableColumnModel() createPersistentTableColumnModel()}
   * to create a new column model similar to this and then checks the default {@link DefaultTableColumnModel}
   * 
   * <p/>This method does two validations (in addition to the first of the four tests) - the second one sets up
   * the {@link DefaultTableColumnModel} to have all columns invisible, and we must create a new column model
   * that only contains those columns.
   *
   * <p/>1. The first valid column created by the first two tests.
   *
   * <p/>2. The specified column visibility check with the {@link #isColumnVisible(TableColumn)} method should be called
   * twice - the first is expected to return false, and the second call should return true.
   *
   * @throws TableColumnException if the underlying model is not compatible with this implementation of the TableColumnModel
   * TODO This test is failing yet. See the following bug:
   * https://github.com/jbuc/lilith/issues/3
   */
  @Test
  public void test_createPersistentTableColumnModel_0() throws TableColumnException{
		
    List<TableColumn> columns = new ArrayList<TableColumn>();
    // Create a new column model that corresponds to the test data, and check it's columns are visible.
		
    columns.add(new PersistentTableColumnModel_0Test.TestColumn("ColumnVisibility1", null)); // New column, visibility check with "ColumnVisibility1": true
    columns.add(new PersistentTableColumnModel_0Test.TestColumn("ColumnVisibility2", null)); // New column, visibility check with "ColumnVisibility2": true
    columns.add(new PersistentTableColumnModel_0Test.TestColumn("ColumnVisibility3", null)); // New column, visibility check with "ColumnVisibility3": true
    columns.add(new PersistentTableColumnModel_0Test.TestColumn("ColumnVisibility4", null)); // New column, visibility check with "ColumnVisibility4": true
    columns.add(new PersistentTableColumnModel_0Test.TestColumn("ColumnVisibility5", null)); // New column, visibility check with "ColumnVisibility5": true

		// Check the default model is not present.
		assertFalse("Default model should not be present", DefaultTableColumnModel.class == getClass());
		
		// Set the model to the specified column set.
		setModel(new PersistentTableColumnModel (columns.iterator()));		
		// The default model should have five columns: all visible.
		assertEquals(5, getNumberOfColumns());		
          
    // The default model should have all columns invisible.
		assertTrue("Default model should be invisible", isColumnVisible(getDefaultColumn(TABLE_COLUMNS)) == false);
		
    // Test that the default model has the correct column visibility.
		assertEquals(TableColumn.VISIBLE, getCellViewable(TABLE_COLUMNS, TABLE_COLUMNS.size() - 1).getCellColor());
		
		// Test all supported column widths that were previously set:
		for ( int i = 0; i < TABLE_COLUMNS.length; ++i ){
			
			TableColumn column = TABLE_COLUMNS[i];
			for ( int j = 0; j < TABLE_COLUMNS.length; ++j ){
				if ( j < i ){
					// Set the width of the current column.
					getCellViewable(j, i).setView(column);
				}else if ( j < ( i + 1 )){
					// Reset the width of the current column.
					getCellViewable(i, j).setView(column);
				}
			}
		}
        
  }
  
	/**
	 * The test-case for the {@link DefaultTableColumnModel#setColumnWidth(TableColumn, double)
	 * setColumnWidth(TableColumn, double)}.
	 * @since 1.21
	 */
	@Test
	public void test_setColumnWidth_0() throws Exception {
		
		System.out.println("Setting column width to 0");
		
        DefaultTableColumnModel dtm = createPersistentTableColumnModel();
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),0.0d);
        }
        dtm = createPersistentTableColumnModel();
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),(Float)1.5f);
        }
        dtm = createPersistentTableColumnModel();
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),(Float)1.5f);
        }
        dtm = createPersistentTableColumnModel();
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),(Float)1.5f);
        }
		
		dtm = createPersistentTableColumnModel(); // Setting a column width that doesn't make the given column
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),0);
        }
        dtm = createPersistentTableColumnModel();
        assertNotNull(dtm);
        for (int i = 0; i < 4; ++i) {             
            dtm.setColumnWidth(new TableColumn(TABLE_COLUMNS[i]),4.0f);
        }
        dtm = createPersistentTableColumnModel();         
        // Set the column width to a value greater than the total column width - it should be an error if less than total
        // column width.
}
}