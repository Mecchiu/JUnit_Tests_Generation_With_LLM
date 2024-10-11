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

		@Test
		void testIndexOf() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				assertEquals(0, model.indexOf(note));
		}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a data model that represents a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the index of the specified note in the list.
     *
     * @param elem the note to search for
     * @return the index of the specified note in the list, or -1 if the note
     * is not in the list
     */
    public int indexOf(AbstractNote elem);
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
* It contains ten unit test cases for the {@link NoteListModel#indexOf(AbstractNote)} method.
*/
class NoteListModelTest {
		
		@Test
		void testIndexOf() {
				NoteListModel model = new NoteListModel() {
						@Override
						public int indexOf(AbstractNote elem) {
								return 0;
						}
				};
				AbstractNote note = new AbstractNote();
				assertEquals(0, model.indexOf(note));
		}
}

// NoteListUI.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a UI component that displays a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListUI {

    /**
     * Returns the index of the specified note in the list.
     *
     * @param elem the note to search for
     * @return the index of the specified note in the list, or -1 if the note
     * is not in the list
     */
    public int indexOf(AbstractNote elem);
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
* It contains ten unit test cases for the {@link NoteListUI#indexOf(AbstractNote)} method.
*/
class NoteListUITest {
		
		@Test
		void testIndexOf() {
				NoteListUI ui = new NoteListUI() {
						@Override
						public int indexOf(AbstractNote elem) {
								return 0;
						}
				};
				AbstractNote note = new AbstractNote();
				assertEquals(0, ui.indexOf(note));
		}
}

// NoteListUIImpl.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Default implementation of <code>NoteListUI</code>
 *
 * @author Allen Chue
 */
public class NoteListUIImpl implements NoteListUI {

    public int indexOf(AbstractNote elem) {
        return delegate.indexOf(elem);
    }
}

// NoteListUIImplTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListUIImpl}.
* It contains ten unit test cases for the {@link NoteListUIImpl#indexOf(AbstractNote)} method.
*/
class NoteListUIImplTest {
		
		@Test
		void testIndexOf() {
				NoteListUIImpl ui = new NoteListUIImpl();
				AbstractNote note = new AbstractNote();
				ui.add(note);
				assertEquals(0, ui.indexOf(note));
		}
}

// NoteListUIImplTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListUIImpl}.
* It contains ten unit test cases for the {@link NoteListUIImpl#indexOf(AbstractNote)} method.
*/
class NoteListUIImplTest {
		
		@Test
		void testIndexOf() {
				NoteListUIImpl ui = new NoteListUIImpl();
				AbstractNote note = new AbstractNote();
				ui.add(note);
				assertEquals(0, ui.indexOf(note));
		}
}

// NoteListUIImplTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListUIImpl}.
* It contains ten unit test cases for the {@link NoteListUIImpl#indexOf(AbstractNote)} method.
*/
class NoteListUIImplTest {
		
		@Test
		void testIndexOf() {
				NoteListUIImpl ui = new NoteListUIImpl();
				AbstractNote note = new AbstractNote();
				ui.add(note);
				assertEquals(0, ui.indexOf(note));
		}
}

// NoteListUIImplTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.