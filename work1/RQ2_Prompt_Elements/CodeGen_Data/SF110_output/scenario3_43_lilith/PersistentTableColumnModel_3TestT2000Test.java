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
/**
		 Constructs a new
		 <code>PersistentTableColumnModel_3Test</code> object.
		 @param args can be null (which is accepted by the super class)
		 */
    public PersistentTableColumnModel_3Test(Class<?>[] arg0) {
		super (arg0);
	}

    /** Test of
     * getColumnIndex.
     */
    @Test
    public void testGetColumnIndex() {
        System.out.println("getColumnIndex");
		
        DefaultTableColumnModel model = (DefaultTableColumnModel)getColumnModel(null);
        assertTrue((model.getColumnCount() == 0)
        	);
        
        List<String> firstColumn = new ArrayList<String>();
        model.setColumnPrototypeAt( 0, new TableColumn("First test"), firstColumn);
        
        firstColumn.add("First column");
        
        List<TableColumn> columns = new ArrayList<TableColumn>();
        model.setColumns(columns);
        
        assertEquals ((firstColumn.size() <= columns.size())
				      & (firstColumn.size()!= 0), columns);
    }

    /** Test of
     * getColumnCount.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        
        DefaultTableColumnModel model = new DefaultTableColumnModel();        	       
        assertTrue (0 == model.getColumnCount());
        
        DefaultTableColumn modelColumn = new DefaultTableColumn();
        model.addColumn(modelColumn);
        
        List<TableColumn> columns = new ArrayList<TableColumn>();
        model.setColumns(columns);
        
        assertFalse (ModelTest.COLUMN_EXISTS[0]);
        
        int c = (ModelTest.COLUMN_EXISTS[0]? 0 : 1);
        model.setColumnPrototypeAt(c, new TableColumn("Column test"), null);
        
        assertEquals ((ModelTest.COLUMN_EXISTS.length)
				  & (ModelTest.COLUMN_EXISTS[0] == false), columns);
    }
	
	/** Test of
     * removeColumn.
     */
    @Test
    public void testRemoveColumn() {        	
        System.out.println("removeColumn");
        
        DefaultTableColumnModel model = new DefaultTableColumnModel();		                     
        List<String> firstColumn = new ArrayList<String>();
        model.setColumnPrototypeAt(0, new TableColumn("First test"), firstColumn);

        firstColumn.add("First column");
        
        List<TableColumn> columns = new ArrayList<TableColumn>();
        model.setColumns(columns);
        
        model.removeColumn(new TableColumn("Column test"));
        
        assertTrue(columns.isEmpty());
        assertFalse(0!= model.getColumnCount());
    }
	
	/** Test of
     * addColumn.
     */
    @Test
    public void testAddColumn() {        	
        System.out.println("addColumn");
        
        DefaultTableColumnModel model = new DefaultTableColumnModel();		                     
        List<String> firstColumn = new ArrayList<String>();
        model.setColumnPrototypeAt(0, new TableColumn("First test"), firstColumn);

        List<TableColumn> columns = new ArrayList<TableColumn>();
        model.setColumns(columns);
        
        model.addColumn(new TableColumn("Column test"));
        
        assertTrue (1 == model.getColumnCount());
        assertTrue (0!= model.getColumnCount());

    }
}
