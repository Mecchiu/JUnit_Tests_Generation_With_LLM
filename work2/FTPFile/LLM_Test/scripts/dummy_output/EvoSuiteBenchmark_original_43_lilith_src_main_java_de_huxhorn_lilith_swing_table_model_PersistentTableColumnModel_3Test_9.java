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
	 * @see #getColumnIndex(Object, boolean)
	 */
	@Test
	public final void Test_GetColumnIndex_getColumnIndex() {
		List<TableColumn> expected = new ArrayList<>();
		expected.add(getDefault(null)); // id
		expected.add(getDefault(true)); // visible
		expected.add(get(2)); // row
		expected.add(get(1)); // column
		expected.add(get(1));  // cell editor
		expected.add(get(10)); // column type
		expected.add(get(5));  // column data
		expected.add(getDefault(false)); // cell editor
		expected.add(getDefault(false));
		expected.add(get(4)); // cell renderer
		expected.add(get(3)); // cell renderer
		expected.add(getDefault(null)); // cell editor
		expected.add(getDefault(false));
		expected.add(getDefault(true));
		expected.add(getDefault(false));
		expected.add(getDefault(false));
		expected.add(getDefault(false));
		expected.add(getDefault(false));
		
		assertEquals(3, PersistentTableColumnModel.getColumnIndex(null,""));
		
		assertEquals(0, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(-1, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(-1, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(0, PersistentTableColumnModel.getColumnIndex(""));
		assertEquals(1, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(2, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(0, PersistentTableColumnModel.getColumnIndex(""));
		assertEquals(1, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(2, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(0, PersistentTableColumnModel.getColumnIndex(""));
		assertEquals(1, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(2, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(0, PersistentTableColumnModel.getColumnIndex(null,""));
		assertEquals(1, PersistentTableColumnModel.getColumnIndex(null,""));
}
}