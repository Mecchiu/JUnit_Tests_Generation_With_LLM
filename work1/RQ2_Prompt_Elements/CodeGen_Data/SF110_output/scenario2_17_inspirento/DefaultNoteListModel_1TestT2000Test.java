// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
@Test
		public void testAddRemove1() {
			final int n = 10;
			Collection<AbstractNote> c = new DefaultNoteListModel().add(new Note(100, 10)).
			get(n);
			assertEquals(n, c.size());

			AbstractNote c2 = c.iterator().next();
			assertEquals(c2.getPosition(), 100);
			assertEquals(c2.getData(), 10);
//			Set<AbstractNote> c3 = c.iterator().next().getAllAbbreviated();
//			assertEquals(c3.size(), 4);
//			assertEquals(c3.contains(c2), true);
		}

		@Test
		public void testFirst() {
//			AbstractNote a = new Note(200, 0).addData("A").addData("B").addData("C").
			Integer a = 20;
			assertEquals(a, new DefaultNoteListModel().first().getData());
			a = new DefaultNoteListModel().first().getData();
			assertEquals(a, 0);

			a = new DefaultNoteListModel().first().getData().toString();
			assertEquals(a, "ABC");
		}

		@Test
		public void testLast() {
//			AbstractNote a = new Note(200, 0).addData("A").addData("B").addData("C").
			Integer a = 20;
			assertEquals(a, new DefaultNoteListModel().last().getData());
			a = new DefaultNoteListModel().last().getData();
			assertEquals(a, (new DefaultNoteListModel().size() - 1).
			getData().toString());
		}

		@Test
		public void testSize() {
			int n = 17;
//			List<Integer> a = new DefaultNoteListModel().
//			list(new DefaultNoteListModel().first(),
//			        new DefaultNoteListModel().first(),
//			        new DefaultNoteListModel().first()).
//			size();
//			if (n!= a.size()) {
//				fail("Size of list changed");
//			}
		}

		@Test
		public void testIterator() {
			DefaultNoteListModel m = new DefaultNoteListModel();
			Collection<AbstractNote> collection = m.list(new DefaultNoteListModel().first());

			Iterator<AbstractNote> it = collection.iterator();
			while (it.hasNext()) {
				assertTrue(it.next() instanceof AbstractNote);
			}

		}

        @Test
   		public void testSubItemsIterator() {
			//FIXME why is this commented out?
   			final int n = 0;
   			final int n = 1;
   			final int n = 2;
   			final int n = 3;
   			final int n = 4;
   			final int n = 5;
   			final int n = 6;
   			DefaultNoteListModel m = new DefaultNoteListModel();
   			Collection<AbstractNote> list = m.list(new DefaultNoteListModel.ListNode(n));

   			Iterator<AbstractNote> it = list.iterator();
   			while (it.hasNext()) {
   				assertTrue(n > 0);
   				check(it.next(), n - 1);
   				check(it.next(), n);
   				//
   				assertTrue(it.hasNext());
   				check(it.next(), n);
    			}

   		}

	    @Test
   	    public void testAddRemove() {
   	    	DefaultNoteListModel m = new DefaultNoteListModel();
   	    	m.add(new Note(100, 0));
   	    	m.add(new Note(100, 1));
   	    	m.add(new Note(100, 2));
   	    	assertEquals(new DefaultNoteListModel().size(), 4);
   	    	assertEquals(new DefaultNoteListModel().get(1).getData(), 1);
   	    	assertEquals(new DefaultNoteListModel().get(2).getData(), 2);
   	    	assertEquals(new DefaultNoteListModel().get(3).getData(), 3);
   	    	Collection<AbstractNote> collection = m.list(new DefaultNoteListModel.ListNode(3));

   	    	Collection<AbstractNote> collection2 = m.subItemsIterator(new DefaultNoteListModel.ListNode(0));

   	    	assertEquals(new DefaultNoteListModel().size(), 4);
   	    	assertEquals(new DefaultNoteListModel().subItemsIterator(new DefaultNoteListModel.ListNode(1)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(2)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(3)).
   	    	size(), 4);
   	    	Collection<AbstractNote> collection3 = m.subItemsIterator(new DefaultNoteListModel.ListNode(0));

   	    	assertEquals(new DefaultNoteListModel().subItemsIterator(new DefaultNoteListModel.ListNode(1)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(2)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(3)),
   	    	new ArrayList<AbstractNote>(m.list(new DefaultNoteListModel.ListNode(1)).subItemsIterator(new DefaultNoteListModel.ListNode(2)).subItemsIterator(new DefaultNoteListModel.ListNode(3)), 3));
   	    	assertEquals(new DefaultNoteListModel().subItemsIterator(new DefaultNoteListModel.ListNode(0)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(1)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(2)),
   	    	new ArrayList<AbstractNote>(collection2));
   	    	assertEquals(new DefaultNoteListModel().subItemsIterator(new DefaultNoteListModel.ListNode(3)).
   	    	subItemsIterator(new DefaultNoteListModel.ListNode(0)),
   	    	new ArrayList<AbstractNote>(collection3));
   	    	assertEquals(collection.iterator().next(), 1);
   	    }

	}
