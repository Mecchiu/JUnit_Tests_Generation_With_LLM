// HtmlContentParserTest.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains one unit test case for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		HtmlContentParserTest() {
		}

		/**
	 * Gets a {@link Log} instance.
	 * <p/>
	 * @return {@link Log#getLogInstance() } a {@link Log} instance.
	 */
	Log log() {
        return log;
    }

    private Log log;

	/**
	 * Constructor.
	 */
	public HtmlContentParserTest() {
		this.log = LogFactory.getLog(this.getClass().getName());
    }

	/**
	 * Method for testing {@link #extractPlainText(String)} method with default character encoding.
	 * Tests the <code>text</code> parameter of the <code>HtmlContentParser</code>.
	 * @throws IOException if there is a problem testing the input stream.
	 * @see #extractPlainText(String)
	 */
	@Test
	public void testDefaultCharacterEncoding() throws IOException {
		// Create a template for testing.
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("org/asphodel/html/HtmlContentParserTest.html");
		String content = new String(
				new byte[] {
				(byte) 0xA0, (byte) 0xA1, (byte) 0xA2, (byte) 0xA3, (byte) 0xA4,
				(byte) 0xA5, (byte) 0xA6, (byte) 0xA7, (byte) 0xA8, (byte) 0xA9,
				(byte) 0xAE,
				}
		);
		Source source = new Source(0, inputStream);
		HtmlContentParser parser = new HtmlContentParser(ContentParserFactory.DEFAULT_CHARACTER_ENCODING);
		ContentParserException e = null;
		try {
			parser.extractPlainText(source);
		} catch (final ContentParserException cpe) {
			e = cpe;
		}
		assertEquals("Exception ", e, null);
		source = new Source(inputStream, 0);
		assertEquals("The plain text was not parsed correctly.", content,
				new String(new byte []{
					(byte) 0xA0, (byte) 0xA1, (byte) 0xA2, (byte) 0xA3, (byte) 0xA4,
					(byte) 0xA5, (byte) 0xA6, (byte) 0xA7, (byte) 0xA8,
					(byte) 0xA9, (byte) 0xAE,
				}), new String(new byte []{
				(byte) 0xA0, (byte) 0xA1, (byte) 0xA2, (byte) 0xA3, (byte) 0xA4,
				(byte) 0xA5, (byte) 0xA6, (byte) 0xA7, (byte) 0xA8,
				(byte) 0xA9, (byte) 0xAE}));
		// test the last characters : we don't check the first and last character of a chunked
	}

	/**
	 * Constructor.
	 * <p/>
	 * @param log {@link Log } logger instance for tests.
	 */
	public HtmlContentParserTest(Log log) {
		this.log = log;
	}

	/**
	 * Constructor.
	 * <p/>
	 * @param log {@link Log } logger instance.
	 * @param reader {@link InputStream} or {@link Reader } reader for testing.
	 */
	public HtmlContentParserTest(Log log, InputStream reader) {
		this.log = log;
		this.log.debug("HtmlContentParserTest.constructor input stream:" + reader);
		this.log.debug("HtmlContentParserTest.constructor input stream:" + content);
		this.log.debug("HtmlContentParserTest.constructor reader:" + reader);
		this.log.debug("HtmlContentParserTest.constructor input stream:" + content);
	}

	/**
	 * @throws IOException if there is a problem with input stream.
	 */
	void testInputStream() throws IOException {
		InputStream is = new InputStream(){
				@Override
				public int read() throws IOException {
					return 0;
				}
			};
		Reader reader = new Reader(){
				@Override
				public int read(byte[] buffer, int off, int len) throws IOException {
					return 0;
				}
			};
		source = new Source(0, is, 0);
		try {
			parser = new HtmlContentParser(Source.UTF_16);
			parser.extractPlainText(source);
        } catch (final ContentParserException e){
            System.out.println(e);
        }
	}

	@Test
	public void testInputStream() throws IOException, ContentParserException{
		testInputStream();
	}

	@Test
	public void testReader() throws IOException, ContentParserException{
		testInputStream();
	}

	@Test
	public void testInputstream() throws IOException, ContentParserException{
		testInputStream();
	}
};