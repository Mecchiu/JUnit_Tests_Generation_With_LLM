// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		
    /**
     * Unit test for {@link DefaultNoteListModel#capacity()}.
     * <p>
     * Executes <code>Test #1</code>.
     */
    @Test
    public void testCapacity() {
    	
    	final NoteListModel _model;
        {
			final Enumeration<AbstractNote> model;
        	
			final Set<AbstractNote> n = new HashSet<AbstractNote>();

    		_model = new DefaultNoteListModel();
    		_model.addListener(_model);

    		model = _model.model().iterator();

    		AbstractNote a = n.iterator().next();

    		n.remove(a);

    		model.add(a);

    		AbstractNote a4 = model.next();
    		n.remove(a);

    		model.add(a4);
    	}

        assertEquals(0, n.size());
		
}
}