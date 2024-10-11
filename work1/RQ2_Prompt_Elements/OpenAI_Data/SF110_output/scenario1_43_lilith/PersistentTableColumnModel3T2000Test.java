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
	* with an identifier that is not contained in the column model.
	*/
	@Test
	void testGetColumnIndexNotContainedIdentifier() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		assertThrows(IllegalArgumentException.class, () -> columnModel.getColumnIndex("not contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model.
	*/
	@Test
	void testGetColumnIndexContainedIdentifier() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		assertThrows(IllegalArgumentException.class, () -> columnModel.getColumnIndex("contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible2() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible3() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible4() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible5() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible6() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", true));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible7() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		assertEquals(0, columnModel.getColumnIndex("contained", false));
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with an identifier that is contained in the column model but not visible.
	*/
	@Test
	void testGetColumnIndexContainedIdentifierVisible8() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("contained");
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		columnModel.removeColumn(column);
		columnModel.addColumn(column);
		