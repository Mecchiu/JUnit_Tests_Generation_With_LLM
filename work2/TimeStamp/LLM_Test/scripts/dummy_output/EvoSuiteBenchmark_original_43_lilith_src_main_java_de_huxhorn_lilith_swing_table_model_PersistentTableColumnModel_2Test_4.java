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
	 * Test method for {@link PersistentTableColumnModel#getColumns(boolean)}.
	 * @throws Exception
	 */
	@Test
	void testGetColumns() throws Exception {
		Iterator<TableColumn> it = getColumns(false).iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertEquals(it.next().getModelIndex(), 0);
		assertTrue(it.hasNext());
		assertEquals(it.next().getModelIndex(), -1);
		assertFalse(it.hasNext());
	}
	
    /**
     * Test method for {@link PersistentTableColumnModel#getColumnCount()}.
     */
    @Test
    public void testGetColumnCount() {
        int cols = 0;
        int i = 0;
        i = 0;
        while (i < 100) {
            cols = list.get(i).getModelIndex();
            assertTrue(i < getColumnCount());
            i++;
        }
    }
}