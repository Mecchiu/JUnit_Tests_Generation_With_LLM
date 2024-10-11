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
     * It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
     */
    @Test
	void firstElement() {
    	final AbstractNote note = new Note("Note 1", true);
    	final NoteListDataListener<AbstractNote> listener = new MyNoteListDataListener();
    	final List<AbstractNote> noteList = new ArrayList<AbstractNote>();
    	final Iterator<AbstractNote> iterator = noteList.iterator();
    	final NoteListModelModel model = new DefaultNoteListModel();
    	model.addListener(listener);
    	final Iterator<AbstractNote> it = model.firstElement().iterator();
    	final boolean boolNext = it.hasNext();
    	final AbstractNote tmp = it.next();
    	model.removeListener(listener);
    	assertFalse(boolNext);
    	assertNotNull(tmp);
    	}
	
	@Test (expected = NoSuchElementException.class)
	void firstElementException() {
		AbstractNoteListModel model = new DefaultNoteListModel();
		model.firstElement();
	}
	
	private static class MyNoteListDataListener implements NoteListDataListener<AbstractNote> {
		private List<AbstractNote> data;
		private HashMap<AbstractNote, Integer> indexToIndex = new HashMap<AbstractNote, Integer>();
		
		public MyNoteListDataListener() {
			super();
			addModel((AbstractNote) null);
		}
		
		/**
		* It can be called from inside the <code>addModel()</code> method.
		* @see com.allenstudio.ir.core.plugins.AbstractNoteListModel#addModel(com.allenstudio.ir.core.plugins.AbstractNoteListModel)
		* @see com.allenstudio.ir.core.plugins.AbstractNoteListModel#getModel()
		*/
		public void addModel(AbstractNoteModel model) {
			if (model.getModel() instanceof DefaultNoteListModel) {
				data = ((DefaultNoteListModel<AbstractNote>) model.getModel()).data;
				indexToIndex.clear();
			}
		}
		
		public void modelChanged(NoteListDataEvent<AbstractNote> event) {
			AbstractNote note = event.getObject();
			Integer index = indexToIndex.get(note);
			if (index == null) { 	// We remove all elements from the model
			  indexToIndex.clear();
			  if (event.isAddedListDataItem()) {  // Only if it is a added element
			  	for (int i = 0; i < event.getNewObject().size(); i++) {  // We remove all elements
				  	listen();
				  }
			  }
			} else if (index!= null && event.isUpdatedListDataItem()) {  // We add and remove the old one
				listen();
			}
		}
		
		public void listen() {
			Integer index = indexToIndex.get(firstElement());
			if (index!= null) {
				setModel(null);
				indexToIndex.put(firstElement(), index);
			}
		}
		
		public List<AbstractNote> getModel() {
			return data;
		}

		public void setModel(List<AbstractNote> data) {
			this.data = data;
		}    
		/**
		* This method should never be called from outside.
		*/
		
	}
}