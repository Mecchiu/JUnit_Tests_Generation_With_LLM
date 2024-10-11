// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		
    private final DefaultNoteListModel vector1 = new DefaultNoteListModel();
    
    @Test
    void initArray() {
        vector1.init();
        AbstractNote testObject1 = vector1.firstElement();
        assertNotNull(testObject1);
    }
    
    @Test
    void addToVector_WhenAlreadyExists_ThenNothingIsRemoved() {
        vector1.addToVector(TestObjectTypeTwo.INSTANCE);
        AbstractNote testObject1 = vector1.firstElement();
        assertNotNull(testObject1);
        AbstractNote testObject2 = vector1.firstElement();
        assertNotNull(testObject2);
        AbstractNote testObject3 = vector1.firstElement();
        assertNotNull(testObject3);
        assertNotEquals(null, testObject1);
        assertNotEquals(testObject2, testObject3);
        vector1.removeFromVector(vector1.firstElement());
        assertEquals(null, vector1.firstElement());
    }
    
    private static class TestObjectTypeTwo implements AbstractNote {
        
        private static final double TEST_FACTOR = 1;
        
        private static final double TEST_RATIO = TEST_FACTOR * 3;
        
        private static final Map<String, Double> TEST_VALUES = new HashMap<String, Double>();
        
        static {
            
            
            TEST_VALUES.put("keyOne", 1);
            TEST_VALUES.put("keyTwo", 2);
            TEST_VALUES.put("keyThree", 3);
            TEST_VALUES.put("keyFour", 4);
            TEST_VALUES.put("keyFive", 5);
            
            setUpTestObjectTypeTwo();
        }
        
        private void setUpTestObjectTypeTwo() {
            
            for (int r = 0; r < TEST_RATIO; r++)
                {
                    Vector<String> addList = new Vector<String>();
                    addList.add("keyOne");
                    addList.add("keyTwo");
                    addList.add("keyThree");
                    
                    vector1.addToVector(new TestObjectTypeTwo(addList));
                }
        }
        
        private static AbstractNote initTestObjectTypeTwo(Vector<String> vector) {
            
            AbstractNote testObject = new TestObjectTypeTwo();
            vector.add("keyOne");
            vector.add("keyTwo");
            vector.add("keyThree");
            return testObject;
        }
        
        public int compareTo(AbstractNote o) {
            
            return 0;
        }
        
        public void accept(NoteListDataListener notl) {
            
        }
        
        @Override
	public boolean equals(Object otherObject) {
            
            return false;
        }
    }
}