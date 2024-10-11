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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is not in the list.
	*/
	@Test
	void testLastIndexOf1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		assertEquals(-1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertEquals(0, model.lastIndexOf(note));
	}
	
	/**
	* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		assertEquals(1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(2, model.lastIndexOf(note));
	}
	
	/**
	* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(3, model.lastIndexOf(note));
	}
	
	/**
	* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(4, model.lastIndexOf(note));
	}
	
	/**
	* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(5, model.lastIndexOf(note));
	}
	
	/**
	* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(6, model.lastIndexOf(note));
	}
	
	/**
	* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(7, model.lastIndexOf(note));
	}
	
	/**
	* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(8, model.lastIndexOf(note));
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the index of the last occurrence of <code>elem</code>.
     *
     * @param elem the desired component
     * @return the index of the last occurrence of <code>elem</code> in the
     *         list; returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object)
     */
    public int lastIndexOf(AbstractNote elem);
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
* It contains ten unit test cases for the {@link NoteListModel#lastIndexOf(AbstractNote)} method.
*/
class NoteListModelTest {
		
	/**
	* Test case 1 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is not in the list.
	*/
	@Test
	void testLastIndexOf1() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return -1;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(-1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 2 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf2() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 0;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(0, model.lastIndexOf(note));
	}
	
	/**
	* Test case 3 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf3() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 1;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 4 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf4() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 2;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(2, model.lastIndexOf(note));
	}
	
	/**
	* Test case 5 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf5() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 3;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(3, model.lastIndexOf(note));
	}
	
	/**
	* Test case 6 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf6() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 4;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(4, model.lastIndexOf(note));
	}
	
	/**
	* Test case 7 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf7() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 5;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(5, model.lastIndexOf(note));
	}
	
	/**
	* Test case 8 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf8() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 6;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(6, model.lastIndexOf(note));
	}
	
	/**
	* Test case 9 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf9() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 7;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(7, model.lastIndexOf(note));
	}
	
	/**
	* Test case 10 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf10() {
		NoteListModel model = new NoteListModel() {
			public int lastIndexOf(AbstractNote elem) {
				return 8;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(8, model.lastIndexOf(note));
	}
}

// NoteListUI.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListUI {

    /**
     * Returns the index of the last occurrence of <code>elem</code>.
     *
     * @param elem the desired component
     * @return the index of the last occurrence of <code>elem</code> in the
     *         list; returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object)
     */
    public int lastIndexOf(AbstractNote elem);
}

// NoteListUITest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListUI}.
* It contains ten unit test cases for the {@link NoteListUI#lastIndexOf(AbstractNote)} method.
*/
class NoteListUITest {
		
	/**
	* Test case 1 for {@link NoteListUI#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is not in the list.
	*/
	@Test
	void testLastIndexOf1() {
		NoteListUI model = new NoteListUI() {
			public int lastIndexOf(AbstractNote elem) {
				return -1;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(-1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 2 for {@link NoteListUI#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf2() {
		NoteListUI model = new NoteListUI() {
			public int lastIndexOf(AbstractNote elem) {
				return 0;
			}
		};
		AbstractNote note = new AbstractNote();
		assertEquals(0, model.lastIndexOf(note));
	}
	
	/**
	* Test case 3 for {@link