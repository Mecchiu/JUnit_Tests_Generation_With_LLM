// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
     * Constructs a <code>DefaultNoteListModel</code> object.
     */	
    public DefaultNoteListModel_2Test() {
		
    }
	
    /**
     * Tests the <code>elements</code> method.
     */

    @Test
    public void testEnumeration1() {

        DefaultNoteListModel<AbstractNote> noteListModel = getDefaultNoteListModel();
		
        Enumeration<AbstractNote> enumeration = noteListModel.elements();
        
        Collection<AbstractNote> enumerationCollection = new LinkedHashSet<>();
        HashSet<AbstractNote> enumerationHashSet = new HashSet<>();
        
        while ( enumeration.hasMoreElements()) {
            
            enumerationCollection.add( enumeration.nextElement());
            
            enumerationHashSet.add( enumeration.nextElement());
        }
        
        assertEquals("List enumeration of the component list did not match." +
                     enumerationCollection + " " + enumerationHashSet,
                     2, enumerationCollection.size());
	}
    
    /**
     * Tests the <code>removeAll</code> method for the <code>elements</code> method.
     */

    @Test
    public void testRemoveAll() {

        DefaultNoteListModel<AbstractNote> noteListModel = getDefaultNoteListModel();
        
        String testId = "TEST_ID";
        boolean testDefaultNote = true;
        
        Iterator<AbstractNote> enumerationCollection = noteListModel.elements();
        AbstractNote testDefaultNote1 = new DefaultNote();
        
        List<AbstractNote> enumerationCollection1 = new LinkedList<>();
        enumerationCollection1 = new LinkedList<>();
        enumerableRemove( enumerationCollection, testDefaultNote);
        if (!testDefaultNote) enumerationCollection1.add(testDefaultNote1);
        enumerationCollection1.add(testDefaultNote);
        assertEquals("List enumeration did not match. " + enumerationCollection + " " + enumerationCollections,
                     2, enumerationCollection1.size());
        
        boolean testRemoveAllDefaultNote = false;
        
        boolean testIdFound = false;
        Enumeration<AbstractNote> enumerationSearch = enumerationCollection1.elements();
        Collection<AbstractNote> enumerationSearchCollection = new LinkedHashSet<>();
        while ( enumerationSearch.hasMoreElements()) {
            testIdFound = ( (AbstractNote) enumerationSearch.nextElement()).equals(testId);
            enumerationSearchCollection.add( enumerationSearch.nextElement());
        }
        assertTrue("Id of default note did not match.", testIdFound);
        
        enumerableRemove( enumerationCollection, false);
        Iterator<AbstractNote> enumerationSearchDefaultNote = enumerationSearchCollection.iterator();
        while ( enumerationSearchDefaultNote.hasNext()) {
            testIdFound = ( (AbstractNote) enumerationSearchDefaultNote.next()).equals(testId);
            enumerationSearchDefaultNote = enumerationSearchDefaultNote.hasNext()? enumerationSearchDefaultNote.next(): enumerationSearchDefaultNote.nextElements().iterator();
            enumerableRemove( enumerationSearchDefaultNote, testDefaultNote);

            if (!testDefaultNote)
                enumerationCollection1.add(testDefaultNote1);
            
            if (!testIdFound)
                enumerationCollection1.add(testId);
        }
        enumerableRemove( enumerationSearchDefaultNote, testDefaultNote);
        int enumerationCollection1EnumerateCount = enumerationCollection1.size();

        assertTrue("Collection does not match enumeration1.",
                enumerationCollection1EnumerateCount == 1);
        
        enumeratorRemove(enumerationCollection, enumerationCollection1);
        int enumeratorCollection1ElementsNumber = enumerationCollection1.size();

        assertTrue("Collection does not match enumerator2.",
                enumeratorCollection1ElementsNumber == 1);
        
        enumerableRemove(enumerationCollection, testDefaultNote);
        int enumerableCollection1ElementsNumber = enumerableCollection1.size();
        assertTrue("Collection does not match enumerable.",
               enumerableCollection1ElementsNumber == 0);
        
    }
    
    /**
     * Iterator with the list.
     */
    protected Iterator<AbstractNote> enumerableIterator3(){

        DefaultNoteListModel<AbstractNote> noteListModel = getDefaultNoteListModel();
        for (AbstractNote e : noteListModel.elements())
            ;

        return noteListModel.elements().iterator();

    }
    
    /**
     * Returns an enumeration of the notes in the <code>iterator</code>
     * and clears out any other notes that already exist.
     * 
     * @param enumeration
     * @return an enumeration of the components of the model
     * @see Iterator#remove()
     * @see DefaultNoteListModel#listIterator()
     * @see DefaultNoteListModel#elements()
     */
    protected Iterator<AbstractNote> enumeratorIterator3(){

        DefaultNoteListModel<AbstractNote> originalNoteListModel = getDefaultNoteListModel();
        AbstractNote enumerable1 = null;
        AbstractNote enumerable2 = null;
        AbstractNote enumerable3 = null;
        AbstractNote enumerable4 = null;
        AbstractNote enumerable5 = null;
        
        for (Iterator<AbstractNote> iterEnum = originalNoteListModel.enumerableIterator(); iterEnum.hasNext();) {
            
            enumerable1 = iterEnum.next();
            if (!enumerable1.matchesWithId(testId)) continue;

            enumerable2 = new DefaultNote();
            enumerable2.setId(enumerable1.getId());
            enumerable4 = new DefaultNote();
            enumerable4.setId(enumerable2.getId());
            enumerable5 = new DefaultNote();
            enumerable5.setId(enumerable3.getId());
            
            iterEnum.next();
            
            enumerable3 = iterEnum.next();
            if (!enumerable3.matchesWithType(AbstractNote.class)) continue;
            
            enumerable3.addValue(enumerable1.index());
            enumerable3.addValue(enumerable2.index());
            enumerable3.addValue(enumerable4.index());
            enumerable3.addValue(enumerable5.index());
        }

        return enumerableIterator3();

    }
	
    /**
     * Constructs a default <code>NoteListModel</code> using the given list
     * as the data source.
     *
     * @return a default <code>NoteListModel</code>
     */
    protected DefaultNoteListModel<Object> getDefaultNoteListModel(){

        DefaultNoteListModel<Object> model = new DefaultNoteListModel<>(); // FIXME
        model.setID ("DefaultNoteListModel_2Test");

        model.elements(new DefaultNoteListModel.Iterator());

        return model;

    }
}