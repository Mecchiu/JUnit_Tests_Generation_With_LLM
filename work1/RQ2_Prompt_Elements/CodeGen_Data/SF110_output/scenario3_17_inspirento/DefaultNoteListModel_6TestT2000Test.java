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
/** Main method */
		public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List<Object> noteList = new ArrayList();
        for (int i = 0; i < 256; i++) {
            if ((i & 1) == 0)
                result: for (int ii = 0; ii < 3; ii++)
                    for (int j = 0; j < 3; j++) {
                        AbstractNote one = new AbstractNote(new Integer(i), j) {
                            public boolean equals(Object o) {
                                return false;
                            }

                        };
                        for (int jj = 1; jj < 3; jj++) {
                            AbstractNote other = new AbstractNote(new Integer(i), j) {
                            public boolean equals(Object o) {
                                return false;
                            }

                        };

                            // Test for equals()
                            public boolean equals(Object obj) {

                                if (obj!= null) {
                                    try {
                                        return this == obj;
                                    } catch (ClassCastException e) {

                                    }
                                }

                                try {
                                    return noteList.equals(obj);
                                } catch(ClassCastException e) {
                                }

                                return false;
                            }
                        };

                        boolean result = false;
						for (int jj = 0; jj < 3; jj++) {
							if (noteList.contains(other) && noteList.size() > 1) {
                                result = true;
								break result;
                              } else {
                                break results;
                              }
						}
                        continue results;
                    }
                    final Iterator<Object> it = noteList.iterator();
					// while (!it.hasNext())
					for (;it.hasNext();)
						noteList.add(it.next());
                if (noteList.size() > 1) {
					if (!noteList.remove(noteList.size() - 1)) {
                        System.out.println("Note list does not contain only one element.");
                        result = false;
                    }
                }
                System.out.println("NOTE LISTS: " + noteList);
            if (!noteList.contains(new AbstractNote(new Integer(i), 1)))
                continue result;
        }
        boolean result = true;
        for (final Iterator<Object> it = noteList.iterator(); it.hasNext();) {
            final AbstractNote one = (AbstractNote) it.next();
            System.out.println("  " + one.getName() + ": " + one.getValue());
            if (it.hasNext()) {
            } else {
            }
        }
        }
    }

    @Test
	public void testLastIndexOf() {
		final DefaultNoteListModel model = new DefaultNoteListModel();
		final List<Object> noteList = model.noteList;
		for (int i = 0; i < 256; i++) {
			model.lastIndexOf(new AbstractNote(new Integer(i), 1));
		}
		assertTrue("A note has been listed twice.", noteList.contains(new AbstractNote(new Integer(i), 1)));

	}

	@Test
	public void testLastIndexOf_2() {
		final DefaultNoteListModel model = new DefaultNoteListModel();
		final List<Object> noteList = model.noteList;
		model.lastIndexOf(new AbstractNote(new Integer(i), 2));
		assertTrue("A note has been listed twice.", noteList.contains(new AbstractNote(new Integer(i), 2)));
	}
}
