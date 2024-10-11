// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		
	// private AbstractNote element;
	private DefaultNoteListModel model;

	private int index = 5;

	/**
     * @throws IllegalArgumentException If <code>index</code> is <code>0</code>
     */
	private DefaultNoteListModel(int index) throws IllegalArgumentException {
		// if (index == 0) {
			// throw new IllegalArgumentException("Invalid index");
		// }

		// The index for this test.
		this.model = this;
		model.listeners.add(new NoteListDataListener() {
			@Override
			public void eventOccured(NoteListDataEvent event) {
				// Not sure why the listener is being called in this case.
				// Not sure why this happens.
				System.out.println("Event occured: " + event);
			}
		});
	}
	
	/**
	 * @throws NullPointerException If <code>indicx</code> or <code>model</code>
	 *	  is null
	 */
	DefaultNoteListModel(DefaultNoteListModel model, int indicx) throws NullPointerException {
		// if (indicx < 0) {
			//		throw new IllegalArgumentException("Invalid indicx");
		// }

		this.model = model;
		model.listeners.add(new NoteListDataListener() {
			@Override
			public void eventOccured(NoteListDataEvent event) {
				// Not sure why the listener is being called in this case.
				// Not sure why this happens.
				System.out.println("Event occured: " + event);
			}
		});

		assertTrue("model.listeners.size() was unexpectedly decreased:",
				model.listeners.size() > indicx);
		index = indicx;
	}

	/**
     * @throws NullPointerException If <code>indicx</code> or <code>model</code>
     *	  is null
     */
	DefaultNoteListModel(int indicx) throws NullPointerException {
		this(new DefaultNoteListModel(indicx), indicx);
	}

	@Test
    public void test() {
        // TODO Auto-generated method stub

    }

	static DefaultNoteListModel makeModel() {
		return new DefaultNoteListModel(5);
	}

	static int makeIndex() {
		return 5;
	}

	static void init(AbstractNote model) {
		DefaultNoteListModel model1 = (DefaultNoteListModel) model;
		assertTrue("model.listeners.size() was unexpectedly increased: "
				+ model1.listeners.size(), model1.listeners.size() > 0);

		assertTrue("model.listeners.get(0).index was unexpectedly incremented: " + model
				+ " by " + model1.listeners.get(0).index, model1.listeners.get(0).index > 0);

	}

	static void destroy(AbstractNote model) {
		DefaultNoteListModel model1 = (DefaultNoteListModel) model;
		assertTrue("model1.listeners.size() was unexpectedly decreased: "
				+ model1.listeners.size(), model1.listeners.size() < 1);

		assertTrue("model1.listeners.get(0).index was unexpectedly increased: " + model
				+ " by " + model1.listeners.get(0).index, model1.listeners.get(0).index > 0);

		model1.model = null;
	}

	static Collection<AbstractNote> makeModelCollection() {
		List<AbstractNote> model = ListUtil.createList();
		model = model(new DefaultNoteListModel(5), model);

		return model;
	}

	private static <A extends AbstractNote> List<A> model(final DefaultNoteListModel model,
			final List<A> list) {
		model.model = this;

		model.listeners.add(new NoteListDataListener() {
			@Override
			public void eventOccured(final NoteListDataEvent event) {
				System.out.println("Event occured: " + event);

				// TODO: make an efficient (and efficient) implementation to use.
				for (AbstractNote elem : model.getValues()) {
					CollectionUtils.addAll(list, elem);
				}

				list.add(null);
			}
		});

		assertTrue("model.listeners.size() was unexpectedly decreased: "
				+ model.listeners.size(), model.listeners.size() > 0);

		return list;
	}
}