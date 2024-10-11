// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
	private final static String[] stringsArray = new String[0];
			
	/**
	* Tests the method of {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
	* @verifies return -1 if the list is empty; {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method returns -1 when the <code>list</code> does not contain <code>null</code> objects, and returns the integer value of the first occurrence
	*/
	@Test
	public void indexOf_1ShouldReturn() {
		String[] strings = stringsArray;
		assertNotNull(strings);
		assertTrue(strings.length > 0);
		assertNotSame(strings.length, 0);
		
		// case 0-1
		assertTrue(
				ArrayUtils.indexOf(
					Arrays.asList("A", null),
					"A") == 0);
		
		// case 2-3
		setStrings(strings);
		int size = stringsArray.length;
		assertEquals(0, size);
		// assert that if size or strings.length == 0, indexOf is not
		// overwritten;
		
		setStrings(null);
		assertEquals(0, size);
		// assert that if size or strings.length == 0, indexOf is not
		// overwritten;
		
		setStrings(strings);
		assertTrue(0 < size && size < strings.length);
		// assert that if size and strings.length == 0 then null (or an array
		// containing one) is not overwritten;
	}
	
	/**
	 * Tests the method of {@link DefaultNoteListModel#indexOf(String,int)}.
	 * @verifies return -1 if the <code>string</code> is null; {@link DefaultNoteListModel#indexOf(String,int)} method returns -1 when <code>elem</code> is not in the list
	 */
	@Test
	public void indexOf_2ShouldReturn() {
		String[] strings = stringsArray;
		assertNotNull(strings);
		assertTrue(strings.length > 0);
		assertNotSame(strings.length, 0);
		
		// case 0-1
		assertTrue(
				ArrayUtils.indexOf(
					Arrays.asList(null),
					"A") == 0);
		
		// case 2-3
		setStrings(strings);
		assertEquals(0, size);
		// assert that if size and strings.length == 0, indexOf is not
		// overwritten;
		
		setStrings(null);
		assertEquals(0, size);
		// assert that if size and strings.length == 0 then null (or an array
		// containing one) is not overwritten;
	}
	
	/**
	 * Tests the method of {@link DefaultNoteListModel#getValueAt(int)}.
	 * @verifies return null when a null value is returned; {@link DefaultNoteListModel#getValueAt()} method returns null
	 */
	@Test
	public void getValueAt_1ShouldReturnNull() {
		assertNull(DefaultNoteListModel.getValueAt(""));
	}
	
	/**
	 * Tests the method of {@link DefaultNoteListModel#setValueAt(String, int)}.
	 * @verifies change value of string (case 0)
	 */
	@Test
	public void setValueAt_2ShouldChangeStringValue() {
		String[] strings = stringsArray;
		defaultSetValue(strings[0]);
		assertEquals("A", DefaultNoteListModel.getValueAt(0));
		
		strings[0]=null;
		strings[1]=strings[1] + "!!!";
		defaultSetValue(strings[0]);
		assertEquals("A!!!"+strings[0], DefaultNoteListModel.getValueAt(1));
	}
	
	/**
	 * Tests the method of {@link DefaultNoteListModel#setValueAt(String,int)}.
	 * @verifies add string value with 0-based index into a different string
	 */
	@Test
	public void setValueAt_3ShouldAddStringValueWithZeroBasedIndex() {
		String[] strings = stringsArray;
		setStrings(strings[0]);
		setStrings(strings[2], strings[1], strings[0]);
		defaultSetValue(strings[0]);
		defaultSetValue(strings[2]);
		defaultSetValue(strings[1]);
		assertEquals("A!!!!!B", DefaultNoteListModel.getValueAt(0));
		assertEquals("A", DefaultNoteListModel.getValueAt(2));
		assertEquals("B", DefaultNoteListModel.getValueAt(1));
	}
	
	
	private void defaultSetValue(String element) {
		defaultSetValue(new Object[] { element });
	}

	/**
	*
	* @param objects the object to set
	*/
	private void defaultSetValue(Object[] objects) {
		for (Object obj : objects) {
			DefaultNoteListModel.setValueAt(obj, 0);
		}
	}
	
	private void setStrings(String[] values) {
		for (int i = 0; i < values.length; i++) {
			DefaultNoteListModel.setValueAt(values[i], i);
		}
	}
	
	/**
	*
	* @param strings the vector to set
	*/
	private void setStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			DefaultNoteListModel.setValueAt(strings[i], i);
		}
	}
	
	private void defaultSetValue(String value) {
		DefaultNoteListModel.setValueAt(value, 0);
	}
	
	private List<Object> getNotList() {
		return Collections.emptyList();
	}
	
	private List<Object> getNonEmptyList() {
		return new ArrayList<Object>();
	}
	
	private interface AddListener extends NoteListDataListener {
		public Object[] getResult();
		public Object[][] getResult2();
		
		public abstract void update();
	}
	
	
	private class AddListenerImpl implements AddListener {
		
		private AddListener listener;
		private int listCount;
		
		@Override
		public Object[] getResult() {
			return listener.getResult();
		}
		
		public void update() {/* empty */}
		
		@Override
		public Object[][] getResult2() {
			return listener.getResult2();
		}

}
}