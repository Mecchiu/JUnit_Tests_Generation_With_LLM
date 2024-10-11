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
	* with the following parameters:
	* <ul>
	* <li>identifier: null</li>
	* <li>onlyVisible: false</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_1() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = null;
		boolean onlyVisible = false;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier is null.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: false</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = false;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: true</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = true;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: false</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = false;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: true</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_5() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = true;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: false</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_6() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = false;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the following parameters:
	* <ul>
	* <li>identifier: "test"</li>
	* <li>onlyVisible: true</li>
	* </ul>
	*
	* @throws IllegalArgumentException if <code>identifier</code>
	*                                  is <code>null</code>, or if no
	*                                  <code>TableColumn</code> has this
	*                                  <code>identifier</code>
	*/
	@Test
	public void testGetColumnIndex_7() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		Object identifier = "test";
		boolean onlyVisible = true;
		try {
			persistentTableColumnModel.getColumnIndex(identifier, onlyVisible);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Identifier not found: test", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with the