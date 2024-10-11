// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
		public DefaultNoteListModel_3Test() {
		}
		
		
    @Test
    public void testContains() {
       DefaultNoteListModel model = new DefaultNoteListModel();
       assertFalse(model.contains( (AbstractNote) null ));
       assertFalse(model.contains(((AbstractNote) null) ));
       assertTrue(model.contains( ((AbstractNote) null) ));
    }
    
    @Test
    public void testGetNoteListData() {
       DefaultNoteListModel model = new DefaultNoteListModel();
       model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
       model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
       
       //test add data 
       model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
				model.fireEvent(new NoteListDataEvent());
			}
		});
       //test remove data 
       model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
				model.fireEvent(new NoteListDataEvent());
			}
		});

       // test getNoteListData
       testNoteListData(model);

       assertNotNull(model.getNoteListData());

	}
		
	@Test
	public void testSetNoteListDataSize() {
		System.out.println("Test SetNumberOfNotes");
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
				model.fireEvent(new NoteListDataEvent());
			}
		});
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
				model.fireEvent(new NoteListDataEvent());
			}
		});
		model.setNoteListDataSize(12);
		testNoteListData(model);
		
		assertEquals(12, model.getNoteListData().size());
		
	}
		
	private void testNoteListData(DefaultNoteListModel model) {
		System.out.println("Test GetNumberOfNotes");
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
				model.fireEvent(new NoteListDataEvent());
			}
		});
		System.out.println(model);
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
		model.addNoteListDataListener(new NoteListDataListener() {
			public void data(NoteListDataEvent event) {
				System.out.println("New Data: " + event.getData());
			}
		});
		
		List<AbstractNote> list = model.getNoteListData();
		model.fireEvent(new NoteListDataEvent());
		assertTrue(list.size()==1);
		
		list = model.getNoteListData();
		DefaultNote last = list.get(list.size()-1); // last object
		model.fireEvent(new NoteListDataEvent());
		model.fireEvent(new NoteListDataEvent());
		DefaultNote newlast = model.getNoteListData().get(0); // get oldest object
		if (last!=newlast) {
			assertTrue(last.getData().equals(newlast.getData()));
			assertEquals(list.get(0).getData(), last.getData());
			// assertFalse(last.getData()==last.getData()); // this should test if all added objects match exactly
		} else assertTrue(last.getData()==null);
		
	}


	@Test
    public void testHashCodeEqual() {
       DefaultNoteListModel model = new DefaultNoteListModel();
       System.out.println("Test AddSameNote");

       DefaultNote first = new DefaultNote("first");
       first.setNote2("first");
       
       model.addNoteListDataListener(first);
       model.addNoteListDataListener(first);
       model.addNoteListDataListener(first);

       DefaultNote second = new DefaultNote("second");
       second.setNote2("second");
       
       model.addNoteListDataListener(second);
       model.addNoteListDataListener(second);
       model.addNoteListDataListener(second);

       System.out.println("Test Hashcode equal");
       assertEquals(model.hashCode(), model.hashCode());
    }

	@Override
    protected void addNote(AbstractNote value) {
        DefaultNote newNote = new DefaultNote(value.getName(),value.getColor(), value.getNumber());
        newNote.setNote2(value.getNote2());
        model.addNote(newNote);
    }

}