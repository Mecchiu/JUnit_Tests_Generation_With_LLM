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
	* Iterates through the first components of this vector.
	* Each call to this method toggles the visibility of the test container. 
	* @throws NoSuchElementException when no elements exist in the vector
	* @throws IndexOutOfBoundsException when the vector is out of bounds
	* @throws IllegalStateException when this vector has not been initialized
	*/
	@Test
    public void getFirstElement() {
        final AbstractNote abc = new DefaultNote("abc", null);
        final AbstractNote abd = new DefaultNote("abd", null);
        final AbstractNote abe = new DefaultNote("abe", null);

        abc.init();
        abe.init();
        abd.init();

        final AbstractNote abc1 = null;
        abc.firstElement();
        assertEquals(abc, abc1);

        final AbstractNote abd1 = null;
        abc.firstElement();
        assertEquals(abc, abd1);

        abc.firstElement();
        assertNull(abc.firstElement());

        abc.firstElement();
        assertNull(abc);

        // Adding a null to the end of the vector will not add a new element
        final AbstractNote abc2 = new DefaultNote("abc2", null);
        final AbstractNote abc3 = new DefaultNote("abc3", null);
        final AbstractNote abc4 = new DefaultNote("abc4", null);
        final AbstractNote abc5 = new DefaultNote("abc5", abc3);

        abc.add(abc2);
        abc.add(abc4);

        final AbstractNote result = abc2;

        // Test the remove(AbstractNote...) method.
        result.nextElement();
        assertEquals(abc2, abc.firstElement());
        abc.remove(abc2);

        result.nextElement();
        assertNull(result.firstElement());

        try {
            result.nextElement();
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

        try {
            result.firstElement();
            assertNull(result.firstElement());
        }
        catch (NoSuchElementException e) {
            assertTrue(true);
        }

        // Test the firstElement() method.
        abd.firstElement();
        result = abc3;
        assertTrue(result.firstElement()!= null);
        assertEquals(abc3, abc.firstElement());
   
        final AbstractNote abd2 = null;
        abc.firstElement();
        assertNull(abc2);
    }

    @Test
    public void add() {
        final AbstractNote abc = new DefaultNote("abc", null);
        final AbstractNote abd = new DefaultNote("abd", null);

        abc.init();
        abd.init();

        abc.add(abc);
        abd.add(abd);

        final AbstractNote abc2 = null;
        assertEquals(abc, abc2);

        final AbstractNote abc3 = abc;
        assertEquals(abc, abc3);

        final AbstractNote abc4 = new DefaultNote("abc2", null);
        abc.add(abc4);
        assertEquals(abc2, abc4);

        final AbstractNote abc5 = abc2;
        assertEquals(abd, abc5);

        final AbstractNote first = abd;
        first.nextElement();
        assertTrue(first.nextElement() == abc);
    }

	@Test
	public void setFirstElement() {
		final AbstractNote abc = new DefaultNote("abc", null);
		final AbstractNote abd = new DefaultNote("abd", null);

		abc.init();
		abd.init();

		abc.setFirstElement(abc);
		abd.setFirstElement(abd);
		
		final AbstractNote abc2 = null;
		assertEquals(abc, abc2);

		final AbstractNote abc3 = abc;
		assertEquals(abc, abc3);

		final AbstractNote abc4 = new DefaultNote("abc4", null);
		abc.setFirstElement(abc4);
		assertEquals(abc4, abc4);

		final AbstractNote abc5 = abc2;
		assertEquals(abc2, abc5);

		final AbstractNote first = abd;
		first.nextElement();
		assertTrue(first.nextElement() == abc);
	}

	@Test
	public void clear() {
		final AbstractNote abc = new DefaultNote("abc", null);
		final AbstractNote abd = new DefaultNote("abd", null);

		abc.init();
		abd.init();

		abc.clear();
		abd.clear();

		final AbstractNote abc2 = null;
		assertEquals(abc, abc2);

		final AbstractNote abc3 = abc;
		assertEquals(abc, abc3);

		final AbstractNote abc4 = new DefaultNote("abc4", null);
		abc.clear();
		assertEquals(abc, abc4);

		final AbstractNote abc5 = abc2;
		assertEquals(abc2, abc5);

		final AbstractNote first = abd;
		first.nextElement();
		assertTrue(first.nextElement() == abc);
	}

}