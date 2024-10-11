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
	 * Test method for {@link ghm.follow.config.EnumeratedProperties#getEnumeratedProperty(String, List)}.
	*/
	@Test
	void enumeratedPropertyTest() {
		String firstProperty = "first";
		String secondProperty = "second";
		List<String> second = new ArrayList<>();
		List<String> first = new ArrayList<>();
		
		EnumeratedProperties.getEnumeratedProperty(firstProperty, second, first);
		EnumeratedProperties.getEnumeratedProperty(firstProperty, second, first);
		EnumeratedProperties.getEnumeratedProperty(firstProperty, second, first);
		
		assertFalse(first.isEmpty());
		assertTrue(firstProperty.equals(first.get(0)));
		
		EnumeratedProperties.getEnumeratedProperty(secondProperty, first, first);
		EnumeratedProperties.getEnumeratedProperty(secondProperty, first, first);
		EnumeratedProperties.getEnumeratedProperty(secondProperty, first, first);
		
		assertFalse(first.isEmpty());
		assertTrue(secondProperty.equals(first.get(0)));
		
		EnumeratedProperties.getEnumeratedProperty(secondProperty, second, second);
		EnumeratedProperties.getEnumeratedProperty(secondProperty, second, second);
		
		assertFalse(first.isEmpty());
		assertFalse(second.isEmpty());
		
		assertSameItems(first, second);
		
		// Now, check other property lookup, with a list of strings -- list of lists
		List<List<String>> innerList = new ArrayList<>();
		innerList.add(new ArrayList<String>());
		innerList.add(new ArrayList<String>());
		
		List<String> list1 = new ArrayList<>();
		list1.add("test");
		list1.add("list1");
		// Now, test that the first list gets back the list values
		// (i.e., all strings converted to the same type -- not true that it is
		// the expected class).
		list1 = (List<String>)EnumeratedProperties.getEnumeratedProperty(firstProperty, innerList, list1);
		assertEquals("first", list1.get(0));
		
		list1 = (List<String>)EnumeratedProperties.getEnumeratedProperty(firstProperty, innerList, list1);
		assertSameElements(list1, list1);	
		assertEquals(firstProperty, list1.get(0));
		
		// Now, check the other property lookup with a List of Strings -- each member of the
		// list is converted to a List!
		List<List<String>> innerList2 = new ArrayList<>();
		List<String> firstList = new ArrayList<>();
		firstList.add("test");
		firstList.add("LIST1");
		
		List<String> list2 = (List<String>)EnumeratedProperties.getEnumeratedProperty(firstProperty, innerList2, firstList);
		assertNotNull("List of strings -> null was cast to List<String>", list2);
		assertEquals("List size -> 0", 0, list2.size());
		assertSameElements(list2, list2);
		assertNotNull("first list -> null was cast to List<String>", list1);
		assertEquals("first list size", 2, list1.size());
		
		list1 = (List<String>)EnumeratedProperties.getEnumeratedProperty(firstProperty, innerList2, list1);
		assertSameElements(list1, list1);
		assertNotNull("first list -> null was cast to List<String>", list2);
		assertEquals("first list size", 1, list2.size());
		
		list2 = (List<String>)EnumeratedProperties.getEnumeratedProperty(firstProperty, innerList2, list2);
		assertNotNull("LIST1 -> null was cast to List<String>", list1);
		assertNotNull("LIST2 -> null was cast to List<String>", list2);
		assertSameElements(list1, list1);	
		assertSameElements(list2, list1);
	}

}