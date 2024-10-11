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
* It contains ten unit test cases for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModelTest {

	/**
	 * Test case 1:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(3, model.size());
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
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     * @see Vector#size()
     */
    public int size() {
        return delegate.size();
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	 * Test case 1:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(3, model.size());
	}
	
	/**
	 * Test case 2:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(10, model.size());
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
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     * @see Vector#size()
     */
    public int size() {
        return delegate.size();
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	 * Test case 1:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(3, model.size());
	}
	
	/**
	 * Test case 2:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(10, model.size());
	}
	
	/**
	 * Test case 3:
	 * Test if the size of the list is correct.
	 */
	@Test
	void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote