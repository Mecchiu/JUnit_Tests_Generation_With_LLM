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
	 * This test class contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	 * The cases of the test are:
	 * <pre>
	 * {@link DefaultNoteListModel_8Test#initialize(java.util.Vector)}
	 * {@link DefaultNoteListModel_8Test#removeAll()}
	 * </pre>
	 */
	@Test
	public void initialize(final Vector testVec) {
		testVec.addElement(new DefaultNote("Test", "test content"));
	}
	
	/**
	 * This test class contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	 * The cases of the test are:
	 * <pre>
	 * {@link DefaultNoteListModel_8Test#initializeVector(java.util.Vector)}
	 * {@link DefaultNoteListModel_8Test#removeAll()}
	 * </pre>
	 */
	@Test
	public void initializeVector(final Vector testVec) {
		testVec.addElement(new DefaultNote("Test", "test content"));
	}
	
	/**
	 * This test class contains one unit test case for the {@link DefaultNoteListModel#add(AbstractNote, int)} method.
	 * The cases of the test are:
	 * <pre>
	 * {@link DefaultNoteListModel_8Test#addVector(java.util.Vector)}
	 * {@link DefaultNoteListModel_8Test#add(AbstractNote, int) }
	 * </pre>
	 */
	@Test
	public void addVector(final Vector testVec) {
		final DefaultNoteListModel model = new DefaultNoteListModel(testVec);
		assertNotNull(testVec);
		model.add("Test", 100);
		assertEquals(true, testVec.lastIndexOf("Test", testVec.size()-1));
		testVec.remove("Test");
		assertEquals(false, testVec.size()>=2);
		assertEquals(null, model.get(1));
		assertEquals(new DefaultNote("Test", "test content"), model.get(1));
		testVec.add("Test2", 100);
		assertEquals(true, testVec.lastIndexOf("Test", testVec.size()-1));
		testVec.remove("Test");
		assertEquals(false, testVec.size()>=2);
		assertEquals(null, model.get(1));
		assertEquals(new DefaultNote("Test2", "test content"), model.get(1));
		
	}
	
	/**
	 * This test class contains one unit test case for the {@link DefaultNoteListModel#addAll(java.util.Vector, java.lang.CharSequence)} method.
	 * The cases of the test are:
	 * <pre>
	 * {@link DefaultNoteListModel_8Test#addVector(java.util.Vector)}
	 * {@link DefaultNoteListModel_8Test#addAllCharSequence(java.util.Collection, java.lang.CharSequence) }
	 * </pre>
	 */
	@Test
	public void addAllCharSequence(final Vector testVec) {
		final DefaultNoteListModel model = new DefaultNoteListModel(testVec);
		assertNotNull(testVec);
		model.addAllString("Test", "Test", new String[]{ "Test", "Test2", "Test3" });
		assertEquals(3, model.size());
		assertEquals(true, testVec.lastIndexOf("Test", testVec.size()-1));
		assertEquals(false, testVec.lastIndexOf("Test", testVec.size()-2)<0);
		assertEquals(false, testVec.lastIndexOf("Test", testVec.size()-3)<0);
		assertEquals(new DefaultNote("Test", "test content"), model.get(0));
		assertEquals(new DefaultNote("Test2", "test content"), model.get(1));
		assertEquals(new DefaultNote("Test3", "test content"), model.get(2));
		assertEquals(new DefaultNote("Test4", "test content"), model.get(3));
	}
	
	/**
	 * This test class contains one unit test case for the {@link DefaultNoteListModel#addAll(java.util.Vector, java.lang.CharSequence)} method.
	 * The cases of the test are:
	 * <pre>
	 * {@link DefaultNoteListModel_8Test#addVector(java.util.Vector)}
	 * {@link DefaultNoteListModel_8Test#addAllCharSequence(java.util.Collection, java.lang.CharSequence) }
	 * </pre>
	 */
	@Test
	public void addAllCharSequence(final Vector testVec) {
		final DefaultNoteListModel model = new DefaultNoteListModel(testVec);
		assertNotNull(testVec);
		model.addAllString("Test", "Test", new String[]{ "Test", "Test2" });
		testVec.addAll("Test", "Test3", "Test4");
		assertEquals(3, model.size());
		assertEquals(true, testVec.lastIndexOf("Test", testVec.size()-1));
		assertEquals(false, testVec.lastIndexOf("Test", testVec.size()-2)<0);
		assertEquals(false, testVec.lastIndexOf("Test", testVec.size()-3)<0);
		assertEquals(new DefaultNote("Test", "test content"), model.get(0));
		assertEquals(new DefaultNote("Test2", "test content"), model.get(1));
		assertEquals(new DefaultNote("Test3", "test content"), model.get(2));
		assertEquals(new DefaultNote("Test4", "test content"), model.get(3));
		testVec.add("Test");
		testVec.add("Test2");
		testVec.add("Test3");
		testVec.add("Test4");
		assertTrue(testVec.lastIndexOf("Test", testVec.size()-1)<testVec.size()-3);
		assertTrue(testVec.lastIndexOf("Test", testVec.size()-2)<testVec.size()-2);
		assertEquals(new DefaultNote("Test", "test content"), model.get(0));
}
}