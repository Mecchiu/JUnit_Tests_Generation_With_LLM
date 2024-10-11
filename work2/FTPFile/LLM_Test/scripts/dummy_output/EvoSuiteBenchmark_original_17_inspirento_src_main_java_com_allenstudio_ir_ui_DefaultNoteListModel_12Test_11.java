// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {
		private DefaultNoteListModel thisDefault;
		/**
		 * Constructs a new DefaultNoteListModel with the given data model
		 * @param model a DataModel
		 */
		public DefaultNoteListModel_12Test(NoteListModel model) {
			thisDefault = new DefaultNoteListModel(model);
		}
		
        /**
         * Verifies if this model can accept and accept an object and get it
         * @throws IllegalArgumentException if the object is illegal
         */
        @Test
        public void testValidObject() {
            // Check if the validator is invoked with this object
            // if its not null
            final TestValidator validator = thisDefault.getValidator();
            assertNotNull("getValidator is not null", validator);
            
            final AbstractNote obj = new DefaultNote();
            checkValidObj(thisDefault, obj);
        }

        /**
         * Verifies if the list contains this object as one and only one 
         * @throws IllegalArgumentException if more then one object is
         *                                   accepted
         */
		@Test
        public void testSingelton() {
            final NoteListModel model = new DefaultNoteListModel();
            checkSingleton(thisDefault, model);
        }

        /**
         * Verifies the internal object
         */
		public void checkSingleton(DefaultNoteListModel thisDefault, AbstractNote thisObj) {
			final List<List<AbstractNote>> list = new ArrayList<>();
			final List<AbstractNote> listObjOne = new ArrayList<>();
			AbstractNote objOne = thisObj;
			do {
				listObjOne.add(objOne);
				objOne = objOne.getChild(0);
			} while (false);

			model.remove((AbstractNote) objOne);
			thisDefault.add(thisObj);
            checkEquals(new ArrayList<>(Arrays.asList(objOne)), listObjOne);
		}
		
		/**
		 * Check the internal object
		 */
		public void checkEquals(List<? extends Object> actual, List<? extends Object> expectedList) {
			Set<Object> set = new HashSet<>();
            set.addAll(actual);
            set.addAll(expectedList);

            assertEquals("expect one element", expectedList, set);
        }

        /**
         * Set the default validation object for this item
         * @param object the value to set
         */
		public void setValidator(TestValidator obj) {
			// Set the validator
			super.setValidator(obj);
		}
}