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
		PersistentTableColumnModel_3Test() {
		}
		@Test
		public void testGetColumnIndex() { 
			setUpTableModel(4);
			assertEquals(4, Model_3Test.getColumnIndex("A"), 5); // 1st
			assertEquals(3, Model_3Test.getColumnIndex("", true), 5); // 2nd
			assertEquals((long)3, Model_3Test.getColumnIndex("B", true), 5); // 3rd
			assertNull(Model_3Test.getColumnIndex("TEST COLUMN", false));
		}
		@Test
		public void testGetTableColumnModel() { 
			setUpModel(2);
			assertSame(Model_3Test.model, Model_3Test.model.getTableModel());
		}
		@Test
		public void testSetColumnIndex() { 
			setUpTableModel(4);
			setUpModel(2);
			assertEquals(Model_3Test.model.getColumnCount(), 3); // 1st -> 2nd
			assertEquals(Model_3Test.model.getColumnCount(), 3); // 2nd -> 3rd
			assertEquals(Model_3Test.model.getColumnIndex("A"), 0, 1); // 1st, 2nd
			assertEquals(Model_3Test.model.getColumnIndex("A.value"), 3, 1); // 3th
			assertEquals(Model_3Test.model.getColumnIndex("TEST COLUMN"), (long)12l);
		}
}

//PersistentTableColumnModel_3Test.java