// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
class DefaultNote {
			public int index;
		}

    /**
     * test removeElement(AbstractNote) for this class
     * 
     * @test removeElement for given object
     * @since AllCore 5.0
     */
    @Test
    void removeElement_withAbstractNote_returnTrue() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        list.add("");
        assertTrue(model.removeElement(note));
    }

    /**
     * test removeElement(AbstractNote) for this class
     * 
     * @test removeElement for given object
     * @since AllCore 5.0
     */
    @Test
    void removeElement_withAbstractNote_returnFalse() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();

        assertFalse(model.removeElement(note));

        model.addElement(note);

        list.add("");
        assertFalse(model.removeElement(note));
    }

    /**
     * test addEvent for this class
     * 
     * @test addEvent for given object
     */
    @Test
    void addEvent_withAbstractNote_returnTrue() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        notificationEvent(NoteListDataEvent.class.getSimpleName(),
                "/addEvent(note)");

        list.add("");
        assertTrue(model.addEvent(((NoteListDataEvent) notificationEvent.get()).getObject()));

    }

    /**
     * test addEvent for this class
     * 
     * @test addEvent for given object
     */
    @Test
    void addEvent_withAbstractNote_returnFalse() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        assertFalse(model.addEvent(((NoteListDataEvent) notificationEvent.get()).getObject()));

        notificationEvent(NoteListDataEvent.class.getSimpleName(),
                "/addEvent(note)");

        list.add("");
        assertFalse(model.addEvent(((NoteListDataEvent) notificationEvent.get()).getObject()));
    }

    /**
     * test notifyListenersForRemoved for this class
     * 
     * @test notifyListenersForRemoved for given object
     * @since ALLEN_SCUD1_5_1
     */
    @Test
    void notifyListenersForRemoved_withAbstractNote_returnsList() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        model.removeElement(note);
        notificationEvent("removeEvent", "removeEvent");
        notifyListeners(note, "addEvent");
        notifyListeners(note, "notifyListenersForRemoved");

        assertEquals(1, list.size());

        list.add("");
        assertFalse(model.notifyListenersForRemoved(note));
    }

    /**
     * test notifyEvents for this class
     * 
     * @test notifyEvents for given object
     * @since ALLEN_SCUD1_5_1
     */
    @Test
    void notifyEvents_withAbstractNote_returnsList() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        model.notifyEvents(new NoteListDataEvent(list));

        assertEquals(1, list.size());

        list.add("");
        assertFalse(model.notifyEvents(new NoteListDataEvent(list)));
    }

    /**
     * test notifyAll for this class
     * 
     * @test notifyAll for given object
     * @since ALS-JAVA
     */
    @Test
    void notifyAll_withAbstractNote_returnsList() {
        final DefaultNote note = new DefaultNote();
        final DefaultListModel list = new DefaultListModel();

        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(note);

        model.notifyAll(new NoteListDataEvent(list));

        assertEquals(1, list.size());

        list.add("");
        assertFalse(model.notifyAll(new NoteListDataEvent(list)));
    }

    private NotificationEvent notificationEvent;

    private void notifyEvent(String notificationName) {
        assertNotNull("NotificationEvent was null.", notificationEvent);

        List<NotificationEvent> notifications = getNotifications();
        for (NotificationEvent notification : notifications) {
            if (notification.getClass().getSimpleName().equals(notificationName)) {
                return;
            }
        }

        NotificationEvent notification = new NotificationEvent(notebook, notificationName);
        notification.setNotification(notification);
        notification.execute();
    }

    private List<NotificationEvent> getNotifications() {
        return (List<NotificationEvent>) notificationEvent.get().getArgs()[0];
    }

    private DefaultNoteListModel model;
    private List<AbstractNote> notes;
}
