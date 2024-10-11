// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {

	/**
	 * Unit test for {@link FieldInfo#isValidValue(String)}.
	 */
	@Test
	public void testIsValidValue() {
		String value = "value";
		TreeMap<String, Object> expected = new TreeMap<String, Object>();
		expected.put("type", 1);
		expected.put("value", value);
		assertEquals("Incorrect map is returned for valid value", expected, new TreeMap<String, Object>());
		value = "value2";
		unknownValue(value);
	}

	/**
	 * Unit test for {@link FieldInfo#notValidValue()}.
	 */
	@Test
	public void testNotValidValue() {
		unknownValue("value");
	}

	/**
	 * Unit test for {@link FieldInfo#notValidValue(String)}.
	 */
	@Test
   public void testNotValidValue2()
	{
		string("value");
		unknownValue(string("value2"));
	}

   /**
	 * Unit test for {@link FieldInfo#unknownValue(String)}.
	 * @throws IllegalArgumentException
	 */
   @Test
   public void testUnknownValue(@SuppressWarnings("unused") String key)
   {
       unknownValue(string("value"));
   }
   

 /**
  * Unit test for {@link FieldInfo#unknownValue(String)}.
  * @throws IllegalArgumentException
	 */
  @Test
  public void testNoSuchValue()
	{
		unknownValue("value2");
  }
}