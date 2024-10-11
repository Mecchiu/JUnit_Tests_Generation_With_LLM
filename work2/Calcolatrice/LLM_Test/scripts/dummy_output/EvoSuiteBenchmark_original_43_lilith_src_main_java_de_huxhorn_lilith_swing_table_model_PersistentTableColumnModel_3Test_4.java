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
* Test method for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}.
*/
    @SuppressWarnings("unused")
	public void testGetColumnIndex1() {
    	DefaultTableColumnModel cm1 = new PersistentTableColumnModel();
    	TableColumn column1 = cm1.getColumn(2);
    	assertTrue(cm1.indexOf(column1) > 0);
    	assertTrue(false);
	}
	
	/**
* Test method for {@link PersistentTableColumnModel#getColumnIndex(Object)}.
*/
    @SuppressWarnings("unused")
	public void testGetColumnIndex2() {
    	DefaultTableColumnModel cm1 = new PersistentTableColumnModel();

        int index1 = cm1.getColumnIndex("String1");
        int index2 = cm1.getColumnIndex(null);
        assertTrue(index1 > 0);
        assertTrue(index2 > 0);
    }
    
}