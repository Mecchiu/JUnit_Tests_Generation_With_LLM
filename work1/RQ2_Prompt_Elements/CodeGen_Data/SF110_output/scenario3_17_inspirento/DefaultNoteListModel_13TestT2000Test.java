// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {

    static class TestData {
        int position;
        int elementIndex;
    }
    /**
     * Tests the method <code>get(int index)</code> of <code>DefaultNoteListModel</code>.
     */
    @Test
    public void get_withIndex_returnsElement() {
        DefaultNoteListModel listmodel = new DefaultNoteListModel();
        List<TestData> data = new ArrayList<>();
        AbstractNote note = get(3);
        addMockData(data, false);
        data.addAll(getMockData(note));
        assertEquals(data.get(3).elementIndex, 1);
        data.remove(4);
        assertEquals(data.get(4).elementIndex, 3);
        listmodel.addNote(3, new NoteListData(data));
        listmodel.flush(0);
    }
    
    private void addMockData(List<TestData> data, boolean addElement) {
        TestData tds = new TestData();
        tds.position = 1;
        data.add(tds);
        if (addElement){
            List<AbstractNote> elements = new ArrayList<>();
            tds.position = 3;
            AbstractNote note = new NoteListData();
            tds.elementIndex = 1;
            elements.add(note);
            listmodel.addNote(tds.position, elements);
        }
    }
    private AbstractNote getMockData(AbstractNote orig) {
        return new AbstractNote(orig.getTitle(), orig.getAuthor(), (String)orig.getContent(), false, true);
    }
}