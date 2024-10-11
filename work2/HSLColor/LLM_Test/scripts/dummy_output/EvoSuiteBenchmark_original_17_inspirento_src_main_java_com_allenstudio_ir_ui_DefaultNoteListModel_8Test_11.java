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
		
    /** Basic test for the {@link DefaultNoteListModel#elementAt(int)} method. */
    @Test
    void elementTo() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        ArrayList<AbstractNote> list = Arrays.asList(new AbstractNote("foo", Date.class));
        for (int i = 0; i < list.size(); i++) {
            AbstractNote newNote = list.get(i);
            if (i == 0){
                model.add(newNote);
            }else {
                assertEquals(newNote, model.elementAt(i));
            }
        }
        assertEquals(list, model.get(0));
    }



    @Test
    void get() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        final ArrayList<String> list = new ArrayList<String>();
        model.addAll(list);

        assertEquals(model.size(), list.size());
        assertEquals(model.size(), model.get(0).getText().length());
    }

    @Test
    void addAll() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        final ArrayList<AbstractNote> list = Arrays.asList(new AbstractNote("foo", Date.class));
        model.addAll(list);
        assertEquals(15, model.getLength());
    }

    @Test
    void addAt() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        final ArrayList<AbstractNote> list = Arrays.asList(new AbstractNote("foo", Date.class));
        model.addAt(2, list);
        assertEquals(1, model.get(2).getText().length());
    }

    @Test
    void remove() {
        DefaultNoteListModel model = new DefaultNoteListModel();

        final ArrayList<AbstractNote> list = Arrays.asList(new AbstractNote("foo", Date.class));
        model.addAll(list);

        assertEquals(list.size(), model.get(0).getText().length());
        assertEquals(list.size(), model.size());

        model.remove(0);
        assertEquals(list.size(), model.get(0).getText().length());
        assertEquals(list.size() == 1u? Integer.toString((int)model.get(0).getText()) : null, Integer.toString((int)model.get(0).getText()));

        assertTrue(model.isEmpty());
    }

    @Test
    void set() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.put(new AbstractNote("foo", Date.class));
        assertEquals(2, model.size());
    }

    @Test
    void removeAll() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.removeAll();

        ArrayList<String> list = new ArrayList<String>(model.get(0).getText());
        assertFalse(list.contains("foo"));
    }

    @Test
    void equals() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.set(0, "foo");
        model.set(1, "bar");

        assertTrue(model.equals(model));  // same model
        assertTrue(model.equals(new DefaultNoteListModel()));  // same model with no changes
        assertFalse(model.equals(new DefaultNoteListModel(new ArrayList<String>())));  // changed

    }

    @Test
    void toString() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        final StringBuilder result = new StringBuilder();
        model.append(0, "1");
        model.append(1, "2");
        model.append(2, "3");
        model.append(3, "4");

        final StringBuilder result1 = new StringBuilder();
        result1.append("");
        assertEquals("DefaultNoteListModel", result1.toString());

        final StringBuilder result2 = new StringBuilder();
        result2.append("");
        assertEquals("DefaultNoteListModel_2", result2.toString());
    }

    @Test
    void removeAll2() {
        ArrayList<AbstractNote> list1 = new ArrayList<AbstractNote>(Arrays.asList(new AbstractNote("1", Date.class)));
        ArrayList<AbstractNote> list2 = new ArrayList<AbstractNote>(Arrays.asList(new AbstractNote("2", Date.class)));

        DefaultNoteListModel model1 = new DefaultNoteListModel(list1);
        DefaultNoteListModel model2 = new DefaultNoteListModel(list2);

        assertTrue(model1.equals(model2));

        model1.removeAll();
        assertFalse(model1.equals(model2)); // model1 will remain

        model2.removeAll();
        assertFalse(model2.equals(model1)); // model1 will remain

    }

    @Test
    void removeAt() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        if (model.equals(model)) return;
        final ArrayList<AbstractNote> list = Arrays.asList(new AbstractNote("foo", Date.class));
        DefaultNoteListModel model0 = new DefaultNoteListModel(list);
        model.removeAt(1);
        assertEquals(Integer.toString((int)list.get(0).getText()), model.get(0).getText());

        model0.removeAt(2);
        assertTrue(model0.contains(new AbstractNote("2", Date.class)));
    }
}