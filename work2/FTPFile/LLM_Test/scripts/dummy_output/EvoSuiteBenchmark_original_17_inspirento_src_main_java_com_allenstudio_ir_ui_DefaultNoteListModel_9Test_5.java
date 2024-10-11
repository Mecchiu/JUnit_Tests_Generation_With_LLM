// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		/**
		 *  Test method for <code>firstElement()</code>. It checks the result
		 * of the {@link DefaultNoteListModel#firstElement()} method.
		 */
		@Test
    public void testFirstElement_1() {
        final DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote list1 = model.firstElement();
        assertNotNull(list1);
        assertFalse(list1 == null);

        AbstractNote list2 = model.firstElement();
        assertTrue(list2!= null);
        assertTrue(list2.equals(list1));

        final Iterator<AbstractNote> it =
			model.iterator();
        List<AbstractNote> list3 = new ArrayList<AbstractNote>();
        while (it.hasNext()) {
            list3.add(it.next());
        }

        assertTrue(list3.contains(list1));
        assertFalse(list3.contains(list2));

        assertTrue(model.contains(list1));
        assertFalse(model.contains(list2));

        // Tests with andWithout data.

        final DefaultNoteListModelWithoutItem wlm =
        new DefaultNoteListModelWithoutItem();
        final AbstractNoteListModelWithoutItemModel wModel = wlm.getModel();
        assertNotNull(wModel);
        assertFalse(wlm == null);
        assertEquals(0, wlm.size());
        wModel.clear();
        assertEquals(1, wlm.size());
        assertTrue(wlm.contains(list1));
        assertFalse(wlm.contains(list2));

        // Check get methods
        AbstractNoteListModelWithoutItemWithoutItemModel wModel2 = wlm.getModelWithoutItem();
        assertNotNull(wModel2);
        assertEquals(1, wModel2.size());
        assertFalse(wModel2.getLastModel().contains(list1));
        assertEquals(0, wModel2.getSize());
        assertEquals(1, wModel2.getSizeWithoutItem());
        assertEquals(1, wModel2.getSizeWithoutItemWithoutItem().size());
        assertEquals(1, wModel2.getSizeWithItem().size());

        // Tests with data only from the model.
        AbstractNoteListModelWithItem wlmi = wModel.withItem();
        wlmi.clear();
        assertEquals(0, wModel.getSize());
        assertEquals(1, wlmi.getSize());
        assertTrue(wlmi.getLastModel().contains(list1));
        assertEquals(0, wlmi.getSizeWithoutItem());
        assertEquals(1, wlmi.getSizeWithoutItemWithoutItem().size());
        assertEquals(1, wlmi.getSizeWithItem().size());
        assertEquals(false, wlmi.getLastModel().contains(list2));

        AbstractNoteListModelWithoutItemWithoutItem wlmi2 = wlmi.withoutItem();
        assertEquals(0, wlmi2.getSize());
        assertEquals(1, wlmi2.getSizeWithoutItem());
        assertEquals(1, wlmi2.getLastModel().getSizeWithoutItemWithoutItem().size());
        assertEquals(true, wlmi2.getSizeWithoutItemWithoutItem().contains(list1));

        final Collection<AbstractNote> c = wlmi2.getModified();
        Collection<AbstractNote> f = new LinkedList<AbstractNote>();
        // Add some items and test for the collection modification events.
        for (AbstractNote item : new AbstractNote[] {list1, list2}) {
            f.add(item);
        }
        assertEquals(2, f.size());
        assertTrue(f.contains(list2));
        assertTrue(f.contains(list1));
    }
}


class DefaultNoteListModelWithoutItemWithoutItemModel {
    public static Integer size = 0;
    public static Collection<AbstractNote> modified = new HashSet<AbstractNote>();
}

class DefaultNoteListModelWithItemWithoutItemModel extends DefaultNoteListModelWithoutItemWithoutItemModel {
}