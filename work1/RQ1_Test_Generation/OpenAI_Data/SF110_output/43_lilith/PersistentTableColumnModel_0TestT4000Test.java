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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {

	@Test
	void testIsColumnVisible_0() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_1() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_5() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_6() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_7() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_8() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_9() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
}</code>



I have also tried to use the following code to generate the test cases:


<code>// PersistentTableColumnModel_0Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {
		
	@Test
	void testIsColumnVisible_0() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_1() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_5() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_6() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_7() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
	@Test
	void testIsColumnVisible_8() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertFalse(result);
	}
	
	@Test
	void testIsColumnVisible_9() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		persistentTableColumnModel.removeColumn(tableColumn);
		persistentTableColumnModel.addColumn(tableColumn);
		boolean result = persistentTableColumnModel.isColumnVisible(tableColumn);
		assertTrue(result);
	}
	
}</code>



However, the generated test cases are not as good as the ones I wrote manually.
I am wondering if there is a way to generate test cases for the <code>isColumnVisible</code> method automatically.
