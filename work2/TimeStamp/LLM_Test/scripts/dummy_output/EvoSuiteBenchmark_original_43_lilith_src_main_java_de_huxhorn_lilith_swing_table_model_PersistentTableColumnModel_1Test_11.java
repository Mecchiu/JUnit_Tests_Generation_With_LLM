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
		
    /**
     * Tests the getColumnCount() method.
     */
    @Test
    public void testGetColumnCount() {
        assertEquals(0, PersistentTableColumnModel.getColumnCount(true));
        assertEquals(0, PersistentTableColumnModel.getColumnCount(false));
    }
	
}