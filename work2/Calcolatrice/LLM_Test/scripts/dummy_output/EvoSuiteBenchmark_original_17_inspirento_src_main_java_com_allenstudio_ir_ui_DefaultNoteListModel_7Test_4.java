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
		
    private int numberOfElements = 6;
    private AbstractNote[] elements=new AbstractNote[numberOfElements];
    private DefaultNoteListModel model;
    private NoteListDataListener listener;
    
    /**
     * This method initializes a new <code>DefaultNoteListModel</code> instance that
     * will perform, depending on the value of <code>initialValue</code>, three test cases:
     * The first one which initializes the model, and a second one which initializes the same object, and
     * a third one which initializes the objects in the list (and which initializes the default note), and the fourth one, is
     * started for that case.
     *
     * @param initValues the desired values of the initial component
     */
	private DefaultNoteListModel(int initValues) {
		int value;
        
        if (initValues==0) value=0; else if (initValues==1) value=1; else if (initValues==2) value=2; else if (initValues==3) value=3;
		
		listener=null;
		elements=new AbstractNote[value];
        
        for (int i=0; i<(value+1); i++) {
            elements[i] = new Note();
        }
    }


	@Test
    public void testEmptyList() {
		
        model = 
            new DefaultNoteListModel(Number.valueOf(0));
        
        try {
            listener.onDataChanged(new NoteListDataEvent(null, null, 0));
            
            assertNull(model.elements);
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
        
        assertNull(model.listener);
        assertFalse(model.listener == null); // default is not null
    }
    
    
	@Test
    public void testList() {
        
        boolean exceptionCaught=false;
        int count=0;
        
        try {
            listener = new DefaultNoteListDataListener();
            model =
                new DefaultNoteListModel(Number.valueOf(numberOfElements));
            
            count = 3;
            
            for (int i=0; i<numberOfElements; i++) {
                String value = (new StringBuilder()
                   .append(numberOfElements+i)
                   .append('\n')
                   .toString());
                elements[i] = createElement(value);
            }
            
            for (int i=0; i<count; i++) {
                listener.onDataChanged(new NoteListDataEvent(null, null, 0));
            }
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
        
        assertSame(collection, model.listener);
        assertNotSame(listener, model.listener);
        
        assertTrue(model.elements.length==2*count);
        
        // checking for correct elements in the model.
        for (int i=0; i<(count+1); i++) {
        	int i1=elements[i].getIndex();
            int i2=elements[i].getNoteListModel().lastIndexOf(elements[i], i1);
            assertEquals(i1, i2);
        }
        
        // checking for correct elements in the model.
        for (int i=count+1; i<numberOfElements; i++) {
            int i2=elements[i].getIndex();
            int i3=elements[i].getNoteListModel().lastIndexOf(elements[i], i2);
            assertEquals(i2, i3);
        }
        
        // checking the model's get() method
        assertEquals(elements[0], model.elements[0]);
        assertEquals(elements[1], model.elements[1]);
        checkCollection(model.elements, 3*numberOfElements);
        
        // checking the model's lastIndexOf() method
        if (elements[0]!= null) {
            lastIndexOf(elements[0], lastIndexOf(elements[0], 0), numberOfElements);
            lastIndexOf(elements[0], lastIndexOf(elements[0], numberOfElements-1), numberOfElements);
        }
        
        // checking the model's get() method
        assertNull(model.elements[0]);
        lastIndexOf(elements[1], lastIndexOf(elements[1], 0), numberOfElements);
        lastIndexOf(elements[1], lastIndexOf(elements[1], numberOfElements-1), numberOfElements);
        
        // checking the model's lastIndexOf() method
        if (elements[1]!= null) {
            lastIndexOf(elements[1], lastIndexOf(elements[1], 0), numberOfElements);
            lastIndexOf(elements[1], lastIndexOf(elements[1], numberOfElements-1), numberOfElements);
        }
        
        model.clear();
        assertNull(model.elements);
        
        exceptionCaught=false;
        try {
            model.elements[2];
            
            if (exceptionCaught) {
                fail("caught expected exception");
            }
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
        
        try {
            model.elements[3];
            
            if (exceptionCaught) {
                fail("caught expected exception");
            }
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
        
        try {
            model.elements[4];
            
            if (exceptionCaught) {
                fail("caught expected exception");
            }
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
        try {
            model.elements[5];
            
            if (exceptionCaught) {
                fail("caught expected exception");
            }
        } catch(Exception ignore) { unexpectedThrowable(ignore); }
    }
    
    
	private String createElement(String value) {
        
        return "<b>"+value+"</b>";
    }
    
    
    private void checkCollection(AbstractNote[] expected, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i=count; i-->0; ) {
            String element = expected[i].getId();
            builder.append("<b>");
            builder.append(element);
            builder.append("</b>");
        }
        String element = builder.toString();
        assertEquals(expected.length, count);
}
}