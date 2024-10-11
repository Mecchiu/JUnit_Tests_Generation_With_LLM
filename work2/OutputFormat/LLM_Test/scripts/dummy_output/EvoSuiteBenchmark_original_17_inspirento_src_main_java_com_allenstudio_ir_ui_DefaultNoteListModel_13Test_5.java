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
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		/**
		* Test for <code>get(int)</code> method as parameter.
		* Use it to create ListModel by passing an index and a Note
		* @throws NoSuchElementException if the index is out of range (index &lt; 0 || index &gt;= size()
		*/
		@Test
		// test the default NoteListData (ListModel) by passing no elements
		public void testDefaultDefaultNoteListModel_13_01() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.DEFAULT, 1, 1);
			try {
				model.get(0);
				assertTrue("No more element returned", false);
			} catch (ArrayIndexOutOfBoundsException ex) {
				assertEquals("Wrong index returned", 0, ex.getIndex()-2);
			}
		}

	// test the given model by passing an iterator to the array element by
	// passing the index and an element to the corresponding ListModel element
		@Test
		// tests if the corresponding ListModel is an EntrySet (Collection)
		public void testDefaultNoteListModel_13_02() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.DEFAULT, 1, 1);
			model.add(AbstractNote.TRASH, 2, 2);
			List modelList = Collections.singletonList(model);
			assertEquals("List model is not empty",!(model.iterator()
					.hasNext()), false);
			model.iterator().remove();
			assertEquals("List model is not empty", model.iterator().hasNext(), false);
			assertEquals("List model is not empty", model.entrySet().iterator().hasNext(), false);
		}

		// test the given model by passing an iterator to the array element by
		// passing the index and an element to the corresponding ListModel element
		@Test
		// tests if the corresponding ListModel is an Set (Set)
		public void testDefaultNoteListModel_13_03() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.TRASH, 2, 2);
			model.add(AbstractNote.TRASH, 3, 3);
			model.iterator().remove();
			model.iterator().removeLast();
			assertTrue("Number of elements is not even after remove of", model.size()<2);
			assertTrue("set does not have any element", model.iterator().hasNext());
			assertTrue("list contains the last element", model.iterator().next()
					.getObject().equals(AbstractNote.DEFAULT));
			Set<AbstractNote> set = model.elementSet();
			if (set.isEmpty()) {
				throw new AssertionError("It shouldn't have a empty set.");
			}
		}

	/**
	 * Tests the given model by calling a method called <code>iterator().removeLast()</code>.
	 */
		@Test
		public void testDefaultNoteListModel_13_03b() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.TRASH, 2, 2);
			model.iterator().removeLast();
			assertEquals("Iterator has a non-default element", model.iterator().getNext().getObject(), AbstractNote.TRASH);
		}

		/**
		 * Tests the given model by calling a method called <code>iterator().pollLast()</code>.
		 */
		@Test
		public void testDefaultNoteListModel_13b() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.TRASH, 2, 2);
			assertEquals("Iterator has a non-default element", model.iterator().getNext().getObject(), AbstractNote.TRASH);
			model.iterator().pollLast();
			assertNull("Iterator has a non-default element", model.iterator().getNext().getObject());
		}
		/**
		 * Tests the given model by calling a method called <code>add(AbstractNote,
		 * DefaultNote)</code>.
		 */
		@Test

		public void testDefaultNoteListModel_13_04() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.TRASH, 2, 2);
			model.add(AbstractNote.TRASH, 3, 3);
			boolean passed = model.iterator().hasNext();
			Iterator iterator = model.iterator();

	      	//test that add() method does not raise ArrayIndexOutOfBoundsException
			model.iterator().remove();
			assertTrue("Iterator should not be removed for add()", passed);
			assertTrue("After remove the DefaultNoteListModel's iterator is not removed", model.iterator().hasNext());
			assertTrue("After remove the DefaultNoteListModel's iterator is not removed", model.iterator().hasNext());
	}

	/**
	 * test the add() method when the argument is of type <code>AbstractNote</code>
	 */
	@Test
		public void testIsOfTypeDefaultNote() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.add(AbstractNote.DEFAULT, 1, 1);
			assertTrue("It shouldn't contain the new item", model.iterator().hasNext());
			AbstractNote currentElement = model.iterator().next();

			AbstractNote nonDefaultElement = new DefaultNote(currentElement);
			assertFalse("It shouldn't have a new Object after creation of the new element",
					model.get(4).equals(nonDefaultElement));
		}
}