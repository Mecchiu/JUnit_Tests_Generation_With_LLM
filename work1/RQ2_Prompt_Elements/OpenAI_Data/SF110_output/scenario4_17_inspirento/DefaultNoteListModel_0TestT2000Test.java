// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {

		/**
		* Test case 1:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 0</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 0</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase1() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 0;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 2:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 1</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 1</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase2() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 1;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 3:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 2</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 2</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase3() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 2;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 4:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 3</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 3</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase4() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 3;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 5:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 4</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 4</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase5() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 4;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 6:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 5</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 5</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase6() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 5;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 7:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 6</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 6</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase7() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 6;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 8:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 7</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 7</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase8() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 7;
				
				// Act:
				defaultNoteListModel.capacity();
				
				// Assert:
				assertEquals(capacity, defaultNoteListModel.capacity());
		}
		
		/**
		* Test case 9:
		* The test case tests the method with the following inputs:
		* <ul>
		* <li>capacity = 8</li>
		* </ul>
		* <p>
		* The expected output is:
		* <ul>
		* <li>capacity = 8</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testCase9() throws Exception {
				// Arrange:
				DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
				int capacity = 8;
		