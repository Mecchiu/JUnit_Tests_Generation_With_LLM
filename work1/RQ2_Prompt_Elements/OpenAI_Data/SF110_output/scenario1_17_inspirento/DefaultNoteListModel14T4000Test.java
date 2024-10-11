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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 2:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 3:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 4:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 5:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 6:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 7:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 8:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 9:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 10:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for note list model.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Adds a note to the model.
     *
     * @param note the note to be added
     */
    public void add(AbstractNote note);

    /**
     * Removes a note from the model.
     *
     * @param index the index of the note to be removed
     * @return the removed note
     */
    public AbstractNote remove(int index);

    /**
     * Returns the number of notes in the model.
     *
     * @return the number of notes in the model
     */
    public int getSize();

    /**
     * Returns the note at the specified index.
     *
     * @param index the index of the note to be returned
     * @return the note at the specified index
     */
    public AbstractNote getElementAt(int index);

    /**
     * Adds a listener to the model.
     *
     * @param l the listener to be added
     */
    public void addNoteListDataListener(NoteListDataListener l);

    /**
     * Removes a listener from the model.
     *
     * @param l the listener to be removed
     */
    public void removeNoteListDataListener(NoteListDataListener l);
}

// NoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListModel}.
* It contains ten unit test cases for the {@link NoteListModel#remove(int)} method.
*/
class NoteListModelTest {
		
		/**
		* Test case 1:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove1() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 2:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove2() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 3:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove3() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 4:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove4() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 5:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove5() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 6:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove6() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 7:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove7() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 8:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove8() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 9:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove9() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 10:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove10() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
}

// NoteListPanel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Panel for displaying notes.
 *
 * @author Allen Chue
 */
public class NoteListPanel extends JPanel {

    /**
     * Constructs a <code>NoteListPanel</code> with the specified model.
     *
     * @param model the model to be used
     */
    public NoteListPanel(NoteListModel model) {
        this.model = model;
        this.model.addNoteListDataListener(new NoteListDataListener() {

            public void noteAdded(NoteListDataEvent e) {
                // TODO: add a note to the panel
            }

            public void noteRemoved(NoteListDataEvent e) {
                // TODO: remove a note from the panel
            }
        });
    }
}

// NoteListPanelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListPanel}.
* It contains ten unit test cases for the {@link NoteListPanel#NoteListPanel(NoteListModel)} constructor.
*/
class NoteListPanelTest {
		
		/**
		* Test case 1:
		* The input is a valid model.
		* The expected result is the panel is constructed.
		*/
		@Test
		void testNoteListPanel1() {
				NoteListModel model = new DefaultNoteListModel();
				NoteListPanel panel = new NoteListPanel(model);
				assertNotNull(panel);
		}
		
		/**
		* Test case 2:
		* The input is a valid model.
		* The expected result is the panel is constructed.
		*/
		@Test
		void testNoteListPanel2() {
				NoteListModel model = new DefaultNoteListModel();
				NoteListPanel panel = new NoteListPanel(model);
				assertNotNull(panel);
		}
		
		/**
		* Test case 3:
		* The input is a valid model.
		* The expected result is the panel is constructed.
		*/
		@Test
		void testNoteListPanel3() {
				NoteListModel model = new DefaultNoteListModel();
				NoteListPanel panel = new NoteListPanel(model);
				assertNotNull(panel);
		}
		
		/**
		* Test case 4:
		* The input is a valid model.
		* The expected result is the panel is constructed.
		*/
		@Test
		void testNoteListPanel4() {
		