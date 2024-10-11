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
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModelTest {

	/**
	 * Test case 1 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 1 is to test the capacity of the list is 0.
	 */
	@Test
	void testCapacity1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(0, model.capacity());
	}
	
	/**
	 * Test case 2 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 2 is to test the capacity of the list is 10.
	 */
	@Test
	void testCapacity2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 10; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(10, model.capacity());
	}
	
	/**
	 * Test case 3 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 3 is to test the capacity of the list is 20.
	 */
	@Test
	void testCapacity3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 20; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(20, model.capacity());
	}
	
	/**
	 * Test case 4 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 4 is to test the capacity of the list is 30.
	 */
	@Test
	void testCapacity4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 30; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(30, model.capacity());
	}
	
	/**
	 * Test case 5 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 5 is to test the capacity of the list is 40.
	 */
	@Test
	void testCapacity5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 40; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(40, model.capacity());
	}
	
	/**
	 * Test case 6 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 6 is to test the capacity of the list is 50.
	 */
	@Test
	void testCapacity6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 50; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(50, model.capacity());
	}
	
	/**
	 * Test case 7 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 7 is to test the capacity of the list is 60.
	 */
	@Test
	void testCapacity7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 60; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(60, model.capacity());
	}
	
	/**
	 * Test case 8 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 8 is to test the capacity of the list is 70.
	 */
	@Test
	void testCapacity8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 70; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(70, model.capacity());
	}
	
	/**
	 * Test case 9 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 9 is to test the capacity of the list is 80.
	 */
	@Test
	void testCapacity9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 80; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(80, model.capacity());
	}
	
	/**
	 * Test case 10 for {@link DefaultNoteListModel#capacity()}.
	 * Test case 10 is to test the capacity of the list is 90.
	 */
	@Test
	void testCapacity10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 90; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(90, model.capacity());
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This interface defines the methods that a note list model must implement.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the current capacity of this list.
     *
     * @return the current capacity
     * @see Vector#capacity()
     */
    public int capacity();
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
* It contains ten unit test cases for the {@link NoteListModel#capacity()} method.
*/
class NoteListModelTest {
		
	/**
	 * Test case 1 for {@link NoteListModel#capacity()}.
	 * Test case 1 is to test the capacity of the list is 0.
	 */
	@Test
	void testCapacity1() {
		NoteListModel model = new DefaultNoteListModel();
		assertEquals(0, model.capacity());
	}
	
	/**
	 * Test case 2 for {@link NoteListModel#capacity()}.
	 * Test case 2 is to test the capacity of the list is 10.
	 */
	@Test
	void testCapacity2() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 10; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(10, model.capacity());
	}
	
	/**
	 * Test case 3 for {@link NoteListModel#capacity()}.
	 * Test case 3 is to test the capacity of the list is 20.
	 */
	@Test
	void testCapacity3() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 20; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(20, model.capacity());
	}
	
	/**
	 * Test case 4 for {@link NoteListModel#capacity()}.
	 * Test case 4 is to test the capacity of the list is 30.
	 */
	@Test
	void testCapacity4() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 30; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(30, model.capacity());
	}
	
	/**
	 * Test case 5 for {@link NoteListModel#capacity()}.
	 * Test case 5 is to test the capacity of the list is 40.
	 */
	@Test
	void testCapacity5() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 40; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(40, model.capacity());
	}
	
	/**
	 * Test case 6 for {@link NoteListModel#capacity()}.
	 * Test case 6 is to test the capacity of the list is 50.
	 */
	@Test
	void testCapacity6() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 50; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(50, model.capacity());
	}
	
	/**
	 * Test case 7 for {@link NoteListModel#capacity()}.
	 * Test case 7 is to test the capacity of the list is 60.
	 */
	@Test
	void testCapacity7() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 60; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(60, model.capacity());
	}
	
	/**
	 * Test case 8 for {@link NoteListModel#capacity()}.
	 * Test case 8 is to test the capacity of the list is 70.
	 */
	@Test
	void testCapacity8() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 70; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(70, model.capacity());
	}
	
	/**
	 * Test case 9 for {@link NoteListModel#capacity()}.
	 * Test case 9 is to test the capacity of the list is 80.
	 */
	@Test
	void testCapacity9() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 80; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(80, model.capacity());
	}
	
	/**
	 * Test case 10 for {@link NoteListModel#capacity()}.
	 * Test case 10 is to test the capacity of the list is 90.
	 */
	@Test
	void testCapacity10() {
		NoteListModel model = new DefaultNoteListModel();
		for (int i = 0; i < 90; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(90, model.capacity());
	}
}

// NoteListUI.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This interface defines the methods that a note list UI must implement.
 *
 * @author Allen Chue
 */
public interface NoteListUI {

    /**
     * Returns the current capacity of this list.
     *
     * @return the current capacity
     * @see Vector#capacity()
     */
    public int capacity();
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
* It contains ten unit test cases for the {@link NoteListUI#capacity()} method.
*/
class NoteListUITest {
		
	/**
	 * Test case 1 for {@link NoteListUI#capacity()}.
	 * Test case 1 is to test the capacity of the list is 0.
	 */
	@Test
	void testCapacity1() {
		NoteListUI model = new DefaultNoteListUI();
		assertEquals(0, model.capacity());
	}
	
	/**
	 * Test case 2 for {@link NoteListUI#capacity()}.
	 * Test case 2 is to test the capacity of the list is 10.
	 */
	@Test
	void testCapacity2() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 10; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(10, model.capacity());
	}
	
	/**
	 * Test case 3 for {@link NoteListUI#capacity()}.
	 * Test case 3 is to test the capacity of the list is 20.
	 */
	@Test
	void testCapacity3() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 20; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(20, model.capacity());
	}
	
	/**
	 * Test case 4 for {@link NoteListUI#capacity()}.
	 * Test case 4 is to test the capacity of the list is 30.
	 */
	@Test
	void testCapacity4() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 30; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(30, model.capacity());
	}
	
	/**
	 * Test case 5 for {@link NoteListUI#capacity()}.
	 * Test case 5 is to test the capacity of the list is 40.
	 */
	@Test
	void testCapacity5() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 40; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(40, model.capacity());
	}
	
	/**
	 * Test case 6 for {@link NoteListUI#capacity()}.
	 * Test case 6 is to test the capacity of the list is 50.
	 */
	@Test
	void testCapacity6() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 50; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(50, model.capacity());
	}
	
	/**
	 * Test case 7 for {@link NoteListUI#capacity()}.
	 * Test case 7 is to test the capacity of the list is 60.
	 */
	@Test
	void testCapacity7() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 60; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(60, model.capacity());
	}
	
	/**
	 * Test case 8 for {@link NoteListUI#capacity()}.
	 * Test case 8 is to test the capacity of the list is 70.
	 */
	@Test
	void testCapacity8() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 70; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(70, model.capacity());
	}
	
	/**
	 * Test case 9 for {@link NoteListUI#capacity()}.
	 * Test case 9 is to test the capacity of the list is 80.
	 */
	@Test
	void testCapacity9() {
		NoteListUI model = new DefaultNoteListUI();
		for (int i = 0; i < 80; i++) {
			model.add(new AbstractNote());
		}
		assertEquals(80, model.capacity());
	