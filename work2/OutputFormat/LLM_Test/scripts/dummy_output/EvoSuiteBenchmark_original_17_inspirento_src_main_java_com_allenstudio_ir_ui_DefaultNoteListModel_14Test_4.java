// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
		
    @Test
    void testRemovesAll() {
        final int size = 2;
        final int number = 2;

        AbstractNote[] old = new AbstractNote[] {
            new Note("Test 1"),
            new Note("Test 2"),
            new Note("Test 3")
        };
        AbstractNote[] newArray = new AbstractNote[] {
            newNote(number, "Test 4"),
            newNote(number, "Test 5")
        };

        Object[][] testArray = new Object[][] {
            {"Test 6", "Test 6"},
            {"Test 1", "Test 2"},
            {"Test 1", "Test 3"},
            {"Test 4", "Test 5"},
            {"Test 1", "Test 2"},
            {"Test 6", "Test 2"},
            {"Test 1", "Test 3"},
            {"Test 4", "Test 5"},
        };

        ((AbstractNote)AbstractNoteListModel.removeAll()).add(0, newArray);
        assertEquals(0, ((AbstractNote)AbstractNoteListModel.removeAll()).size());

        AbstractNoteListModel.removeAll();

        assertEquals(2, ((AbstractNoteListModel)AbstractNoteListModel.removeAll()).size());
        assertEquals(3, ((AbstractNoteListModel)AbstractNoteListModel.removeAll()).get().size());

        Object[] ret = ((AbstractNoteListModel)AbstractNoteListModel.removeAll()).get().toArray();

        for (int i = 0; i < 4; i++) {
            assertEquals(old[i], ret[i]);
        }

        for (int i = 0; i < 4; i++) {
            assertEquals(old[i], old[i + 4]);
        }

        AbstractNoteListModel.removeAll();

        for (int i = 0; i < size; i++) {
            AbstractNoteListModel.remove(i);
        }

        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(ret[i]);
            assertEquals(old[i], ret[i - 4]);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(old[i], old[i - 4]);
        }
    }

	@Test
	public void testAddRemoveAll() {
		long startTime = System.currentTimeMillis();
		int timeToRun = Integer.parseInt("8000");
		//AbstractNoteListModel.addListDataListener(new ListModelListener());
		AbstractNoteListModel.addListDataListener(new Listener());
		AbstractNoteListModel.addAll();
		AbstractNoteListModel.removeAll();
		AbstractNoteListModel.removeAll();
		ListModel<?> list = AbstractNoteListModel.getModel();
		int total = list.size();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		Object[][] data = new Object[][] {
				new Object[] {"Test 1", "Test 2", "test1"},
				new Object[] {"Test 2", "Test 3", "test2"},
				new Object[] {"Test 3", "", null},
				
				new Object[] {"Test 1", "test1", "test1"},
				new Object[] {"Test 1", "test1", "test2"},
				new Object[] {"Test 2", "test1", "test1"},
				new Object[] {"Test 3", "", null},
//				new Object[] {"","", "test3"},
//				new Object[] {"","", null}
		};

		ArrayList<Object[]> testArrayList = new ArrayList<Object[]>();

        ((AbstractNoteListModel)AbstractNoteListModel.removeAll()).add(data);
		
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < total; i++) {
			AbstractNote oldItem;
			if(list.getModelIndex(i) >= 0) {
				oldItem = (AbstractNote) list.getModel().getItem(list.getModelIndex(i));
			} else {
				oldItem = null;
			}

			System.out.println(data[i][0]);
			System.out.println(data[i][2]);
			assertEquals(data[i][0], data[i][2]);
		
			assertEquals(list.getModelIndex(i), list.getModel().indexOf(oldItem));
		}
    }

	public static final void run(int run, int number, NoteListModel model) {
		AbstractNoteListModel.run(run, number, model, null);
	}

	private static void run(int run, int number, NoteListModel model, Listener listener) {
		AbstractNote[] array = new AbstractNote[] {
			new Note("Test 4"),
			new Note("Test 7"),
			new Note("Test 9")
		};

		final AbstractNoteListModel m = new DefaultNoteListModel(run);
		model.addListDataListener(listener);
		m.add(array);
		final long endTime = System.currentTimeMillis();
		System.out.println("Model=" + m);
		System.out.println("Time=" + (endTime - startTime) + " milliseconds");
		startTime = endTime;

		model.removeAll();
	}

	private static final Listener LISTENER = new Listener() {
		@Override
		public void update(NoteListDataEvent event) {
			int index;
			try {
				index = event.getIndex();
				if (index >= 0 && index <= 3) {
					System.out.println(event);
				}
			} 
			catch (ArrayIndexOutOfBoundsException aiobe) {
				System.out.println(aiobe);
			} 
			catch (NullPointerException npae) {
				System.out.println(npae);
			}
		}
	};

	private static final class Listener implements NoteListDataListener {
		@Override
		public void eventOccurred(NoteListDataEvent event) {
			if(event.getType() == NoteListDataEvent.TYPE_DATA_CHANGED) {
				System.out.println(event.getType());
				System.out.println(event);
			}
			System.out.println("type= " + event.getType());
		}
	}
}