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
		
    Object table;
    Collection<? extends Collection<?,?>> result;
	private AbstractNote ab;
        
    public DefaultNoteListModel_9Test(Object table) {
        this.table = table;
               
               
        }

        
    private Collection<Collection<?,?>> makeModel(boolean insertBefore) {        
        if(table == null) {// table == null = new DefaultListModel()
            table = new DefaultTableModel();
            
            for(int i = 0; i < 7; i++) {
                    ((DefaultTableModel)table).insertDefCell(-1,i);
            }           
            table.setRow(0, new DefaultCellNameProvider()); 
            table.setCellRenderer(new DefaultCellRenderer()); 
        }
        return table;        
    }

	@Test
	public void testAddNote() {
		Collection<Collection<?,?>> table = makeModel(true);
		assertNotNull(table);

        Collection<AbstractNote> testCollection = new ArrayList<>();
		// The result of table.get(testCollection.size()) is an ArrayList.
		table.get(3).add(new DefaultNote(ab.getNote().getUniqueNoteId()));
		assertEquals(2, table.get(3).size());

		
	}


	@Test_MethodOf_DefaultNoteListModel_9Test(String other) {
		Collection<Collection<?,?>> table = makeModel(true);
		assertNotNull(table);
		
        Collection<AbstractNote> testCollection = new ArrayList<>();
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        testCollection.add(new DefaultNote(ab.getNote().getUniqueNoteId()));
        
        // table.remove(testCollection.iterator().next());

	}
}