// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains one unit test case for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		
	/**
	 * Unit test method for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
	 * @param dummy ASTNode
     * @return String representing the result of the operation
     */
	@Test
  public  void testAnalyze(ASTNode dummy) {
    assertNotNull("This method must always return a valid ASTNode object", dummy);
    assertTrue("Dummy object is not a instance of org.junit.jupiter.api.Test", dummy instanceof Test);
    assertNull("The returned String should be null for a valid ASTNode object", analyze(dummy));
    assertEquals("Returned string is empty for ASTNode object", "",analyze(new ASTNode(null)));
  }

  /**
  * Test method for {@link UILayoutDisplayAnalyzer#setFileName(String)}.
  */
  @Test
  public final void testSetFileName() {
     assertNotNull("This method must always return a String object", filename);

  }
}