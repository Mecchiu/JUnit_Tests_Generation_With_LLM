// ParameterBean_1Test.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains ten unit test cases for the {@link ParameterBean#size()} method.
*/
class ParameterBean_1Test {

		/**
		* Test case 1 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is empty.
		*/
		@Test
		void testSize_1() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(0, size);
		}
		
		/**
		* Test case 2 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word.
		*/
		@Test
		void testSize_2() {
				ParameterBean param = new ParameterBean();
				String keywordString = "test";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 3 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space.
		*/
		@Test
		void testSize_3() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test ";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 4 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma.
		*/
		@Test
		void testSize_4() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test, ";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 5 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period.
		*/
		@Test
		void testSize_5() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 6 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon.
		*/
		@Test
		void testSize_6() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 7 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon.
		*/
		@Test
		void testSize_7() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 8 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark.
		*/
		@Test
		void testSize_8() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 9 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark and an exclamation point.
		*/
		@Test
		void testSize_9() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?!";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
		
		/**
		* Test case 10 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark and an exclamation point and a single quote.
		*/
		@Test
		void testSize_10() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?!'";
				param = param.makeParameterBean(keywordString);
				int size = param.size();
				assertEquals(1, size);
		}
}

// ParameterBean_2Test.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains ten unit test cases for the {@link ParameterBean#getTableList()} method.
*/
class ParameterBean_2Test {
		
		/**
		* Test case 1 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is empty.
		*/
		@Test
		void testGetTableList_1() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(0, tableList.size());
		}
		
		/**
		* Test case 2 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word.
		*/
		@Test
		void testGetTableList_2() {
				ParameterBean param = new ParameterBean();
				String keywordString = "test";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 3 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space.
		*/
		@Test
		void testGetTableList_3() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test ";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 4 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma.
		*/
		@Test
		void testGetTableList_4() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test, ";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 5 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period.
		*/
		@Test
		void testGetTableList_5() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 6 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon.
		*/
		@Test
		void testGetTableList_6() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 7 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon.
		*/
		@Test
		void testGetTableList_7() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 8 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark.
		*/
		@Test
		void testGetTableList_8() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 9 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark and an exclamation point.
		*/
		@Test
		void testGetTableList_9() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?!";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
		
		/**
		* Test case 10 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is a single word with a space and a comma and a period and a colon and a semicolon and a question mark and an exclamation point and a single quote.
		*/
		@Test
		void testGetTableList_10() {
				ParameterBean param = new ParameterBean();
				String keywordString = " test,.:;?!'";
				param = param.makeParameterBean(keywordString);
				ArrayList tableList = param.getTableList();
				assertEquals(1, tableList.size());
		}
}

// ParameterBean_3Test.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains ten unit test cases for the {@link ParameterBean#getParameters(int)} method.
*/
class ParameterBean_3Test {
		
		/**
		* Test case 1 for {@link ParameterBean#getParameters(int)} method.
		* This test case tests the parameterNode of the parameterBean when the keywordString is empty.
		*/
		@Test
		void testGetParameters_1() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				ParameterNode pam = param.getParameters(0);
				assertEquals(null, pam);
		}
		
		/**
		* Test case 2 for {@link ParameterBean#getParameters(int)} method.
		* This test case tests the parameterNode of the parameterBean when the keywordString is a single word.
		*/
		@Test
		void testGetParameters_2() {
				ParameterBean param = new ParameterBean();
				String keywordString = "test";
				param = param.makeParameterBean(keywordString);
				ParameterNode pam = param.getParameters(0);
				assertEquals("ALL.ALL", pam.getColumnInfo());
				assertEquals("test", pam.getValue());
				assertEquals("AND", pam.getRelation());
				assertEquals(false, pam.getStype());
		}
		
		/**
		* Test case 3 for {@link ParameterBean#getParameters(int)} method.
		* This test case tests the parameterNode of the parameterBean when the keywordString is a single word with a space.
		*/
		@Test
		void