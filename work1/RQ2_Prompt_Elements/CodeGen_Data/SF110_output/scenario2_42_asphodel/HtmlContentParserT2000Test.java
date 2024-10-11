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
/**
  * @param inputStream the byte array of plain HTML string.
  * @return the text content of the plain HTML String. 
  */
    public String extractPlainText(InputStream inputStream) throws IOException, ContentParserException {
        Source contentSource = new Source(inputStream);
        return contentSource.extractText();
    }

    /**
  * @param reader the Reader of the plain HTML String.
  * @return the text content of the plain HTML String. 
  * @throws IOException if an error occurred while reading from the input stream 
  *       or if the {@link Source} object could not be loaded 
  */
    public String extractPlainText(Reader reader) throws IOException, ContentParserException {
        Source contentSource = new Source(reader);
        return contentSource.extractText();
    }

	/**
  * @param url the url of the file.
  * @return the text content of the plain HTML String. 
  * @throws IOException if an error occurred while reading from the input stream 
  *       or if the {@link Source} object could not be loaded 
  * @throws IllegalArgumentException if the url is null
  */
    public String extractPlainText(URL url) throws IOException, ContentParserException {
        throw new IllegalArgumentException(url);
    }

    /**
   * Test method for {@link HtmlContentParser#extractPlainText(InputStream)}
   * Test method to extract an plain XML tag. This method does not need to handle errors 
   * This class test the contentParser method. It will check that it parses the given file. 
   * @throws IOException
   */
	@Test
	public void testConstructorEmptyFile() throws IOException {
		try {
			new HtmlContentParser();
			fail("The HtmlContentParser should throw an IOException as "
			 	+ "the content must not be an empty string");
		} catch (ContentParserParseException cpe) {
            Log log = LogFactory.getLog(HtmlContentParserTest.class);
            log.info("The content at the path is supposed to be an empty string");
        }
	}

	/**
  * Test method for {@link HtmlContentParser#extractPlainText(InputStream)}
  * Test method to extract no html tag.
  */
	@Test
	public void testConstructorNonEmptyFile() throws IOException {
		try {
			new HtmlContentParser("HTML Content");
			fail("The content at the path must be an valid HTML string!");
		} catch (ContentParserParseException cpe) {
            Log log = LogFactory.getLog(HtmlContentParserTest.class);
            log.info("The content at the path is supposed to be an empty string");
            log.info("The content was not a valid HTML String!");
        }
	}

	/**
  * Test method for {@link HtmlContentParser#extractPlainText(Reader)}
  * Test method to extract no html tag.
  */
	@Test
	public void testConstructorNonEmptyReader() throws IOException {
		try {
			new HtmlContentParser("HTML Content");
			fail("The content at the path must be an valid HTML string!");
		} catch (ContentParserParseException cpe) {
            Log log = LogFactory.getLog(HtmlContentParserTest.class);
            log.info("The content at the path is supposed to be an empty string");
            log.info("The content was not a valid HTML String!");
        }
	}

	/**
   * Test method for {@link HtmlContentParser#extractPlainText(URL)}
   * Test method to extract no html tag.
   */
	@Test
	public void testConstructorNonEmptyUrl() throws IOException {
		try {
			new HtmlContentParser("HTML Content");
			fail("The content at the path must be an valid HTML string!");
		} catch (ContentParserParseException cpe) {
            Log log = LogFactory.getLog(HtmlContentParserTest.class);
            log.info("The content at the path is supposed to be an empty string");
            log.info("The content was not a valid HTML String!");
        }
	}
}
