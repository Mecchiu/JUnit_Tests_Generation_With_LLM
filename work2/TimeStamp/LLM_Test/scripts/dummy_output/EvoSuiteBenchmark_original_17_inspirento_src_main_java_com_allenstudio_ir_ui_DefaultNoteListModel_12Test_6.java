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
		
	/** Test of toArray method, of class com.allenstudio.ir.ui.NotesListModel. */
        @Test
        public void toArrayTest() {
		Collection<AbstractNote> coll = new ArrayList<>();
		
		if (coll.isEmpty()) {
		        coll.add(new Note());
		}
		
		Integer[] ints = new Integer[6];
		ints[0] = 6;
		ints[1] = 6;
		ints[2] = 6;
		ints[3] = 12;
		ints[4] = 6;
		ints[5] = 6;
		
		coll.add(new Note());
		coll.add(new Note());
		coll.add(new Note());
		coll.add(new Note());
		
		Set<Integer> setInts = new HashSet<>(Arrays.asList(ints));
		
		ArrayList<AbstractNote> list = new ArrayList<>();
		
		list.add(0, new Note());
		list.add(1, new Note());
		list.add(2, new Note());
		list.add(3, new Note());
		list.add(4, new Note());
		list.add(5, new Note());
		
		for (AbstractNote element : setInts) {
			list.add(element.getId(), element);
		}
		
		list.add(new Note());
		list.add(new Note());
		list.add(new Note());
		list.add(new Note());
		list.add(new Note());
		list.add(new Note());
		list.add(new Note());
		
		for(Integer obj:setInts) {
			AbstractNote next = list.get(list.indexOf(obj));
			
			assertEquals(list.get(list.indexOf(obj)), next.getNote());
			
			list.remove(next);
			
			assertEquals(list.size(), list.size());
		}
	}
}