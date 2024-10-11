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
		
	/**
	 * Test method for {@link com.allenstudio.ir.ui.DefaultNoteListModel#toArray()}.
	 */
	@Test
	public void testToArray() {
		Vector<AbstractNote> notes = new Vector<AbstractNote>();
		
		notes.add(new Note("one",1,"testOneLineText"));
		notes.add(new Note("two",2,"testTwoLineText"));
		
		
		assertEquals("testOneLineText",notes.get(0).getText());
		assertEquals("testTwoLineText",notes.get(1).getText());
	}
	
	/**
	 * Test method for
	 * {@link com.allenstudio.ir.core.plugins.AbstractNote#getText()}.
	 */
	@Test
	public void testGetText() {
		ArrayList<AbstractNote> list = new ArrayList<AbstractNote>();
		
		Map<String,AbstractNote> map = new HashMap<String,AbstractNote>();
		List<String> list1 = new ArrayList<String>();
		list1.add("item1");
		list1.add("item2");
		list.add(new Note("item1",1,"testOneLineText"));
		list.add(new Note("item2",2,"testTwoLineText"));
		
		map.put("item1",new Note("item1",1,"testOneLineText"));
		map.put("item2",new Note("item2",2,"testTwoLineText"));
		
		List<String> list2 = new ArrayList<String>();
		list2.add("item2");
		
		assertArrayEquals("testOneLineText",new ArrayList<String>().toArray());
		assertArrayEquals("testTwoLineText",list1.toArray());
		assertArrayEquals(new Vector<String>().toArray(),list.toArray());
		assertArrayEquals(new Vector<String>().toArray(),list2.toArray());
		
		assertEquals("testOneLineText",list2.get(0));
		assertEquals("item2",list2.get(1));
	}
	
	/**
	 * Test method for {@link 
	 * com.allenstudio.ir.core.plugins.AbstractNote#getNoteListDataEvent()}.
	 */
	@Test
	public void testGetNoteListDataEvent() {
		
		SimpleNoteListListener listener = new SimpleNoteListListener();
		AbstractNoteListModel listenersModel = new DefaultNoteListModel();
		AbstractNoteListModel listeners = listenersModel;
		
		//Add the listeners to our model
		listenersModel.addNoteListDataListener(listener);
		
		
		//Create an event which will create our listeners model
		TestableNoteListDataEvent event = new TestableNoteListDataEvent(new HashSet<String>(), AbstractNote.ITEM);
		
		//Start listening to the listeners model
		listeners.fireNoteListChanged();
		
		//Create a note that would then be added to the listeners model
		AbstractNote note = new Note();
		
		//Create a note that would then be added to the listeners model
		AbstractNote note2 = new Note();
		
		//Fire a change event because we should have got here before the listener
		listeners.fireNoteListChanged();
		
		//Fire an change event because we should have got here after the listener
		listeners.fireNoteListChanged();
		listenersModel.fireDefaultChanged(event);
		
		try {
			listener.verify();
		} catch (AssertionError e) {
			System.err.println("Listener has thrown an assertion ");
			e.printStackTrace();
			throw e;
		}
		
		assertTrue(!listener.isChanged());
		assertTrue(!listenersModel.isChanged());
		
		assertEquals(listeners,listenersModel);
		listenersModel = listenersModel.toCollection();
		assertTrue(!listenersModel[0].toString().equals("(null)"));
		
		try {
			listener.verify();
		} catch (AssertionError e) {
			System.err.println("Listener has thrown an assertion ");
			e.printStackTrace();
			throw e;
		}
		
		listenersModel = listenersModel.toArray();
		assertTrue(!listenersModel[0].toString().equals("(null)"));
		assertTrue(listenersModel.isEmpty());
		
		//Do the same as with listeners.fireNoteListChanged(), but only remove the event
		try {
			listenersModel = listenersModel.toArray();
			assertEquals(0,listeners.getCount());
		} catch (AssertionError e) {
			System.err.println("Listener has thrown an assertion ");
			e.printStackTrace();
			throw e;
		}
		
		
		assertTrue(!listenersModel[0].isChanged());
		try {
			listeners.fireNoteListChanged();
		} catch (AssertionError e) {
			System.err.println("Listener has thrown an assertion ");
			e.printStackTrace();
			throw e;
		}
		
		assertTrue(!listenersModel[0].isChanged());
		assertTrue(!listenersModel[1].isChanged());
		assertTrue(!listenersModel[2].isChanged());
		
		assertEquals(listeners,listenersModel);
		
		assertTrue(!listeners.isChanged());
		listenersModel = listeners.toCollection();
		assertTrue(!listenersModel[0].isChanged());
		assertTrue(!listenersModel[1].isChanged());
		assertTrue(!listenersModel[2].isChanged());
		
		listeners = listenersModel.toArray();
		assertTrue(!listeners[0].isChanged());
		assertTrue(!listeners[1].isChanged());
		assertTrue(!listeners[2].isChanged());
		assertTrue(!listeners.isChanged());
	}	
}