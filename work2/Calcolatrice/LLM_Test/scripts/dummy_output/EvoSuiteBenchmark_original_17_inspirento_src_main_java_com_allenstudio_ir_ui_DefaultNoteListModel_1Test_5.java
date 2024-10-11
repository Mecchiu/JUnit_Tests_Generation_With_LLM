// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
		/** Test suite for {@link DefaultNoteListModel#size()} method */
		@Test
    void testSize() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new MyAbstractNote("My note"));
		model.add(new MyAbstractNote("My second note which I like"));
		assertEquals(3, model.size());
		model.add(new MyOtherAbstractNote("My new note"));
		assertEquals(2, model.size());
    }
		private class MyAbstractNote extends AbstractNote {
        public MyAbstractNote(String note) {
            setText(note);
        }
		}

		private class MyOtherAbstractNote extends AbstractNote {

        public MyOtherAbstractNote(String note) {
            setText(note);
        }

		}

		private class MyIntegerHashMap extends DefaultNoteListModel.MyAbstractNote {
	        private static final long serialVersionUID = 1L;

	        @Override
	        public int hashCode() {
	            Class cls = getClass();
	            return "My IntegerHash Map".hashCode() ^ ((cls.hashCode()) * (cls.hashCode() + 1));
	        }
	        @Override
	        public boolean equals(Object o) {
	            Class cls = o.getClass();
	            return cls.hashCode() == "My IntegerHash Map".hashCode()? super.equals(o) : false;
	        }
	        @Override
	        public String toString() {
	            return "My IntegerHash Map";
	        }
		}
}