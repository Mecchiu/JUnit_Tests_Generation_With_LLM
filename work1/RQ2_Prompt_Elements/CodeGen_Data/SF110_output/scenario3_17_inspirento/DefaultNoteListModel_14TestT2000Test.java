// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
private static final TestObject FOO = TestObject.create(TestObjectModel.class);
		private static final TestObject BAR = TestObject.create(TestObjectModel.class);
    private static class TestObject extends AbstractNote {
        private final TestObjectModel model;

        /**
         * Default constructor.
         */
        public TestObject() {
            model = null;
            model = null;
        }

		/**
		 * Constructor for testing the {@link #remove(int)} method.
		 *
		 * @param model the instance of {@link TestObjectModel} to be tested
		 */
		public TestObject(TestObjectModel model) {
			super();
			this.model = model;
		}
	};

	@Test
    void testRemove() {
        // Create a model object
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(FOO);
        model.add(BAR);

        // Remove the object from the model
        model.remove(1);

        // The value for the list should be null
        assertNull(model.get(0));
    }

    @Test
    void testModifications() throws ArrayIndexOutOfBoundsException {
        // Create a model object
        DefaultNoteListModel model = new DefaultNoteListModel();

        assertEquals(0, model.indexOf(FOO));
        assertEquals(0, model.indexOf(BAR));

        model.add(FOO);
        model.add(BAR);

        // The value for the list should be null
        assertNotNull(model.get(0));

        // Check remove operation
        model.remove(2);

        // The value for the list should be null
        assertNull(model.get(2));
    }

	@Test
    void testGet() throws ArrayIndexOutOfBoundsException {
		// Create a model object
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(FOO);
        model.add(BAR);

        // The value for the list should be null
        assertNotNull(model.get(0));

        // Check get operation
        DefaultNoteModel item = model.get(2);
        assertEquals("Bar", item.getType());
        assertEquals(FOO, item.getNote());
        assertFalse(model.get(2).equals(item));
    }

    @Test
    void testClear() throws ArrayIndexOutOfBoundsException {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(FOO);
        model.add(BAR);

        // The value for the list should be null
        assertNotNull(model.get(0));

        model.clear();

        // The value for the list should be empty
        assertTrue(model.get(0).isEmpty());
    }

    public static final class TestObjectModel implements TestObject {

        private final String type;
        private final Set<Object> objects = new HashSet<>();

        private TestObjectModel() {
            this("");
        }

        private TestObjectModel(String type) {
            this.type = type;
        }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public void addObject(Object o) {
            objects.add(o);
        }

        @Override
        public Iterator<Object> objectsIterator() {
            return objects.iterator();
        }

        @Override
        public boolean removeObject(Object o) {
            return objects.remove(o);
        }

        @Override
        public boolean hasObject(Object o) {
            return objects.contains(o);
        }

        @Override
        public void clear() {
            objects.clear();
        }
    }

    public static final class TestObjectModel_14Test extends testObjectModel {
	    private final TestObjectModel model;

	    private TestObjectModel() {
	        this("");
	    }

	    private TestObjectModel(String type) {
	        this.model = new TestObjectModel(type);
	    }

        @Override
        public String getType() {
            return "foobar";
        }

        @Override
        public Collection<Object> objects() {
            return model.objects();
        }

        @Override
        public void addObject(Object o) {
            model.addObject(o);
        }

        @Override
        public Object removeObject(Object o) {
            return model.removeObject(o);
        }

        @Override
        public boolean hasObject(Object o) {
            return model.objects().contains(o);
        }

        @Override
        public void clear() {
            model.clear();
        }
    }
}
