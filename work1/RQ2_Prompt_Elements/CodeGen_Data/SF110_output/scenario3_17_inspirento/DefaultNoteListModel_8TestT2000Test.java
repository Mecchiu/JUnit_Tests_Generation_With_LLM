// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {

    /**
     * Executes the current test case
     */
     @Test
	public void test() {
         AbstractNote testItem = this.testItem();
        testItem.setListener(new AbstractNoteListModel_8Test.TestNoteListModelListener());
        this.testItem();
    }
    

	/* Test event listener
	@Test
	public void testEventListener() {
        NoteListModel model = new DefaultNoteListModel();
        model.addNoteListListener(new NoteListModelListener() {
        	public void noteAdded(NoteListDataEvent e) {
        		System.out.println("Added "+e.getNote());
        	}
        	public void noteRemoved(NoteListDataEvent e) {
        		System.out.println("Deleted "+e.getNote());
        	}
        });
        model.addNoteListDataEventListener(new NoteListDataListener() {
        	public void noteAdded(NoteListDataEvent e) {
        		System.out.println("Added "+e.getNote());
        	}
        	public void noteRemoved(NoteListDataEvent e) {
        		System.out.println("Deleted "+e.getNote());
        	}
        });
        
        model.add(testItem());
        
        model.add(testItem());
        
        List<AbstractNote> notes = model.get(0);
        model.remove(testItem());
        model.get(2);
        model.remove(model.get(1));
        model.get(2);
    	model.remove(model.get(2));
    	model.get(1);
	}
    */
		
	private class TestNoteListModelListener implements NoteListModelListener {
		public void noteAdded(NoteListDataEvent e) {
			
		}
		public void noteRemoved(NoteListDataEvent e) {
			
		}
	}
	class TestNoteListModel extends DefaultNoteListModel {
		public List<AbstractNote> get() {
			return null;
		}
		public List<AbstractNote> get(int index) {
			return null;
		}
		
		private static class TestNoteItem extends AbstractNote {

		}
	}

	private class TestNoteItem extends AbstractNote {

		private static class TestNoteItem2 extends AbstractNote {

		}
	}
	class TestNoteItem2 extends AbstractNote {

		private static class TestNoteItem2_7 extends AbstractNote {

		}
	}
	class TestNoteItem2_7 extends AbstractNote {

		private static class TestNoteItem2_9 extends AbstractNote {

		}
	}
	
	private class TestNoteItem extends AbstractNote {
		
		@Override
		public String getName() {
			return null;
		}

		@Override
		public String setName(String name) {
			return null;
		}
	}
	
	private class TestNoteItem_8 extends AbstractNote {

		private final String name = "testItem 1";
		

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String setName(String name) {
			return name;
		}
			
	}
	
	private class TestNoteItem_7 extends AbstractNote {
			
		private final String name = "testItem 2";

		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public String setName(String name) {
			return name;
		}
	}
	
	private class AbstractNoteListModelListener implements NoteListDataListener {
		
		public void noteAdded(NoteListDataEvent e) {
			System.out.println("added "+e.getNote());
		}
		public void noteRemoved(NoteListDataEvent e) {
			System.out.println("deleted "+e.getNote());
		}
	}
	private class TestNoteListModel_8Test implements NoteListModel {

		public void add(AbstractNote newItem) {
			//fail("Method is not implemented");
		}
		public void remove(AbstractNote oldItem) {
			//fail("Method is not implemented");
		}
	}
}
