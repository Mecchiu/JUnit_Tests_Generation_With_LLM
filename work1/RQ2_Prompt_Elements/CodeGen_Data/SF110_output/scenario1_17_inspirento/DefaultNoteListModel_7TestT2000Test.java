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
/**
		 * @since 2017-02-09
		 */
        static private Set<Integer> lastIndexSet = new HashSet<>(5);

    /**
     *
     * @since 2017-02-09
     */
	@Test
    void testLastIndexOf_0_1() {
        lastIndexSet.clear();
        AbstractNote item = new BasicNote(false,false,null,0);
        assertEquals(0,
                     delegate.lastIndexOf(item, 1)
                           );
        assertEquals(1,
                     delegate.lastIndexOf(item, 1));
        assertEquals(2,
                     delegate.lastIndexOf(item, 1));
        item.setIsEnabled(false);
        assertEquals(-1,
                     delegate.lastIndexOf(item, 1));
        assertEquals(-1,
                     delegate.lastIndexOf(item, -1));
        
    }
    
	/**
	 * @throws InterruptedException
	 *
	 * @since 2017-02-09
	 */
    @Test
    void testLastIndexOf_3() throws InterruptedException {
        AbstractNote item = new BasicNote(false,false,null,1);
        Set<Integer> expectedSet = new HashSet<>(5);
        Set<Integer> set = new HashSet<>(6);
        set.add(1);
        set.add(1);
        lastIndexSet.clear();
        assertEquals(expectedSet, set);
        assertEquals(0, lastIndexSet.size() );
        
    }

}
