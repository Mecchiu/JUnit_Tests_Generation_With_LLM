// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		/* *****************************************************
         * Class elements to test
         */
        
        private Map<AbstractNote, Integer> testSet = new HashMap<>();

        /* *****************************************************
         * Test methods
         */

        @Test
        public void test() {
            testSet.put(new AbstractNote("Test"), 0);
            assertEquals("test", 0, lastIndexOf(new AbstractNote("Test")));
        }

			// DefaultNoteListModel.java
            public DefaultNoteListModel() {
				super();
			}

			// DefaultNoteListModel.java
		@Test
		public void test2() {
			int i= 0;
			defaultAdd(new AbstractNote("Test"), 1);
			assertEquals(i, i);
			i++;
		}

			// DefaultNoteListModel.java
		@Test
		public void test3() {
			int i= 1;
			defaultRemoveAll();
			assertEquals(i, 0, i);
		}

			// DefaultNoteListModel.java
		@Test
		public void test4() {
			int i = lastIndexOf(new AbstractNote("Test"));
			defaultRemoveAll();
			assertEquals(i, 0, i);
			int i2 = lastIndexOf(new AbstractNote("Test"));
			assertTrue(i2 - i*2 <= i);
		}

            // DefaultNoteListModel.java
		@Test
			public void test5() {
				int i= testSet.size();
				testSet.clear();
				testSet.put(new AbstractNote("Test"), 1);
				while(!(i%2 <= 0) ){
					assertTrue(i>0 && (i%2<0));
					defaultRemoveAll();
					assertEquals(i-1, lastIndexOf(new AbstractNote("Test")));
				}
			}

			@Test(expected = IllegalArgumentException.class)
			public void test6() {
				}

}