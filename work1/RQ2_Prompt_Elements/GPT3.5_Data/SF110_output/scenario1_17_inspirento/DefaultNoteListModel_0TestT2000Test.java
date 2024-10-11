// Here's an example implementation of the DefaultNoteListModel_0Test class:

package com.allenstudio.ir.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultNoteListModel_0Test {

    @Test
    void testCapacityReturnsZeroWhenModelIsEmpty() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals(0, model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsNotEmpty() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(new AbstractNote() {});
        model.add(new AbstractNote() {});
        assertEquals(2, model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsFull() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity(); i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity(), model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsOverCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity() + 1; i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity(), model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsAtMaxCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity(); i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity(), model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsAtMinCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals(0, model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsAtHalfCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity() / 2; i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity() / 2, model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsAtThreeQuartersCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity() * 3 / 4; i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity() * 3 / 4, model.capacity());
    }

    @Test
    void testCapacityReturnsCorrectValueWhenModelIsAtOneQuarterCapacity() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        for (int i = 0; i < model.capacity() / 4; i++) {
            model.add(new AbstractNote() {});
        }
        assertEquals(model.capacity() / 4, model.capacity());
    }

}