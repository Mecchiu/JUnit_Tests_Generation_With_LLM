// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
     * Constructor for DefaultNoteListModel(Vector<AbstractNote>) test case.
     *
     * @param testEnum testEnum for {@link DefaultNoteListModel#elements()}.
     * @see #elements
     */
    public DefaultNoteListModel_2Test (@NonNull final AbstractNote testEnum) {
        this.testEnum = testEnum;
    }
	
    /** testEnum for {@link DefaultNoteListModel#elements()} method. */
    @NonNull	private final AbstractNote testEnum;

    /**
     * Initializes the test instance.
     */
    @Test
    public final void initializes() {
        final DefaultNoteListModel model = new DefaultNoteListModel(this.testEnum);
        assertNotNull(model);
    }
    
    /**
     * Tests if elements() returns an empty set.
     */
    @Test
    public final void listElementsTest() {
        try {
            List<AbstractNote> result = this.testEnum.elements();
            requireNonNull(result);
            assertNotNull(result);
            Collections.sort(result);
            final Set<AbstractNote> items = ModelTestUtils.createSet(this.testEnum);
            final Map<AbstractNote,Integer> counter = ModelTestUtils.createCounter();
            this.testEnum.forEachAbstractNoteNested(new NoteListDataListener() {
                @Override
                public void noteListDataAdded (@NonNull NoteListDataEvent event) {
                    counter.put(event.getNotes().get(0), counter.get(event.getNotes().get(0)) + 1);
                }
            });
            assertTrue(result.equals(new List<>(items)));
            assertEquals(model.listElements().size(), 1);
        } finally {
            assertNotNull(model);
        }
    }
    
    /**
     * Tests if elements() returns 1 element.
     */
    @Test
    public final void listElementsOneOne() {
        try {
            List<AbstractNote> result = this.testEnum.elements();
            assertNotNull(result);
            assertTrue(model.listElements().size() == 1);
            Collections.sort(result);
            final Map<AbstractNote,Integer> counter = ModelTestUtils.createCounter();
            this.testEnum.forEachAbstractNoteNested(new NoteListDataListener() {
                @Override
                public void noteListDataAdded (@NonNull NoteListDataEvent event) {
                    counter.put(event.getNotes().get(0), counter.get(event.getNotes().get(0)) + 1);
                }
            });
            assertTrue(result.contains(this.testEnum));
            assertEquals(model.listElements().get(0), result);
            assertEquals(model.listElements().get(1), result);
        } finally {
            assertNotNull(model);
        }
    }
	
	/** Returns the testEnum for the list elements test case. */
    @NonNull private final AbstractNote testEnum;
	
    /** The model to verify the items in listElements(). */
    private final DefaultNoteListModel instance;
}