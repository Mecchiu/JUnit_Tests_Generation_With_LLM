// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {

    /**
     * Test for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
     * <p>Requires that <tt>elem</tt> is defined in a class that extends
     * {@link AbstractNote}.</p>
     * <p>This test checks that the correct index is returned using
     * the <tt>lastIndexOf(Object)</tt> method.</p>
     *
     * @throws NoSuchMethodException if no methods defined for interfaces are found
     * @throws SecurityException if a security manager is registered
     *      before the method is invoked
     * see {@link javax.swing.JList#setSelectionModel(javax.swing.ListSelectionModel) setSelectionModel} 
     * @see AbstractNote
     * @see AbstractNote#lastIndexOf(AbstractNote)
     */
    @Test
    public void lastIndexOf_6_1() throws SecurityException {
        // Set the listener on the list
        JList jl = new JLists(AbstractNote.class);
        
        // Send a list data event to the listeners
        Object elem = new AbstractNote();
        NoteListDataEvent dde = new NoteListDataEvent(elem, jl);
        
        // Call the method under test
        AbstractNote result = DefaultNoteListModel.lastIndexOf(elem);
        
        // Check the result
        assertSame("the object returned by the method is not equal to "
            + AbstractNote.class.getName(), result,
            AbstractNote.class.getMethod("lastIndexOf", new Class[] {Object.class}).invoke(elem, new Object[] {AbstractNote.class}));
    }
	
	/**
	 * Call the {@link #lastIndexOf(AbstractNote)} method with a null argument.
	 * <p>This method tests that {@link javax.swing.JList#setSelectionModel(javax.swing.ListSelectionModel) setSelectionModel()}
	 * throws with a {@link NullPointerException} when <tt>null</tt> is passed for the method's
	 * parameter.</p>
	 *
	 * @see #lastIndexOf_6_1()
	 */
	@Test (expected = NullPointerException.class)
	public void lastIndexOf_6_2() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		m.lastIndexOf(null);
	}
	
	/**
	 * Call the {@link #lastIndexOf(AbstractNote))} method with a non-existing object.
	 * <p>This method tests that {@link javax.swing.JList#setSelectionModel(javax.swing.ListSelectionModel) setSelectionModel()} throws
	 * with a {@link IllegalArgumentException} when <tt>elem</tt> is null.</p>
	 *
	 * @see #lastIndexOf_6_1()
	 */
	@Test (expected = IllegalArgumentException.class)
	public void lastIndexOf_6_3() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		m.lastIndexOf((AbstractNote)null);
	}
	
	/**
	 * Call the <code>lastIndexOf</code> method with the <code>elem</code> argument
	 * as well as a null argument.
	 * <p>This method tests that the correct result can be returned using the same method.</p>
	 *
	 * @see #lastIndexOf(AbstractNote, AbstractNote)
	 */
	@Test
	public void lastIndexOf_6_4() {
		// Set the listener on the list
		DefaultNoteListModel m = new DefaultNoteListModel();
		Object obj = new AbstractNote(new Class[0]);
		NoteListDataEvent dde = new NoteListDataEvent(obj, m);
		
	    // Call the method under test
        int result = m.lastIndexOf(obj);

        // Check the result
        assertEquals("the correct result can be returned using the same method",  ResultCodes.UNCHECKED, result);
	}
	
}
