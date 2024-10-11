// HttpBot_0Test.java
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
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
 /**
		 * Test the methods.
		 *
		 * @throws ProcessException
		 * 		when connection fail
		 * @throws MalformedURLException
		 * 		when connection fail
		 * @throws IOException
		 */
        @Test
		public void testGetPage(){
        TestUtils.doSimpleTest(TestPage.class);
		}
}

public class TestPage extends HttpBot implements ContentProcessable {

	public TestPage() {
		super(null);
	}

	public TestPage(final HttpActionClient cc) {
		super(cc);
	}

	public TestPage(final URL url) {
		this(new HttpActionClient(url));
	}

	public TestPage(final URL url, final ByteArrayContent content) {
		this(new HttpActionClient(url, content));
	}

	@Override
	public String getContent() {
		return null;
	}

	@Override
	public int getLength() {
		return 0;
	}

	@Override
	public byte[] getBytes() {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public synchronized String performAction(final String u) {
		return this.getClient().executePath(u);
	}

	@Override
	public synchronized byte[] getBytes(final String u) {
		return this.getClient().performMethod(u, null);
	}

	@Override
	public synchronized ContentProcessable processContent(
			final ContentProcessable content) throws ContentProcessException {
		return content;
	}

	@Override
	public final boolean isContentProcessable(){
		return true;
	}

	@Override
	public final boolean isContentProcessable(ContentProcessable content) {
		return true;
	}

	@Override
	public ContentProcessException processContentException(
			ContentProcessException ce) {
		return null;
	}

	@Override
	public Get get() {
		return null;
	}

	@Override
	public boolean getHasNext() {
		return false;
	}

	@Override
	public boolean getHasNext(String text) throws ContentProcessException {
		throw null;
	}

	@Test
	public final void testGetInstance() {
		final HttpBot bot = HttpBot.getInstance();
		assertNotNull(bot);
	}

	@Test
	public final void testGetBytes() {
		final URL url = new URL("foo:bar:3");
		final TestPage testPage = new TestPage(new HttpActionClient(url));
		assertNotNull(testPage);
		assertNull(testPage.getBytes());
	}

	@Test
	public final void testGetBytesWithoutContent()
			throws ActionException, ContentProcessException {
		this.setConnection(null);
		final String page = "myPage";
		final HttpActionClient cc = getClient().executePath(page);

		CCTestUtils.doSimpleTest(HttpBot.class, this.getClass(), this, cc);
	}

	@Override
	public void processContentException(final ContentProcessException ce) {
		throw ce;
	}
}
