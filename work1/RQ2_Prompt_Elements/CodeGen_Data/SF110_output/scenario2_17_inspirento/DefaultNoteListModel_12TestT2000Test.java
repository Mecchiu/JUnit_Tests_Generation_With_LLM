// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {

	@Test
    void test() throws Exception {
        ModelTestUtil.testClassUnderTest(this, DefaultNoteListModel.class);
    }
	

    
	
	Class<? extends AbstractNote> clazz;
	
	/**
	 * Creates a new instance of the list model.
	 * 
	 * @param clazz a class corresponding to the list model type.
	 */
	@SuppressWarnings("unused")
	public DefaultNoteListModel_12Test(Class<? extends AbstractNote> clazz ) {
		this.clazz = clazz;
	}
	
}
/**
 * Test constructor.
 */
class DefaultNoteListModel_2_0Test implements NoteListModel.NoteListModel_3_0Test{
	
	private String _key;
	{
		// empty constructor
	}
	public DefaultNoteListModel_2_0Test(String key) {
    _key = key;
  }
	/**
	 * Creates a new instance of the list model.
	 */
	@Override
	public void create() {
    
  }
  public void removeAt(int i) {
  }
  public AbstractNote get(int i) {
  return null;
  }
  public int size() {
  return 0;
  }
  public abstract AbstractNote[] getAll();
  
  
	
	/**
	 * Returns a array containing all of the elements in this list in the correct order.
	 *
	 * @return an array containing the elements of the list
	 * @see Vector#toArray()
	 */
	public String[] getEntries();
}
