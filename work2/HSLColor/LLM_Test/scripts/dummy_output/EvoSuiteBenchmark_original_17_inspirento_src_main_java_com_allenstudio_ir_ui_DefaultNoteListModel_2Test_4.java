// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
	/**
	 * {@inheritDoc}
	 * @since 2.0.0
	 */
	@Test
	public void testElements() {
		DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
		Enumeration<AbstractNote> enumeration = defaultNoteListModel.elements();
		
		// Tests the element methods
		assertTrue(enumeration.hasMoreElements());
		
		// Tests the nextElement method
		AbstractNote element = enumeration.nextElement();
		assertNotNull(element);
		assertInstanceOf(element, AbstractNote.class);
		assertEquals(element.getNote(), "Test element ");
		
		// Tests the hasNext method
		assertTrue(enumeration.hasMoreElements());
		
		// Tests the remove method
		final DefaultNoteListModel listModel = new DefaultNoteListModel();
		assertEquals(defaultNoteListModel, listModel);
		listModel.remove(new NoteListDataEvent("Test", 1));
		assertFalse(enumeration.hasMoreElements());
	}

	/**
	 * 
	 * A test case for {@link DefaultNoteListModel#elements()} without any methods, 
	 * test if the {@link DefaultNoteListModel} implements any methods.
	 * 
	 */
	@Test
	void testElementsNoMethods() {
		// This test class checks no methods. The only instance of {@link DefaultNoteListModel} is in 
		// tests for {@link #testElements}
	}
	
	/**
	 * A test case for {@link DefaultNoteListModel#getElement(long, java.util.Collection, boolean)} without any 
	 * parameters. It tests the {@link DefaultNoteListModel#getElement(long, java.util.Collection, boolean)} 
	 * method without any parameters while there are only 5 parameters.
	 *
	 */
	@Test
	void testGetElementNoParameters() {
		DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
		
		// Gets all elements via a collection 
		Enumeration<?> elements = defaultNoteListModel.getElements(10, null, true);
		assertTrue(elements!= null);
		
		// Gets all elements via a Collection 
		Enumeration<?> elements2 = defaultNoteListModel.getElements(null, null, false);
		assertTrue(elements2!= null);
		
		// Gets a single element via a Collection 
		Enumeration<?> elements3 = defaultNoteListModel.getElements(null, Arrays.asList(new Object[] {"Test", 1}), false);
		assertTrue(elements3!= null);
		
		// Gets no elements via a Collection 
		Enumeration<?> elements4 = defaultNoteListModel.getElements(10, Arrays.asList(new Object[] {"Test"}), false);
		assertTrue(elements4 == null); 
	}

	/**
	 * A test case for {@link DefaultNoteListModel#putElement(long, Object, Object)}
	 *
	 */
	@Test
	void testPutElement() {
		DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
	
		// Tests the method {@link DefaultNoteListModel#putElement}
		defaultNoteListModel.putElement(10L, new SimpleNote("123"), "123");
		assertEquals(new Object[] {"123", "123"}, defaultNoteListModel.getElements()); 
	}
	
	/**
	 * A test case for {@link DefaultNoteListModel#putElements(java.util.Collection, Object, Object)}
	 */
	@Test
	public void testPutElements() {
		DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
		
		// Tests the method {@link DefaultNoteListModel#putElements}
		defaultNoteListModel.putElements(Arrays.asList(new SimpleNote("123"), new SimpleNote("456")), new SimpleNote("123"), "123");
		assertFalse(defaultNoteListModel.containsAll(Arrays.asList(new Object[] {"123", "123"}, new Object[] {"456", "123"})));
	}


	/**
	 * A Testcase for the {@link NoteListDataListener} associated with {@link DefaultNoteListModel}
	 *
	 */
	class MyNoteListDataListener implements NoteListDataListener {
		
		/**
		 * {@inheritDoc}
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void noteListDataChanged() {
			// Checks if there are nothing added or removed
			if((new SimpleNote("123")).equalsIgnoreCase(defaultNoteListModel.getElements().nextElement())) {
				defaultNoteListModel.remove(new NoteListDataEvent("Test", 0L));
			}

			defaultNoteListModel.add(new SimpleNote("123"), new SimpleNote("345"));
		}
	}
}