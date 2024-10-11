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
    public void test() {
		
    	DefaultTableColumnModel columnModel;
		
        // Test column model for first column, which is not present (null).
		
        int columnIndex = 0;
        columnIndex = columnModel = PersistentTableColumnModel.getColumnIndex(columnIndex, false);
        assertFalse("Column index for first column not present.", columnIndex > 0);

        // Test column model for the last column, which is not present (null).
        
        columnIndex = columnModel.getColumnCount() - 1;
        columnIndex = columnIndex;
        columnIndex = columnModel.getColumns()[columnIndex]!= null? columnIndex : -1;
        assertFalse("Column index for last column not present.", columnIndex > 0 && columnIndex < columnModel.getColumnCount());

        // Test column model for the first column, which is not present (null).
    	
        columnModel = PersistentTableColumnModel.getColumnModel(columnModel);
        columnModel = PersistentTableColumnModel_3Test.getColumnModel(columnModel);
        
        columnIndex = columnModel.getColumnIndex(columnIndex, false);
        assertFalse("Column index for first column not present.", columnIndex > 0);
        
        // Test column model for the last column, which is not present (null).
		
        columnIndex = columnModel.getColumnCount() - 1;
        columnModel = PersistentTableColumnModel.getColumnModel(columnIndex);
        
        columnIndex = columnModel.getColumnCount() - 1;
        columnIndex = columnIndex;
        columnIndex = columnModel.getColumns()[columnIndex];
        assertFalse("Column index for last column not present.", columnIndex > 0 && columnIndex < columnModel.getColumnCount());
        
        // Test column index for the columns with no data.
        
        Iterator<TableColumn> columnIterator = columnModel.iterator();
        TableColumn tableColumn = columnIterator.next();
        assertEquals("Column index not initialized correctly.", 0, columnModel.getColumnIndex(tableColumn));
        
        while (columnIterator.hasNext()) {
            tableColumn = columnIterator.next();
            assertEquals("Column index not initialized correctly.", 0, columnModel.getColumnIndex(tableColumn));
        }
    }
    
    // PersistentTableColumnModel_3Test.java void.
    
    static class Test {
        
        /**
         * Test the behavior of getColumnIndex (using the columnModel's default table columnModel).
         */
        @Test
        void testGetColumnIndex() {
        
            TableColumn tableColumn = new TableColumn();
            DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
            tableColumn.setModel(getColumnModel(columnModel));
            
            persistentView(columnModel);
            persistentView(columnModel);
        }
        
        /**
         * Test the behavior of getColumnIndex (using table's rowModel).
         */
        @Test
        void testGetColumnIndex_TableColumnModel() {

            TableColumn tableColumn = new TableColumn();
            DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
            tableColumn.setModel(getColumnModel(columnModel));
            
            List<TableColumn> columns = new ArrayList<TableColumn>();
            columns.add(tableColumn);
            
            List<TableColumn> tableColumns = PersistentTableColumnModel_3Test.getColumns(columnModel);
            columns.addAll(tableColumns);
            
            persistentView(columnModel);
            persistentView(columnModel);
            persistentView(columnModel);
        }
  	
    	private static void persistentView(DefaultTableColumnModel columnModel) {
    		persistentView(columnModel, 0);
    	}

        private static void persistentView(DefaultTableColumnModel columnModel, int row) {

            synchronized (columnModel) {
                TableColumn tableColumn = new TableColumn();
                tableColumn.setModel(columnModel);
                tableColumn.setText("Test");
            }
            
            persistentView(tableModel(tableColumn), row);
        }

        private static TableModel tableModel(TableColumn tableColumn) {
        	return new TableModel() {
					
					@Override
					public TableColumn getColumn(int column) {
                        return tableColumn;
					}

					@Override
					public TableColumn getColumn(Object name) {
                        return null;
					}

					@Override
					public String getColumnName(int column) {
                    	return "Column " + column;
					}
			
		        };
		}
    }
    
    static class TestTableModel extends PersistantTableModel {  	
  	
        @Override
        public TableModel tableModel() {  	
                return new TestTableModel();
        }
    }
}