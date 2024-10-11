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
/**
         * Main method.
		 *
		 * @param args ignored
		*/
        public static void main(String[] args) {
            AbstractNoteListModel model = new DefaultNoteListModel(new DefaultNoteModel());
            model.addListener(new NoteListDataListener() {
                public void noteUpdate(NoteListDataEvent event) {
                    System.out.println("update: " + event);
                }
            });
            
            
            System.out.println(model.get(0).getString());
            
            System.out.println(model.get(1).getString());
            
            System.out.println(model.get(2).getString());
            
        }
}