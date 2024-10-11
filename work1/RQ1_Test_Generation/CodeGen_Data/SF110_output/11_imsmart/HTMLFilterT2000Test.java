// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
/**
		* String with the filter test as parameters.
		*/
	public final String testString = "<HTML><B>Hello, I'm </B>" +
	"<b>World!</b></HTML>";
	/**
	* String with the filter test as result.
	*/
	public final String testResult = "This content is " +
	"HTML filtered by HTMLFilter";




  /**
   * Test method for {@link HTMLFilter#filter(String)}.
   */
  @Test
  public final void testFilter() {
    assertTrue (filter(testString)!= null);
    assertTrue (filter(testString) + "!= Test.",
      filter(testString).equals(testResult));
  }
}


