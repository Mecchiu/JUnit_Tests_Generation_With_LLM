// HttpBot_3Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {
		
	static class Page1 {

		Page1() {
		}

		Page1(final Page page) {
			this.page = page;
		}

		Page page;

		@Override
		public String toString() {
			return "Page1{" + page + "}";
		}

	}

	static class Page2 {

		Page2() {
		}

		final Page page;

		public Page2(final Page page) {
			this.page = page;
		}

		@Override
		public String toString() {
			return "Page2{" + page + "}";
		}

	}

	static class Page3 {

		Page3() {
		}

		final Page page;

		final ContentProcessable content;

		public Page3(final Page page, final ContentProcessable c) {
			this.page = page;
			this.content = c;
		}

		@Override
		public String toString() {
			return "Page3[" + page + ", " + content + "]";
		}

	}

	static class Page4 {

		Page4() {
		}

		final String toString;
		final ContentProcessable content;

		public Page4(final ContentProcessable content) {
			this.content = content;
			this.toString = null;
		}

		@Override
		public String toString() {
			return "Page4{" + content + "}";
		}

	}

	static class Page6 {

		Page6() {
		}

		@Override
		public String toString() {
			return "Page6()";
		}

	}

	/**
	 * Test that it can handle the following cases:
	 * <ul>
	 * <li>No page to read (String)</li>
	 * <li>The host is empty</li>
	 * <li>the request is malformed</li>
	 * </ul>
	 */
	@Test
	public void badPage1() {
		Page1 page = new Page1();
		assertEquals("Page1{" + page + "}", page.toString());
	}

	/**
	 * Test that it can handle the following cases:
	 * <ul>
	 * <li>There is no request</li>
	 * <li>The response is malformed</li>
	 * </ul>
	 */
	@Test
	public void badPage2() {
		Page2 page = new Page2(page);
		assertEquals("Page2{" + page + "}", page.toString());
	}

	/**
	 * Test that it can handle the following cases:
	 * <ul>
	 * <li>There is no page</li>
	 * <li>The response is malformed</li>
	 * </ul>
	 */
	@Test
	public void badPage3() {
		Page3 page = new Page3();
		assertEquals("Page3{}", page.toString());
	}

	/**
	 * Test that it can handle the following cases:
	 * <ul>
	 * <li>There is no page</li>
	 * <li>The response is malformed</li>
	 * </ul>
	 */
	@Test
	public void badPage4() {
		Page4 page = new Page4();
		assertEquals("Page4{}", page.toString());
	}

	/**
	 * Test that it can handle the following cases:
	 * <ul>
	 * <li>There is no page</li>
	 * <li>The response is malformed</li>
	 * </ul>
	 */
	@Test
	public void badPage5() {
		Page6 page = content.toContent();
		assertEquals("Page6{}!", page.toString());
	}
	
}