// DefaultNoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	 * Test case 1:
	 * The method returns -1 if the list is empty.
	 */
	@Test
	void testIndexOfEmptyList() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(-1, model.indexOf(new AbstractNote()));
	}
	
	/**
	 * Test case 2:
	 * The method returns -1 if the list does not contain the element.
	 */
	@Test
	void testIndexOfNotContained() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		assertEquals(-1, model.indexOf(new AbstractNote()));
	}
	
	/**
	 * Test case 3:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.add(note);
		assertEquals(0, model.indexOf(note));
	}
	
	/**
	 * Test case 4:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		assertEquals(1, model.indexOf(note2));
	}
	
	/**
	 * Test case 5:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		assertEquals(2, model.indexOf(note3));
	}
	
	/**
	 * Test case 6:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		assertEquals(3, model.indexOf(note4));
	}
	
	/**
	 * Test case 7:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		assertEquals(4, model.indexOf(note5));
	}
	
	/**
	 * Test case 8:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		assertEquals(5, model.indexOf(note6));
	}
	
	/**
	 * Test case 9:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		model.add(note7);
		assertEquals(6, model.indexOf(note7));
	}
	
	/**
	 * Test case 10:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		model.add(note7);
		model.add(note8);
		assertEquals(7, model.indexOf(note8));
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This interface defines the methods that a data model for a
 * <code>NoteList</code> must implement.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     * @see Vector#size()
     */
    public int getSize();

    /**
     * Returns the component at the specified index.
     *
     * @param index an index into this list
     * @return the component at the specified index
     * @see Vector#elementAt(int)
     */
    public AbstractNote getElementAt(int index);

    /**
     * Searches for the first occurrence of <code>elem</code>.
     *
     * @param elem an object
     * @return the index of the first occurrence of the argument in this list;
     *         returns <code>-1</code> if the object is not found
     * @see Vector#indexOf(Object)
     */
    public int indexOf(AbstractNote elem);

    /**
     * Returns the first component of this list.
     *
     * @return the first component of this list
     *