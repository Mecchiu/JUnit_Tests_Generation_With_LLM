// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
		/**
		* Test that an improper List of Strings is returned when no index is present,
		* and the returned list contains an empty value for key.
		*/
		@Test
		void improperListReturnsEmpty() {
			String expectedValue = null;
			List<String> actualList = new ArrayList<>();
			List<String> returnedList = EnumeratedProperties.getEnumeratedProperty(expectedValue, actualList);
			if (expectedValue == null) {
				assertEquals(expectedValue, returnedList.get(0));
			} else {
				assertEquals(expectedValue, returnedList.get(expectedListIndex(actualList))); 
			}
		}
		/**
		* Test that a non-null index is returned when a list contains an expected value.
		*/
		@Test
		void nonNullReturnsIndex() {
			String expectedValue = null;
			List<String> actualList = new ArrayList<>();
			List<String> returnedList = EnumeratedProperties.getEnumeratedProperty(expectedValue); 
			if (expectedValue == null) {
				assertEquals(actualList.get(expectedListIndex(actualList)), returnedList.get(0));
			} else {
				assertEquals(actualList.get(expectedListIndex(actualList)), returnedList.get(trueListIndex(actualList)), delimiter);      
			}
		}
		/**
		* Test that an improper List of Strings is returned when no actual value is present.
		*/
		@Test
		void improperListDoesNotReturnNullValue() {
			String expectedValue = null;
			List<String> actualList = new ArrayList<>();
			List<String> returnedList = EnumeratedProperties.getEnumeratedProperty(expectedValue, actualList);
			assertNull(returnedList);
		}
		/**
		* Test that a non-null index is returned when the actual list contains an actual value.
		*/
		@Test
		void nonNullReturnsIndex() {
			String expectedValue = null;
			List<String> actualList = new ArrayList<>();
			List<String> returnedList = EnumeratedProperties.getEnumeratedProperty(expectedValue); 
			actualList.add(expectedListIndex(returnedList));
			if (expectedValue == null) {
				assertEquals(actualList.get(expectedListIndex(actualList)), returnedList.get(0));
			} else {
				assertEquals(actualList.get(expectedListIndex(actualList)), returnedList.get(trueListIndex(actualList)), delimiter);      
			}
		}
	}