// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
		
	private Vector<AbstractNote> notes1;
	private Vector<AbstractNote> notes2;
	

	private DefaultNoteListModel(Vector<AbstractNote> notes1, Vector<AbstractNote> notes2) {
		this.notes1 = notes1;
		this.notes2 = notes2;
	}
	

	@Test
    /* This is not an exhaustive test. */
	void test_containsReturnsTrue_WhenThereAreNoObjects(){
		assertNotNull(DefaultNoteListModel.contains(null));
	}
	
	
	@Test
    /* This is not an exhaustive test. */
	void test_containsReturnsFalse_WhenThereAreObjects(){
		
		boolean result1 = DefaultNoteListModel.contains(notes1);
		boolean result2 = DefaultNoteListModel.contains(notes1.iterator().next());
		
		assertTrue(result1);
		assertFalse(result2);
	}
	
	
	@Test
    /* This is not an exhaustive test. */
	void test_clear(){
		DefaultNoteListModel.createTestData();
		
		DefaultNoteListModel.clear();
		
		assertTrue(DefaultNoteListModel.contains(notes1));
		assertFalse(DefaultNoteListModel.contains(notes1.iterator().next()));
	}

	
	@Test
	void generateTestData() {
		
		assertNotNull(this.notes1);
		assertNotNull(this.notes2);
		
		List<AbstractNote> notes2List = this.notes2.toArray(new AbstractNote[0]);
		
		/* generate the sequence of objects to be made into test data */
		Vector<AbstractNote> test_data = DefaultNoteListModel.generateTestData();
		
		/* generate the data to be compared with */
		assertEquals(test_data, this.notes1);
	}
	
	
	@Test
	void createTestData(){
		
		List<AbstractNote> not_existed = new Vector<AbstractNote>();
		
		
		
		NotExistException result = null;
		try {
			TestGeneratedNotes generated = DefaultNoteListModel.createTestData(new Object[]{}, not_existed);
			fail("The test failed, expected to create a NotExistException");
		} catch (NotExistException e) {
			result = e;
		}
		
		assertEquals("List of Object with Id <null> has to be empty, it has  the id <null>",
				result,
				new NotExistException("The list of objects have not been created successfully"));
	}

	
	// Test data
	private static List<Object[]> createTestData(Object[] originalData1, Object[] originalData2) {
		
		List<AbstractNote> not_existed = new Vector<AbstractNote>();
		List<Object[]> test_data = new Vector<Object[]>();

		
		NotExistedException result = null;
		try {
			NotExistException saved_result = AbstractNoteListTestService.get_NotExist_Service().deleteExistNotExist(notes1);
			if (saved_result == null) {
				test_data = originalData1;
			} else {
				test_data = new Vector<Object[]>();
				test_data.add(Arrays.copyOf(originalData1, originalData1.length));
				test_data.add(Arrays.copyOf(originalData2, originalData2.length));
			}
		} catch (NotExistException e) {
			result = e;
		}
		
		assertEquals("The test failed, expected to create a NotExistException", result, saved_result);
		
		return test_data;
	}
	
	
	// Generate
	private List<Object[]> generateTestData(){
		
		List<Object[]> test_data = createTestData(notes1.toArray(new Object[0]), not_existed.toArray(new Object[0]));
		
		return test_data;
	}

}