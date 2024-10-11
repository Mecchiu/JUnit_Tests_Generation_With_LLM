// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		/**
     * This unit test case has tests with two components: {@link DefaultNoteListModel#firstElement()}
     * and {@link DefaultNoteListModel#lastElement()}. The test case also contains one unit test case,
     * {@link DefaultNoteListModel#insertAfterLastComponentTest()} as well as the unit test case
     * {@link DefaultNoteListModel#insertBeforeLastComponentTest()} and has one unit test case.
     */
	@Test
		public void firstElementTest() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			DefaultNote last;

			last = model.firstElement();
			assertEquals("Could not find last component", last, model.lastElement());

			last.remove();
			AbstractNote first = model.firstElement();
			assertEquals("Could not find first component", first, last.next());
			AbstractNote lastElementNode = last.next();
			lastElementNode.remove();
			model.lastElement() = null;

			model.insertAfterLastComponentTest();
			lastElementNode = last.next();

			assertFalse("Failed to return next element", lastElementNode == null);
			AbstractNote lastElementNode2 = lastElementNode.next();
			assertTrue("Found more next element in list", lastElementNode2!= lastElementNode);
		}

		/**
     * This unit test case has tests with two components: {@link DefaultNoteListModel#firstElement()}
     * and empty vector of elements
     *
	* This test case has a different behaviour. The test case is now commented. 
	* <b>this<b> test case now has a vector of nulls</b> and needs another class which extends
	* AbstractNote and implements NoteListModel. Vector contains nulls and Vector which contains the
	* elements in the test vector but which is not in the ListModel</b>
	 */
	public void insertBeforeLastComponentTest() {
			final DefaultNoteListModel listModel = new DefaultNoteListModel();
			final NullList first = new NullList();
			final NullList last = new NullList();
			final nullList prev = new nullList();

			listModel.lastElement = prev = new nullList();

			first.add(listModel.firstElement());
			first.add(listModel.firstElement());
			last.add(listModel.firstElement());

			listModel.lastElement = last;

			assertNull("Should not find first component of vector", listModel.firstElement());
			first.set(0, first.get(0));
			listModel.insertBeforeLastComponentTest();

			assertNotNull("Should have found first component of vector", listModel.firstElement());
			assertNotNull("Should have found first component of vector", listModel.lastElement());
			assertFalse("Should have found first component of empty vector first", first.contains(listModel.firstElement()));
			assertTrue("Should have found first component of empty vector first", prev.contains(listModel.firstElement()));

			listModel.lastElement = last;

			assertNull("Should not find empty vector", listModel.lastElement());

			for (Entry<AbstractNote, AbstractNote> element :  first.elements()) {
				AbstractNote prevElement = null;
				prevElement = listModel.firstElement();
				assertNull("Found previous position", prevElement);
				assertNull("Found prev position", prevElement.next());
				if (listModel.firstElement() == null || prev.isEmpty()) {
					System.out.println("Error in test: null prev element: " + listModel.firstElement());
				}
				assertEquals("Found empty position", 0, prevElement.next().numericValue());
			}

			first.add(listModel.firstElement());
			first.add(last);

			for (AbstractNote n : first.elements()) {
				listModel.insertBeforeLastComponentTest();
			}

			listModel.lastElement = last;

			for (Entry<AbstractNote, AbstractNote> element :  first.elements()) {
				AbstractNote prevElement = null;
				prevElement = listModel.firstElement();
				assertNotNull("Found previous position", prevElement);
				assertTrue("Found prev position", prevElement == listModel.firstElement());
				assertTrue("Found prev position",!prev.contains(listModel.firstElement()));
			}

			assertFalse("Should not find null elements in ListModel", listModel.firstElement() == null);
			assertFalse("Should not find null elements in ListModel", listModel.lastElement() == null);

			assertTrue("Should find first and last item from listModel", listModel.contains(first) &&  listModel.contains(listModel.lastElement()) && listModel.contains(last));
	}

	public class NullList extends AbstractNote {
		public NullList(AbstractNote next, AbstractNote prev) {
			super(next, prev);
		}
	}
	public class nullList extends AbstractNote {
		public nullList(AbstractNote next, AbstractNote prev) {
			super();
		}
		public void remove() {
			throw new UnsupportedOperationException("Can't remove in NullList");
		}
	}

	public class nulllist extends AbstractNote {
		public boolean contains(AbstractNote element) {
			return false;
		}
	}

	public class NullList extends AbstractNoteListModel.NullList {
		public void insertAfterLastComponentTest() {
			throw new UnsupportedOperationException("Can't insert AfterLastComponent in NullList");
		}
	}
}