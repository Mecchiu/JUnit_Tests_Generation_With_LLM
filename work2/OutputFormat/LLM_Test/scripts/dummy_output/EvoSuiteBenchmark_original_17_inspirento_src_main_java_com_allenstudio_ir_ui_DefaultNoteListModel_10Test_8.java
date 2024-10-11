// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		
	/**
	 * Verify that there is at least one elements.
	 */
	@Test
	void testHasNoElements() {
		assertTrue(DefaultNoteListModel.this.hasNodes());
		assertTrue(DefaultNoteListModel.this.getNodes().isEmpty());
	}
		
	/**
	 * Verify that there are no elements in the model.
	 */
	@Test
	void testNoNodes() {
		Collection<AbstractNote> nodes = DefaultNoteListModel.this.getNodes();
		int length = nodes.size();
		
		assertEquals(length, 0);
		assertFalse(DefaultNoteListModel.this.hasNodes());
	}

	/**
	 * Verify that there is zero elements.
	 */
	@Test
	void testHasNodesNoElements() {
		assertTrue(DefaultNoteListModel.this.hasNodes());
		assertTrue(DefaultNoteListModel.this.getNodes().isEmpty());
	}
		
	/**
	 * Verify that a null note list does not throw an exception.
	 */
	@Test
	void testNullList() {
		assertFalse(DefaultNoteListModel.this.hasNodes());
		assertTrue(DefaultNoteListModel.this.getNodes()==null);
	}
		
	/**
	 * Verify that a null note does not throw an exception.
	 */
	@Test
	void testNullNote() {
		assertFalse(DefaultNoteListModel.this.hasNodes());
		assertTrue(DefaultNoteListModel.this.getNodes()==null);
	}
		
	/**
	 * Verify that note list is ordered by start time.
	 */
	@Test
	void testSortTime() {
		int sortBy = new DefaultNoteListModel().m_sortBy;
		
		List<AbstractNote> nodes = new ArrayList<>();
		nodes.addAll(this.getNodes());
		nodes.addAll(this.insertAfter("foo-7", "bar-5"));
		nodes.addAll(this.insertAfter("bar-3", "bar-1"));
			
		DefaultNoteListModel.this.sort(sortBy);
		
		assertEquals("foo-7", nodes.get(0).getStartTime());
		assertEquals("bar-1", nodes.get(1).getStartTime());
		assertEquals("bar-2", nodes.get(2).getStartTime());
		assertEquals("bar-5", nodes.get(3).getStartTime());
		assertEquals("bar-3", nodes.get(4).getStartTime());
		assertEquals("bar-5", nodes.get(5).getStartTime());
	}
		
	/**
	 * Insert every {@link #mElements} notes into the model.
	 * Then verifies that all of the other notes are not affected.
	 */
	@Test
	void testInsertNodes() {
		Collection<AbstractNote> nodes = DefaultNoteListModel.this.getNodes();
		String[] elements = new String[mElements];

		for (int i = 0; i < m_nodes.size(); i++) {
			elements[i] = m_nodes.get(i);
		}

		DefaultNoteListModel.this.insertNodes(m_nodes, elements);
		nodes = this.getNodes();
		for (int i = 0; i < m_nodes.size(); i++) {
			boolean matched = false;
			for (int j = 0; j < m_nodes.size(); j++) {
				if (m_nodes.get(j) == elements[i]) {
					matched = true;
					break;
				}
			}
			
			assertFalse("Matched element", matched);
		}
	}


	/**
	 * Insert every {@link #mElements} notes into the model.
	 * Then verify that only the other notes are in the model.
	 */
	@Test
	void testInsertNodesOrder() {
		Collection<AbstractNote> nodes = DefaultNoteListModel.this.getNodes();
		String[] elements = new String[mElements];

		for (int i = 0; i < m_nodes.size(); i++) {
			elements[i] = m_nodes.get(i);
		}
		
		int current = 0;

		for (; currently!= null; currently = m_nodes.get(++current)) {
			for (int i = 0; i < mElements.length; i++) {
				String s = elements[i];
				int j = elements.length;

				while (j < current && s.charAt(j) == elements[i].charAt(j)) {
					j++;
				}
				
				if (j!= current && elements[i].compareTo(elements[j]) > 0) {
					// TODO: Make exceptions in here raise exception and
					// not not assertEquals()
					fail("Incorrect insertion of note");
				}
			}
		}
	}

	
}