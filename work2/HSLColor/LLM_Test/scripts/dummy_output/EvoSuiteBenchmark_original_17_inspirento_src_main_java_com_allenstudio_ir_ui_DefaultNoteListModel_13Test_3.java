// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		
}

// DefaultNoteListModel_14JUnitTest.java

// The list models will contain the following
// A) {@link AbstractNote#isSelected()}<br>
//
// B) {@link AbstractNote#hasNoteContent(String)}<br>
//
// C) get<br>
//
// D) getChildren<br>
//
// E) list of all notes<br>
//
// F) list of selected notes <br>
//
// G) list of all notes containing content<br>
//
// H) has <br>
//
// I) list of selected notes <br>
//
// J) list of all notes with all selected <br>
//
// K) list of all notes that have more or less content<br>
//
// L) list of all notes containing content that has <br>
//
// M) list of all notes the user has selected <br>

public class DefaultNoteListModel_14Test {
		
    class TestModel extends AbstractNoteListModel {
		
		TestModel() {

        }

        AbstractNoteElement[] getChildren() {
            return null;  
        };

        boolean hasNoteTextContent( String name ) {
            return false;
        };
        List<? extends AbstractNote> getChildren( Element element ) {
            return null;
        };

        /**
         * Returns the element at the specified position in this list
         * or <code>null</code> if the index is out of range (<code>index &lt; 0 || index &gt;= size()</code>).
         *
         * @param index index of element to return
         */
        AbstractNote get(int index)
        {
            return null;
        }
		
	}
	
	/**
	 * Creates a new instance of <code>DefaultNoteListModel</code>.
	 */
	@Test
    public void testConstructorDefaultNoteListModel() {
        assertNotNull( DefaultNoteListModel.class.getName() );
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertTrue( "DefaultNoteListModel has no children", model.getChildren() == null );
        assertTrue( "DefaultNoteListModel has no hasNoteTextContent", model.hasNoteTextContent( "text" ) );
        assertFalse( "DefaultNoteListModel has a note with Content", model.hasNoteContent( "Content" ) );
        assertEquals( "DefaultNoteListModel has no list of all notes", new Vector(), model._allNotes );
        assertNull( "Non null default list of all notes", model._selectedNotes );
        assertNull( "Empty default list of all notes", model._allNotes.get(0) );
        assertNull( "Null default list of all notes", model.get(0) );
        assertEquals( "DefaultNoteListModel has only one group of all notes", 1, model.getChildren( Element.GROUP_ELEMENT ).size() );
        assertNull( "Empty default list of all notes", model.getChildren( Element.GROUP_ELEMENT ) );
	}

    /*
	 * Test methods
	 */
    
    /**
     * Gets the list model as collection
     */
    public abstract Collection<? extends AbstractNote> getAllNotes();

    /**
     * Tries to get the list model with a custom name that is invalid
     */
    public abstract DefaultNoteListModel getWithInvalidName();
    
    /**
     * Tests the getAllNotes method.
     */
    @Test
    public void testGetAllNotesMethod() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertNotNull( "DefaultNoteListModel is null", model.getAllNotes() );
        assertFalse( "List should contain no elements", model.getAllNotes().size() == 0 );
        for ( AbstractNote element : model.getAllNotes() ) {
            assertFalse( "There should be no children", ((DefaultNoteListModel) element.getListModel()).getChildren().size()!= 0 );
        }
    }
}