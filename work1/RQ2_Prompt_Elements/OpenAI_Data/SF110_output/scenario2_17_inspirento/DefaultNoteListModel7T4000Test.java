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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 1 is to test the method with a null element.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(null, 0));
		}
		
		/**
		* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 2 is to test the method with a negative index.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), -1));
		}
		
		/**
		* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 3 is to test the method with an index that is greater than the size of the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 1));
		}
		
		/**
		* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 4 is to test the method with an index that is equal to the size of the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 0));
		}
		
		/**
		* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 5 is to test the method with an element that is not in the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 0));
		}
		
		/**
		* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 6 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
		
		/**
		* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 7 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 1));
		}
		
		/**
		* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 8 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
		
		/**
		* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 9 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 1));
		}
		
		/**
		* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 10 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
}

// DefaultNoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Default implementation of <code>NoteListModel</code>
 *
 * @author Allen Chue
 */
public class DefaultNoteListModel implements NoteListModel {

    /**
     * Searches backwards for <code>elem</code>, starting from the specified
     * index, and returns an index to it.
     *
     * @param elem the desired component
     * @param index the index to start searching from
     * @return the index of the last occurrence of the <code>elem</code> in
     *         this list at position less than <code>index</code>; returns
     *         <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object,int)
     */
    public int lastIndexOf(AbstractNote elem, int index) {
        return delegate.lastIndexOf(elem, index);
    }
}

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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {
		
		/**
		* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 1 is to test the method with a null element.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(null, 0));
		}
		
		/**
		* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 2 is to test the method with a negative index.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), -1));
		}
		
		/**
		* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 3 is to test the method with an index that is greater than the size of the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 1));
		}
		
		/**
		* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 4 is to test the method with an index that is equal to the size of the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 0));
		}
		
		/**
		* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 5 is to test the method with an element that is not in the list.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote(), 0));
		}
		
		/**
		* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 6 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
		
		/**
		* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 7 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 1));
		}
		
		/**
		* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 8 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
		
		/**
		* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 9 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 1));
		}
		
		/**
		* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 10 is to test the method with an element that is in the list.
		* Expected result: <code>0</code>
		*/
		@Test
		void testLastIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note, 0));
		}
}

// DefaultNoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Default implementation of <code>NoteListModel</code>
 *
 * @author Allen Chue
 */
public class DefaultNoteListModel implements NoteListModel {

    /**
     * Searches backwards for <code>elem</code>, starting from the specified
     * index, and returns an index to it.
     *
     * @param elem the desired component
     * @param index the index to start searching from
     * @return the index of the last occurrence of the <code>elem</code> in
     *         this list at position less than <code>index</code>; returns
     *         <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object,int)
     */
    public int lastIndexOf(AbstractNote elem, int index) {
        return delegate.lastIndexOf(elem, index);
    }
}

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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {
		
		/**
		* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
		* Test case 1 is to test the method with a null element.
		* Expected result: <code>-1</code>
		*/
		@Test
		void testLastIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(null, 0));
		}
		
		/**
		* Test case 2