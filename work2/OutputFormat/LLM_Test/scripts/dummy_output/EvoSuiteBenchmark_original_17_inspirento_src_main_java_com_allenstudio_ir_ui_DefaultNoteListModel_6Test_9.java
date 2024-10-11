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
		
	private class TestDataObject implements Comparable {
		public final List<Integer> vec = new ArrayList<>();
		public List<Integer> asIntVector() {
			assertTrue(vec.size() > 0);
			List<Object> data = new LinkedList<>();		
			for (Integer i : vec)
				data.add(i);
			return data;
		}
		public int lastIndexOf(List<Integer> elems) {
			int l = -1;
			for (Integer i : elems)
				if (data.lastIndexOf(i))
					l = Math.min(l, data.size() - 1);
			return l;
		}

		@Override
		public String toString() { return data.toString(); };

		@Override
		public int hashCode() {
			return data.hashCode();
		}
	}

	@Test
	public void emptyList() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		m.addNotelistlistener(new NoteListDataListener() {
			@Override
			public void afterNoteListDataUpdate(int nextItemIndex, String elementName,
					Object dataObject) {
			}
			@Override
			public void afterNewNoteListDataEvent(NotelistableEvent event) {
				System.out.println(event);
			}});
		m.addItem(new TestDataObject());
		assertTrue(m.containsItem(new TestDataObject()));
	}

	@Test
	public void addNewItemNullData() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		m.addNotelistlistener(new NoteListDataListener() {
			@Override
			public void afterNoteListDataUpdate(int nextItemIndex, String elementName,
					Object dataObject) {
			}
			@Override
			public void afterNewNoteListDataEvent(NotelistableEvent event) {
				System.out.println(event);
			}});
		m.addItem(null);
		assertTrue(m.containsItem(null));
	}

	@Test
	public void addNewItemNotNullData() {
		DefaultNoteListModel m = new DefaultNoteListModel();
}
}