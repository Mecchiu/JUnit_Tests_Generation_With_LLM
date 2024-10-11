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
		
    /**
     * Test method for {@link MainTable#getDataTable()}.
     */
    @Test
    public void testGetDataTable() {
        final DefaultNoteListModel listModel = new DefaultNoteListModel();
        final MainTable mainTable = new MainTable();
        
        listModel.addListener(new NoteListDataListener() {
            
            @Override
            public void noteListDataChanged(final NoteListDataEvent e) {
            }
            
            @Override
            public void noteListDataLoaded(final NoteListDataEvent e) {
                assertEquals(e.getIndex()+1, mainTable.getDataTable().size());
            }
            
            @Override
            public void noteListDataLoadedError(final Throwable t) {
            }
            
            @Override
            public void noteListDataLoadedFull(final Throwable t) {
            }
            
            @Override
            public void noteListDataLoadCompleted(final Throwable t) {}
            
            @Override
            public void noteListDataCompleted(final Throwable t) {}
            
        });
        
        final Map<Integer, List<Integer>> tableData = mainTable.getDataTable().getTableData();
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4}, tableData.keySet().toArray());
        assertEquals(5, tableData.get(0).size());
        assertEquals(5, tableData.get(2).size());
        assertEquals(5, tableData.get(4).size());
        
        tableData.values().forEach(
            (int index) -> {
                assertEquals(index + 1, mainTable.getDataTable().size());
                assertEquals(index + 1, mainTable.getDataTable().getIndexOfRow(index));
            }
        );
    }
}