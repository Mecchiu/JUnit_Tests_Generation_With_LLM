// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		
    @Test
    @SuppressWarnings({ "rawtypes", "rawtypes.NPE" })
	public void noteListModelFrom_List() {
        Hashtable<AbstractNote, Integer> testData = new Hashtable<AbstractNote, Integer>();
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote notiE1 = new AbstractNote("This element isnt in the test list.");
        AbstractNote notiE2 = new AbstractNote("This element isnt in the test list.");
        testData.put(notiE1, 0);
        testData.put(notiE2, 1);

        model.addNoteListDataListener(new TestListener());

        assertEquals(1, model.lastIndexOf(notiE1, -1));
        assertEquals(1, model.lastIndexOf(notiE1, 0));
	}

    public class TestListener extends AbstractNoteListDataListener {
        @Override
        public void onNoteListDataEvent(NoteListDataEvent event) {
            boolean emptyListFound = false;
            Object data_to_be_added = event.getData();
            int index = Integer.parseInt(data_to_be_added.toString());
            for (Iterator<AbstractNote> iterator = iterator(); iterator.hasNext(); ) {
                try {
                    if (iterator.next().equals(notiE1)) iterator.remove();
                    else iterator.next();
                } catch( Exception e ) {
                    iterator.remove();            // throw away, since we didn't want a list of elements
                }
            }
            if (index == 0) emptyListFound = true;
            if (!emptyListFound) data_to_be_added = new Integer(random.nextInt());
            data_to_be_added = Integer.parseInt(data_to_be_added.toString());

            setData(iterator(), 2, data_to_be_added);       // add a new element to the model
        }
    }

    @Test
    public void find_ByUUID() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        Set<Object> set_to_be_processed = new HashSet<Object>();
        set_to_be_processed.add(model);
        DefaultNoteListModel.Iterator iterator = model.iterator();
        while(iterator.hasNext()) {
            set_to_be_processed.add(iterator.next());
        }
        AbstractNote first = (AbstractNote)set_to_be_processed.iterator().next();
        assertNotNull(first);

        set_to_be_processed.add(first);
        assertNotNull(first);
        assertNull(iterator.next());
    }
}