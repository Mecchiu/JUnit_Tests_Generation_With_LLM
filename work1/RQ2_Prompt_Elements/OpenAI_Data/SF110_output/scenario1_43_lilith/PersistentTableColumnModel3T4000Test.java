// PersistentTableColumnModelTest.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a null identifier.
	*/
	@Test
	void testGetColumnIndexNullIdentifier() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		assertThrows(IllegalArgumentException.class, () -> columnModel.getColumnIndex(null, true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is not found.
	*/
	@Test
	void testGetColumnIndexIdentifierNotFound() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		assertThrows(IllegalArgumentException.class, () -> columnModel.getColumnIndex("not found", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found.
	*/
	@Test
	void testGetColumnIndexIdentifierFound() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		assertEquals(0, columnModel.getColumnIndex("found", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumn() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is true.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnOnlyVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertThrows(IllegalArgumentException.class, () -> columnModel.getColumnIndex("found", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible2() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible3() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible4() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible5() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible6() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible7() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible8() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible9() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is found in a hidden column and onlyVisible is false.
	*/
	@Test
	void testGetColumnIndexIdentifierFoundInHiddenColumnNotOnlyVisible10() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("found");
		columnModel.addColumn(column);
		column.setMinWidth(0);
		column.setMaxWidth(0);
		assertEquals(0, columnModel.getColumnIndex("found", false));
	}
}