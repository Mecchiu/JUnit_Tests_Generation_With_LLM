// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		
	/**
	 * Run the Content() method test for the given Object.
	 *
	 * @throws Exception
	 */
	@Test
	public void testContent() throws Exception {
		ContextElement ctx = new ContextElement();
		String _content = ctx.getContent();
		assertEquals("the content is expected to be of type java.lang.String", "the content is of type string", _content);
	}

}