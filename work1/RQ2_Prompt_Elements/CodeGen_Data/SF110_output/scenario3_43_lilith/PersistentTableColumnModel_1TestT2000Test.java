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
int tableColumns_private_field;

		@Test
    public  void test_getColumnCount() {
		DefaultTableColumnModel tableModel = new DefaultTableColumnModel();
		Assert.assertEquals("Incorrect size of returned table columns array", 0,tableModel.getColumnCount(true));
		tableModel.addColumn(TableColumn.createHeaderLabel("Column 1"), new DefaultTableColumn_1());
		Assert.assertEquals("Incorrect size of table columns array", 1,tableModel.getColumnCount(true));
    }
			@Test
    public void test_iterator() {
         assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("Column 1"),TableColumn.createHeaderLabel("Column 2"),TableColumn.createHeaderLabel("Column 3")},getColumns() );
    }

    @Test
    public void test_getColumnCountOnlyVisible() {
        List<TableColumn> tableColumns = new ArrayList<TableColumn>();
        tableColumns.add(TableColumn.createHeaderLabel("Column 1"));
        tableColumns.add(TableColumn.createHeaderLabel("Column 2"));
        tableColumns.add(TableColumn.createHeaderLabel("Column 3"));
		DefaultTableColumnModel tableModel = new DefaultTableColumnModel();
		tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_1());
		tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_2());
        tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_3());
		assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("Column 1") },getColumns());
        assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("Column 3") },getColumns());
    }
    
    @Test
    public void test_getColumn_noChange() {
        List<TableColumn> tableColumns = new ArrayList<TableColumn>();
        tableColumns.add(TableColumn.createHeaderLabel("The Column"));
        tableColumns.add(TableColumn.createHeaderLabel("The Column 2"));
        tableColumns.add(TableColumn.createHeaderLabel("The Column 3"));  
        DefaultTableColumnModel tableModel = new DefaultTableColumnModel();
        tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_1());
        tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_2());
        tableModel.addColumn(tableColumns.iterator().next(), new DefaultTableColumn_3());
        assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("The Column")},tableModel.getColumns());
        assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("The Column 2") },tableModel.getColumns());
        assertArrayEquals("Incorrect table columns", new TableColumn[]{TableColumn.createHeaderLabel("The Column 3") },tableModel.getColumns());
	}
    
	class DefaultTableColumn_1 implements TableColumn {
		public String getHeaderValue() {
			return "Column 1";
		}
        public String getHeaderName() {
			return "Column 1";
		}
        public int getModelIndex() {
            return 0;
        }

        public int getPreferredWidth() {
            return 10;
        }
        
        public Component getTableCellRendererComponent(JTable table, 
				Object value, 
				boolean isSelected, 
				boolean hasFocus, 
				int row, 
				int column) {
            if( table.getSelectedRow() == row && table.getSelectedColumn() == column ) {
//            if( table.getSelectedRow() == row 
                return null;
            }
            return this;
        }
        
        public String toString() {
            return "COLUMN1: " + getHeaderValue() + "(" + row + "," + column + ")";
        }
	}

	class DefaultTableColumn_2 implements TableColumn {
		public String getHeaderValue() {
			return "Column 2";
		}
        public String getHeaderName() {
			return "Column 2";
		}
        public int getModelIndex() {
            return 1;
        }

        public int getPreferredWidth() {
            return 10;
        }
        
        public Component getTableCellRendererComponent(JTable table, 
				Object value, 
				boolean isSelected, 
				boolean hasFocus, 
				int row, 
				int column) {
            if( table.getSelectedRow() == row && table.getSelectedColumn() == column ) {
                return null;
            }
            return this;
        }

        public String toString() {
            return "COLUMN2: " + getHeaderValue() + "(" + row + "," + column + ")";
        }
	}

	class DefaultTableColumn_3 implements TableColumn {
		public String getHeaderValue() {
			return "Column 3";
		}
        public String getHeaderName() {
			return "Column 3";
		}
        public int getModelIndex() {
            return 2;
        }

        public int getPreferredWidth() {
            return 10;
        }

        public Component getTableCellRendererComponent(JTable table, 
				Object value, 
				boolean isSelected, 
				boolean hasFocus, 
				int row, 
				int column) {
            if( table.getSelectedRow() == row && table.getSelectedColumn() == column ) {
                return null;
            }
            return this;
        }

        public String toString() {
            return "COLUMN3: " + getHeaderValue() + "(" + row + "," + column + ")";
        }
	}

}

