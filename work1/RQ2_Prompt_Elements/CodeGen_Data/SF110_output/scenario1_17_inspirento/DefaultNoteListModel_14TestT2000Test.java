// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {

	

	/**
	 * Test method for {@link java.util.Collection#iterator()}.
	 */
	@Test
	public void testRemoveCollection() {
		DefaultNoteListModel _test = new DefaultNoteListModel();
		AbstractNote a1 = new AbstractNote("a1");
		_test.addItem(a1);
		_test.remove(itemIndex(a1));
		assertFalse("remove(0) failed", _test.remove(0));
		assertEmpty("Removes empty collection", _test.dataModel.getItems());
		assertEquals("removed element does not match first item", 0, _test.dataModel.indexOf(a1));
		Iterator _test1 = _test.dataModel.iterator();
		DefaultNote a2 = new DefaultNote("a2");
		_test1.next();
		_test1.remove(a1);
		assertTrue("Removed invalid element after removal of first item", a1!= _test1.next() && a2!= null);
//		assertContentElements("Remove removed elements", a2.get(), a1.get(), _test1);
		assertTrue("Removed element does not match element before removal", a1.equals(a2));
		assertEquals("remove method does not work", a1, _test.dataModel.get(1));
		Iterator _test12 = _test.dataModel.iterator();
		_test12.next();
		_test1.next();
		_test.remove(2);
		assertFalse("Remove element failed after removal of previous element", a1.equals(a2));
		assertEquals("remove method does not work", a1, _test.dataModel.get(2));
		assertEquals("remove method works correctly", a1, _test.dataModel.get(3));
		assertEquals("remove method does not work", a1, a2);
		assertEquals("remove method works correctly", a1, _test.dataModel.get(4));
		assertEquals("remove method works correctly", a1, a2);
		assertTrue("Removed invalid but no item", _test.remove(2) instanceof NoteListModel.Incompatible);

		Iterator _test2 = _test.dataModel.iterator();
		assertNotNull("Removing a valid element", _test2.next());
		_test2.next();
		_test2.remove(3);
		assertTrue("Removed invalid element after removal of last item", _test2.hasNext());
		assertEquals("Removed element does not match last item", 1, _test2.nextIndex());
		assertTrue("Remove valid but no item after last element", _test.remove(itemIndex(new DefaultAbstractNote("a1", 0))));

	}

     @Test
    public void testRemoveInvalid() {
    }

       @Test
    public void testRemoveInvalid1() {
    }

    @Test
    public void testRemoveInvalid2() {
    }

	/**
	 * Test method for {@link java.util.Collection#iterator()}.
	 */
	@Test
	public void testRemovleCollection() {
		DefaultNoteListModel _test = new DefaultNoteListModel();
		AbstractNote a1 = abc(new DefaultAbstractNote("a1", 0));
//		AbstractNote a1 = (AbstractNote)deletion.deletionCalls.get(1);
		_test.addItem(a1);
		_test.remove(itemIndex(a1));
		assertEquals("collection length", 2, _test.getSize());
		Collection _test1 = _test.dataModel.iterator();
		DefaultNote a2 = a1.getNext();
		assertSame("Removed invalid element after removal", a1, a2);
//		assertContentElements("Removed elements", a2.get(), a1.get(), _test1);
		assertEquals("removed first element", ab_test, _test1.next());
        assertEquals("removed first element", a2, _test1.next());
		assertEquals("removed first element", ab_test, _test1.next());
		assertTrue("Removed invalid element after removal", a1.equals(a2));
		assertEquals("removed first element", ab_test, _test1.next());
		_test.remove(a2);
		assertFalse("Removed invalid element after removal", a1.equals(a2));
		assertEquals("removed first element", a1, b_test);
		assertTrue("Removed invalid element after removal", a2.equals(a1));
		assertSame("Remove first element", a1, a2);
		assertTrue("Remove first element", a2.equals(a1));
		assertEquals("remove method does not work", 0, _test.remove(8));
		assertTrue("Removed invalid element for removal", a1.equals(a2));
		assertSame("Removed invalid element", a2, a1);
		assertEquals("remove second element", a1, b_test);
		assertEquals("remove second element", a2, b_test);
		assertTrue("Removed invalid element after removal", a1.equals(a2));
		assertEquals("remove method does not work", 0, _test.remove(9));
		assertTrue("Removed invalid element for removal", a1.equals(a2));
		
		
	}
}
