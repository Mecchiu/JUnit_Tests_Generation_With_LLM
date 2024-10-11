// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
    @Test
    void indexOf_5_DoesNotFindIfTheElementIsNotInTheList() {
      final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A")});
		
      assertEquals( -1, list.indexOf(new AbstractNote("A")));
    }
    
    @Test
    void indexOf_5_ReturnsCorrectPositionIfTheElementWasFound() {
      final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A")});
		
		assertEquals( 0, list.indexOf(new AbstractNote("A")));
    }
    
  @Test
    void indexOf_5_ReturnsCorrectPositionIfTheElementWasNotFound() {
      final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A")});
		
      assertEquals(-1, list.indexOf(new AbstractNote("E")));
    }
    
  @Test
    void indexOf_5_ReturnsTheLastPositionIfTheElementWasFound() {
      final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A"),
				new AbstractNote("B"), new AbstractNote("C")});
		
			assertEquals( 1, list.indexOf(new AbstractNote("A")));
			assertEquals( 1, list.indexOf(new AbstractNote("B")));
			assertEquals( 1, list.indexOf(new AbstractNote("C")));
    }
    
  @Test
  void indexOf_5_ReturnsTheFirstPositionIfTheElementWasNotFound() {
      final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A"),  
				new AbstractNote("E")});
		
      assertEquals(-1, list.indexOf(new AbstractNote("E")));
	}
  @Test
  void removeElement_5_RemovesIt() {
    final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A"),  
				new AbstractNote("B"),  
				new AbstractNote("C")});
       
    list.remove( new AbstractNote("C"));
	assertEquals( 1, list.size());
	
    assertEquals( 3, list.indexOf(new AbstractNote("A")));
    assertEquals( 3, list.indexOf(new AbstractNote("B")));
    assertEquals( 2, list.indexOf(new AbstractNote("C")));
    
    assertEquals( 0, list.indexOf(new AbstractNote("E")));
    
  }
  
	@Test
	void removeElement_5_Noop() {
		final List<AbstractNote> list = Arrays.asList(new AbstractNote[] {new AbstractNote("A"),  
				new AbstractNote("E")});

    list.remove( new AbstractNote("E"));
	assertEquals( 0, list.size());
		
    final List<AbstractNote> actualList = list.iterator();
    assertEquals(1, actualList.size());
    assertTrue(actualList.remove(new AbstractNote("E")));
    assertEquals(1, actualList.size());
	fail("removeElement expected to fail");
	
	//assertEquals( 0, list.size()); // should have no effect 
  }

}