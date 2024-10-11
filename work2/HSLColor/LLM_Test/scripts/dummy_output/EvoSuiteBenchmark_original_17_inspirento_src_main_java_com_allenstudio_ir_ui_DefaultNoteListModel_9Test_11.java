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
		 * Test method for {@link javax.swing.tree.TreeModel#getRoot()}.
		 */
        public void testGetRoot(){
            final DefaultNoteListModel model= new DefaultNoteListModel();
            final AbstractNote node= model.firstElement();
            assertNotNull("Error in getRoot, must throw a NPE.", node);
        }

        /**
         * Test method for {@link javax.swing.tree.TreeModel#getRoot()}
         * with a specified view instance.
         * @throws Exception
         * @since 3.6
         */
        @Test
        public void testGetRoot_View(){
            final DefaultNoteListModel model= new DefaultNoteListModel();
            final AbstractNote node=
                    new DefaultNoteListModel_9Test.FakeNoteListModel_9Test_View.MyView()
                      .createNote(
                       null, null, null,
                       Collections.singletonMap("Test", (Object)null),
                       null, null, null, null);
            assertNotNull(node.pathData);
            assertEquals(1, model.size());
            assertSame(
                node.pathData,
                model.getRoot().pathData);
        }

        /**
         * Test method for {@link javax.swing.tree.TreeModel#getRoot()}
         * with a specified path instance.
         */
        @Test
        public void testGetRoot_Path(){
            final DefaultNoteListModel model= new DefaultNoteListModel();
            final Set<Object> expected= new HashSet<>();
            final Object pathData= new DefaultNoteListModel_9Test.FakeNoteListModel_9Test_Path.MyPath();
            model.addPath(new DefaultNoteListModel_9Test.MyPath(), pathData);
            expected.add(pathData);
            assertEquals(expected, model.getRoot(), model.getPathData());
        }

	/**
	 * Test method for {@link javax.swing.tree.TreeModel#getRoot()}
     * with a specified root.
     */
        @Test
	public void testGetRoot_Root() {
            final FakeNoteListModel fakeModel=new FakeNoteListModel_9Test.FakeNoteListModel_9Test();
	        assertNotNull(fakeModel.getRoot());
        }
}
// DefaultNoteListModel_9Test.java