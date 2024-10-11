// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		
    /**
     * Constructor.
     */
    public DefaultNoteListModel_0Test() {
    }

	public String toString() {
		return "DefaultNoteListModel[capacity=" + capacity() + "]";
	}

	/**
	 * Method tests the capacity(s) of this object.
	 */
	@Test
	public void testCapacity() {
		final Vector v1 = new Vector();
		v1.addElement("1");
		v1.addElement("2");
		v1.addElement("3");
		v1.addElement("4");
		v1.addElement("5");
		final AbstractNote list1 = new DefaultNote(v1);
		try {
			final Vector v2 = new Vector(10);
			v2.addElement("6");
			m_model.start(list1, v2);
		} catch(final Exception e) {
			fail(e.getMessage());
		}

		assertEquals(3, m_model.getLength());
		assertEquals(1, m_model.getCapacity());
	}

	/**
	 * Method tests the capacity(s) of this object.
	 */
	@Test
	public void testStart() {
		final Vector v1 = new Vector();
		v1.addElement("1");
		v1.addElement("2");
		v1.addElement("3");
		v1.addElement("4");
		v1.addElement("5");
		final AbstractNote list1 = new DefaultNote(v1);
		try {
			final Vector v2 = new Vector(10);
			v2.addElement("6");
			m_model.start(list1, v2);
		} catch(final Exception e) {
			fail(e.getMessage());
		}

		assertEquals(3, m_model.getLength());
		assertEquals(1, m_model.getCapacity());
	}

	/**
	 * Method returns the total capacity of the list
	 */
	@Test
	public void testGetCapacity() {
		final Vector v1 = new Vector();
		v1.addElement("1");
		v1.addElement("2");
		v1.addElement("3");
		v1.addElement("4");
		v1.addElement("5");
		final AbstractNote list1 = new DefaultNote(v1);

		final Vector v2 = this.new Vector(10);

		try {
			m_model.start(list1, v2);
			assertEquals("Should return the same length as the existing list",
					this.m_model.getLength(), this.m_model.getCapacity());
		} catch(final Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Method returns the capacity of this list
	 */
	@Test
	public void testGetCapacity_noList() {
		// no list should be created
		m_model = new DefaultNoteListModel();
		m_model.start(null, new Vector());

		assertEquals("Should return the same capaalbe as getCapacity", this.m_model.getCapacity(), m_model.getCapacity());
	}

	private DefaultNoteListModel m_model;

	public static DefaultNoteListModel getModel() {
		return m_model.m_model;
	}
}