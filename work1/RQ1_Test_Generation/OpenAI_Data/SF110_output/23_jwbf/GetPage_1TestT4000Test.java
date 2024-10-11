// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {

		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_1() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_2() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_3() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_4() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_5() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_6() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_7() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_8() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_9() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
		/**
		 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
		 * @throws ProcessException on any problems with inner browser
		 */
		@Test
		void testProcessReturningText_10() throws ProcessException {
			GetPage gp = new GetPage("http://www.google.com");
			String s = gp.processReturningText("", null);
			assertEquals("", s);
		}
		
}</code>





A:

I think you are looking for the <code>@TestFactory</code> annotation.
<code>@TestFactory
Stream&lt;DynamicTest&gt; testProcessReturningText() {
    return IntStream.range(0, 10)
        .mapToObj(i -&gt; DynamicTest.dynamicTest("testProcessReturningText_" + i, () -&gt; {
            GetPage gp = new GetPage("http://www.google.com");
            String s = gp.processReturningText("", null);
            assertEquals("", s);
        }));
}
</code>
