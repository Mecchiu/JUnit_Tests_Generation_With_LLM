// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {

	/**
	* Test case 1:
	* Test the {@link DefaultNoteListModel#toArray()} method.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a null parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a empty array parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too small.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains null.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains null and non-null.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains non-null.
	*/
	@Test
	void testToArray() {
		// Test the DefaultNoteListModel#toArray() method.
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		Object[] array = model.toArray();
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method.
		array = model.toArray(new Object[0]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a null parameter.
		array = model.toArray(null);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a empty array parameter.
		array = model.toArray(new Object[0]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter.
		array = model.toArray(new Object[5]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too small.
		array = model.toArray(new Object[4]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large.
		array = model.toArray(new Object[6]);
		assertEquals(6, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large and contains null.
		array = model.toArray(new Object[6]);
		array[5] = null;
		array = model.toArray(array);
		assertEquals(6, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large and contains null and non-null.
		array = model.toArray(new Object[6]);
		array[5] = null;
		array[4] = new Object();
		array = model.toArray(array);
		assertEquals(6, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large and contains non-null.
		array = model.toArray(new Object[6]);
		array[5] = new Object();
		array = model.toArray(array);
		assertEquals(6, array.length);
	}
}

// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_13Test {
		
	/**
	* Test case 1:
	* Test the {@link DefaultNoteListModel#toArray()} method.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a null parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a empty array parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too small.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains null.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains null and non-null.
	* Test the {@link DefaultNoteListModel#toArray(Object[])} method with a array parameter which is too large and contains non-null.
	*/
	@Test
	void testToArray() {
		// Test the DefaultNoteListModel#toArray() method.
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		Object[] array = model.toArray();
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method.
		array = model.toArray(new Object[0]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a null parameter.
		array = model.toArray(null);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a empty array parameter.
		array = model.toArray(new Object[0]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter.
		array = model.toArray(new Object[5]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too small.
		array = model.toArray(new Object[4]);
		assertEquals(5, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large.
		array = model.toArray(new Object[6]);
		assertEquals(6, array.length);
		
		// Test the DefaultNoteListModel#toArray(Object[]) method with a array parameter which is too large and contains null.
		array = model.toArray(new Object[6]);
	