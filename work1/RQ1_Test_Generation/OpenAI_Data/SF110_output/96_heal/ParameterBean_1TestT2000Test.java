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
		* The expected result is 0.
		*/
		@Test
		void testSize_1() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(0, result);
		}
		
		/**
		* Test case 2 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "".
		* The expected result is 0.
		*/
		@Test
		void testSize_2() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(0, result);
		}
		
		/**
		* Test case 3 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is " ".
		* The expected result is 0.
		*/
		@Test
		void testSize_3() {
				ParameterBean param = new ParameterBean();
				String keywordString = " ";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(0, result);
		}
		
		/**
		* Test case 4 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a".
		* The expected result is 1.
		*/
		@Test
		void testSize_4() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(1, result);
		}
		
		/**
		* Test case 5 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b".
		* The expected result is 2.
		*/
		@Test
		void testSize_5() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(2, result);
		}
		
		/**
		* Test case 6 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b c".
		* The expected result is 3.
		*/
		@Test
		void testSize_6() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b c";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(3, result);
		}
		
		/**
		* Test case 7 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b c d".
		* The expected result is 4.
		*/
		@Test
		void testSize_7() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b c d";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(4, result);
		}
		
		/**
		* Test case 8 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b c d e".
		* The expected result is 5.
		*/
		@Test
		void testSize_8() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b c d e";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(5, result);
		}
		
		/**
		* Test case 9 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b c d e f".
		* The expected result is 6.
		*/
		@Test
		void testSize_9() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b c d e f";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(6, result);
		}
		
		/**
		* Test case 10 for {@link ParameterBean#size()} method.
		* This test case tests the size of the parameterBean when the keywordString is "a b c d e f g".
		* The expected result is 7.
		*/
		@Test
		void testSize_10() {
				ParameterBean param = new ParameterBean();
				String keywordString = "a b c d e f g";
				param = param.makeParameterBean(keywordString);
				int result = param.size();
				assertEquals(7, result);
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
		* The expected result is an empty ArrayList.
		*/
		@Test
		void testGetTableList_1() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);
				ArrayList result = param.getTableList();
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 2 for {@link ParameterBean#getTableList()} method.
		* This test case tests the tableList of the parameterBean when the keywordString is "".
		* The expected result is an empty ArrayList.
		*/
		@Test
		void testGetTableList_2() {
				ParameterBean param = new ParameterBean();
				String keywordString = "";
				param = param.makeParameterBean(keywordString);