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
		 * Returns the current capacity of this list.
		 *
		 * @return the current capacity
		 * @see Vector#capacity()
		 */
	  @Test
    public void test_0() {
        Vector<AbstractNote> v = new Vector<AbstractNote>();
        final DefaultNoteListModel m = new DefaultNoteListModel(v);
		final AbstractNote n = new AbstractNote((byte)0);
        assertEquals(1, m.capacity());

        final AbstractNote n2 = new AbstractNote((byte)1);
        assertEquals(2, m.capacity());
        assertEquals(2, m.size());
        assertTrue(m.contains(n));
        assertTrue(m.contains(n2));
        assertEquals(2, m.indexOf(n));
        assertEquals(1, m.indexOf(n2));
        assertEquals(m.indexOf(n), m.indexOf(n2));
        assertEquals(false, m.contains(m.add(n, n2)));
        assertEquals(1, m.indexOf(n2));
        assertEquals(m.indexOf(n) + 1, m.indexOf(m.sublist(m.addFirst(n, n2), m.indexOf(m.addFirst(n2, n)))));
        assertEquals(m.indexOf(m.addFirst(n, n2)), m.indexOf(m.sublist(m.addFirst(n, n), m.indexOf(m.sublist(m.addFirst(n2, n), m.sublist(n, n))) < m.indexOf(n)))) < m.indexOf(m.sublist(m.addFirst(n, n2), m.indexOf(n)));
        assertEquals(false, m.contains(m.add(n, n) >= m.add(n2, n)? m.contains(n, n2) : m.contains(n, n2), m.indexOf(n));
        assertEquals(false, m.contains(m.sublist(m.addFirst(n, n2), m.length() - 1).add(m.add(n, n)), n));
        final Collection<AbstractNote> cc = m.subrange(0, m.size());
          assertEquals("m.subrange(0, m.size())", Utils.printCollection(cc));
          assertEquals("m.subset(0, m.size())", Utils.printCollection(cc.subList(0, m.size())));
          assertEquals("m.subset(0, m.size()-2)", Utils.printCollection(cc.subList(0, m.size() - 1)));
          
        n.note.set(m.sublist(0, m.size() - 2));
        assertEquals("m.sublist(0, m.size() - 2)", Utils.printCollection(n.note.get()));
    }
}
class DefaultNoteListModel_1Test_0 extends DefaultNoteListModel_0Test {
		/**
		 * A new default list is created.
		 *
		 * @see DefaultNoteListModel_0Test#test_0()
		 */
	final DefaultNoteListModel m = new DefaultNoteListModel((Vector<AbstractNote>) Utils.arrayFromVector(new AbstractNote((byte)0)));
}
class DefaultNoteListModel_1Test_1 extends DefaultNoteListModel_0Test {
					/**
			 * A new empty default list is created.
			 *
			 * @see DefaultNoteListModel_0Test#test_0()
			 */
		final DefaultNoteListModel m = new DefaultNoteListModel((Vector<AbstractNote>) Utils.arrayFromVector(new AbstractNote((byte)0)));
}